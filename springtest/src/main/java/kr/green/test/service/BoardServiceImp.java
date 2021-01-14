package kr.green.test.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.test.dao.BoardDao;
import kr.green.test.pagination.Criteria;
import kr.green.test.vo.BoardVo;
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return boardDao.getTotalCount();
	}
}
