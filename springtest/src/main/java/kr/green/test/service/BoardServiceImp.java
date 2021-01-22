package kr.green.test.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.test.dao.BoardDao;
import kr.green.test.pagination.Criteria;
import kr.green.test.vo.BoardVo;
import kr.green.test.vo.FileVo;
import kr.green.test.vo.LikeVo;
import kr.green.test.vo.UserVo;

@Service
public class BoardServiceImp implements BoardService {
	@Autowired
	private BoardDao boardDao;

	@Override
	public ArrayList<BoardVo> getBoardList(Criteria cri) {
		// (수정)다오의 getBoardList()를 getgetBoardList(Criteria cri)로 수정
		return boardDao.getBoardList(cri);
	}

	@Override
	public BoardVo getBoard(Integer num) {
		if(num == null) {
			return null;
		}
		return boardDao.getBoard(num);
//		BoardVo board = boardDao.getBoard(num);
//		return board;
	}

	@Override
	public void registerBoard(BoardVo board) {
		boardDao.registerBoard(board);	
		return;
	}

	@Override
	public void modifyBoard(BoardVo board, UserVo user) {
		BoardVo oriBoard = boardDao.getBoard(board.getNum());
		if(oriBoard == null //번호에 해당하는 글이 없거나
			|| !oriBoard.getWriter().equals(board.getWriter()) //번호에 해당하는 글의 작성자가 보드 작성자와 다르거나
			|| !oriBoard.getWriter().equals(user.getId())) {
			return;
		}
		oriBoard.setTitle(board.getTitle());
		oriBoard.setContent(board.getContent());
		boardDao.updateBoard(oriBoard);
	}

	@Override
	public void deleteBoard(Integer num, HttpServletRequest request) {
		BoardVo oriBoard = boardDao.getBoard(num);
		if(oriBoard == null) {
			System.out.println(oriBoard);
			return;
		}
		if(num == null) {
			return;
		}
		oriBoard.setIsDel("Y");
		boardDao.updateBoard(oriBoard);
	}

	@Override
	public void Views(Integer num) {
		if(num == null)
			return;
		boardDao.updateViews(num);
	}

	@Override
	public int getTotalCount(Criteria cri) {
		//페이지네이션 기능: 다오에게 전체 게시글 ㅅ ㅜ를 요청
		//return boardDao.getTotalCount();
		
		//페이지네이션+검색 : 다오에게 전체 게시글이 아닌 현재 페이지 정보에
		//(검색타입,검색어 포함) 맞는 게시글을 가져오라고 요청하도록 수정
		return boardDao.getTotalCount(cri);
	}

	@Override
	public void registerFile(int num, String originalFilename, String path) {
		boardDao.registerFile(num, originalFilename, path);
		
	}

	@Override
	public ArrayList<FileVo> getFile(int num) {
		return boardDao.getFile(num);
	}

	@Override
	public void deleteFile(Integer num, UserVo user) {
		boardDao.deleteFile(num);
	}

	@Override
	public void updateLike(LikeVo likeVo) {
			LikeVo tmp = boardDao.getLike(likeVo);
			if(tmp ==null) {
				boardDao.insertLike(likeVo);
			}else {
				boardDao.updateLike(likeVo);
			}
//			/*
//			 * if(likeVo != null) boardDao.updateLike(likeVo); else if(likeVo == null){
//			 * boardDao.insertLike(likeVo); }
//			 */

	}

	@Override
	public LikeVo getLike(LikeVo like) {
		return boardDao.getLike(like);
		
	}
}
