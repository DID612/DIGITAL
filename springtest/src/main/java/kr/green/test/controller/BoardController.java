package kr.green.test.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import kr.green.test.pagination.Criteria;
import kr.green.test.pagination.PageMaker;
import kr.green.test.service.BoardService;
import kr.green.test.service.UserService;
import kr.green.test.utils.UploadFileUtils;
import kr.green.test.vo.BoardVo;
import kr.green.test.vo.FileVo;
import kr.green.test.vo.LikeVo;
import kr.green.test.vo.TestVo;
import kr.green.test.vo.UserVo;

@Controller
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService boardService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	private String uploadPath = "D:\\kmy\\test\\upfile";
	
	@RequestMapping(value = "/board/list", method = RequestMethod.GET)
	// 현재 페이지 화면 정보를 받아옴(매개변수) : Criteria cri
	public ModelAndView boardListGet(ModelAndView mv, HttpServletRequest request, Criteria cri) {
		ArrayList<BoardVo> list = boardService.getBoardList(cri);
		int displayPageNum = 3;
//		int totalCount = boardService.getTotalCount();
		//서비스에게 전체게시글 수를 알려달라 한 뒤 저장
		//gettype setsearch만 해줘도 되지만 매개변수 하나 넘기는게 간단하니 cri
		int totalCount = boardService.getTotalCount(cri);
		PageMaker pm = new PageMaker(cri,displayPageNum,totalCount);
		mv.addObject("pm", pm);
		mv.addObject("list",list);
		mv.setViewName("/board/list");
		return mv;
	}
	//controller는 연결된 value의 매개변수 중에 이름이 같은 애가 있다면 다 들여온다!! 둘만의 약속
	@RequestMapping(value = "/board/detail", method = RequestMethod.GET)
	public ModelAndView boardDetailGet(ModelAndView mv, Integer num, Criteria cri, HttpServletRequest request) {
		boardService.Views(num);
		UserVo user = userService.getUser(request);
		BoardVo board = boardService.getBoard(num);
		//board.getNum 숫자 없어서 빈 문자열 가져올 수 있고 그것 때문에 에러 뜰 수 있으니 주의하자. num이 더 낫다.
		//로그인 한 경우에만 추천/비추천 정보를 가져와서 화면에 전달
		if(user != null) {
			LikeVo like = new LikeVo(num,user.getId());	
			LikeVo dbLike = boardService.getLike(like);
			System.out.println("/board/detail 추천정보: " + dbLike);
			mv.addObject("like", dbLike);
		}
		//null과 빈 문자열...
//		boardService.updateLike(likeVo);
		//board.getNum() 안하는 이유는 존재하지 않는 번호를 입력해 글을 불러왔을때 null 값을 board는 받게 되는데 null에서 값을 찾으면 nullbind에러
		ArrayList<FileVo> fList = boardService.getFile(num);
		mv.addObject("cri", cri);
		mv.addObject("board",board);
		mv.addObject("fList", fList);
		//내가 보내주는 정보를 "board"라는 이름으로 모아 받아.
		//mv.addObject("board",boardService.getBoard(num));
		mv.setViewName("/board/detail");
		return mv;
	}
	
	@RequestMapping(value = "/board/register", method = RequestMethod.GET)
	public ModelAndView registerGet(ModelAndView mv, HttpServletRequest request) {
		mv.setViewName("/board/register");
		return mv;
	}

	@RequestMapping(value = "/board/register", method = RequestMethod.POST)
	public ModelAndView boardRegisterPost(ModelAndView mv,BoardVo board, MultipartFile[] fList) throws IOException, Exception {
		boardService.registerBoard(board);
		// 첨부파일 배열에 첨부파일이 있으면
		// 화면에서 넘어온 파일이 있고, 파일명이 0글자가 아닐 떄
		if(fList != null && fList.length != 0){
			for(MultipartFile file: fList) {
				if(file!= null && file.getOriginalFilename().length() != 0) {
					String path = UploadFileUtils.uploadFile(uploadPath, file.getOriginalFilename(),file.getBytes());
					boardService.registerFile(board.getNum(), file.getOriginalFilename(), path);
				}
			}
		
			//파일을 업로드하고 업로드된 경로를 path에 저장
			
			//db에 첨부파일 정보를 추가
		}
		mv.setViewName("redirect:/board/list");
		return mv;
	}
		
	@RequestMapping(value = "/board/modify", method = RequestMethod.GET)
	public ModelAndView modifyGet(ModelAndView mv, Integer num ,HttpServletRequest request) {
		BoardVo board = boardService.getBoard(num);
		ArrayList<FileVo> fList = boardService.getFile(num);
		mv.addObject("board",board);
		mv.addObject("fList",fList);
		mv.setViewName("/board/modify");
		return mv;
	}
	
	@RequestMapping(value = "/board/modify", method = RequestMethod.POST)
	public ModelAndView modifyPost(ModelAndView mv, BoardVo board, HttpServletRequest request, MultipartFile[] fList) throws IOException, Exception {
		UserVo user = userService.getUser(request);
		//기존 첨부파일 삭제
		boardService.deleteFile(board.getNum(), user);
		boardService.modifyBoard(board, user);
		//새 첨부파일 업로드 및 db에 추가
		if(fList != null && fList.length != 0){
			for(MultipartFile file: fList) {
				if(file!= null && file.getOriginalFilename().length() != 0) {
					String path = UploadFileUtils.uploadFile(uploadPath, file.getOriginalFilename(),file.getBytes());
					boardService.registerFile(board.getNum(), file.getOriginalFilename(), path);
				}
			}
		
			//파일을 업로드하고 업로드된 경로를 path에 저장
			
			//db에 첨부파일 정보를 추가
		}
		mv.setViewName("redirect:/board/list");
		return mv;
	}
	
	@RequestMapping(value = "/board/delete", method = RequestMethod.GET)
	public ModelAndView deleteGet(ModelAndView mv, Integer num ,HttpServletRequest request) {
		boardService.deleteBoard(num, request);
		UserVo user=userService.getUser(request);
		mv.setViewName("redirect:/board/list");
		return mv;
	}
	
	@ResponseBody
	@RequestMapping(value = "/board/download")
	public ResponseEntity<byte[]> downloadFile(String filename)throws Exception{
	    InputStream in = null;
	    ResponseEntity<byte[]> entity = null;
	    try{
	        HttpHeaders headers = new HttpHeaders();
	        in = new FileInputStream(uploadPath+filename);

	        filename = filename.substring(filename.indexOf("_")+1);
	        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
	        headers.add("Content-Disposition",  "attachment; filename=\"" 
				+ new String(filename.getBytes("UTF-8"), "ISO-8859-1")+"\"");
	        entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in),headers,HttpStatus.CREATED);
	    }catch(Exception e) {
	        e.printStackTrace();
	        entity = new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
	    }finally {
	        in.close();
	    }
	    return entity;
	}
	
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public ModelAndView test1Get(ModelAndView mv) {
		/* 문제 : 서버에서 보낸 testVo 데이터를 이용하여 학생 이름과 나이를 화면에 
		 * 출력되도록 test1.jsp 코드를 수정해보세요.*/
		TestVo testVo = new TestVo("임꺽정", 17);
		mv.addObject("testVo",testVo);
		
		/* 문제 : 서버에서 보낸 start와 end 데이터를 이용하여 start부터 end 사이의 숫자가
		 * 출력되도록 test1.jsp 코드를 수정해보세요.*/
		mv.addObject("start",1);
		mv.addObject("end",5);
		 
		ArrayList<TestVo> list = new ArrayList<TestVo>();
		list.add(new TestVo("김철수", 20));
		list.add(new TestVo("김영희", 19));
		
		/* - 문제
		 *  - 서버에서 보낸 학생들 정보가 들어있는 list를 이용하여
		 *  학생들의 이름과 나이를 출력하는 코드를 test1.jsp에 수정해보세요.
		 *  
		 *  - c:forEach를 이용
		 * */
		
		mv.addObject("list", list);
		mv.setViewName("/main/test1");
		return mv;
	}
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public ModelAndView test2Get(ModelAndView mv, String name) {
		/*
		 *  첫 입력값이 null이 들어올 수 있는 경우가 많으니
		 *  염두해 두고 항상 코드를 짜자
		 * */
		System.out.println(name);
		mv.addObject("name",name);
		mv.setViewName("/main/test2");
		return mv;
	}
	@RequestMapping(value = "/test3", method = RequestMethod.GET)
	public ModelAndView test3Get(ModelAndView mv, TestVo testVo) {
		System.out.println(testVo);
		mv.addObject("testVo",testVo);
		mv.setViewName("/main/test2");
		return mv;
	}
	@RequestMapping(value = "/test4", method = RequestMethod.GET)
	public ModelAndView test4Get(ModelAndView mv, String[] name) {
		for(String tmp:name) {
			System.out.println("/test4 - 이름: " + tmp);
		}
		mv.addObject("name",name);
		mv.setViewName("/main/test2");
		return mv;
	}
	
	@RequestMapping(value = "/test5", method = RequestMethod.GET)
	public ModelAndView test5Get(ModelAndView mv, String name) {
		System.out.println("/test4 - 이름: " + name);
		String[] names = name.split(",");
		for(String tmp : names) {
			System.out.println("이름 : " + tmp);
		}
		mv.addObject("name",name);
		mv.setViewName("/main/test2");
		return mv;
	}
	
	@RequestMapping(value = "/board/like", method = RequestMethod.POST)
	@ResponseBody
	public String boardLikeGet(LikeVo likeVo) {
		// 기본생성자 안 만들면 LikeVo likeVo 할때 에러가 난다
		boardService.updateLike(likeVo);
		return "ok";
	}
	
}
