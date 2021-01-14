package kr.green.test.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.test.pagination.Criteria;
import kr.green.test.pagination.PageMaker;
import kr.green.test.service.BoardService;
import kr.green.test.service.UserService;
import kr.green.test.vo.BoardVo;
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
	public ModelAndView boardDetailGet(ModelAndView mv, Integer num, Criteria cri) {
		boardService.Views(num);
		BoardVo board = boardService.getBoard(num);
		mv.addObject("cri", cri);
		mv.addObject("board",board);
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
	public ModelAndView registerPost(ModelAndView mv, BoardVo board) {
//		if(board.getTitle().length()>0) {
//			boardService.registerBoard(board);
//			mv.setViewName("redirect:/board/list");
//		}else {
//			mv.setViewName("redirect:/board/register");	
//		}
			boardService.registerBoard(board);
			mv.setViewName("redirect:/board/list");
			return mv;
	}
	
	@RequestMapping(value = "/board/modify", method = RequestMethod.GET)
	public ModelAndView modifyGet(ModelAndView mv, Integer num ,HttpServletRequest request) {
		BoardVo board = boardService.getBoard(num);
		mv.addObject("board",board);
		mv.setViewName("/board/modify");
		return mv;
	}
	
	@RequestMapping(value = "/board/modify", method = RequestMethod.POST)
	public ModelAndView modifyPost(ModelAndView mv, BoardVo board, HttpServletRequest request) {
		UserVo user = userService.getUser(request);
		boardService.modifyBoard(board, user);
		//이동이니까 redirect!!
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
}
