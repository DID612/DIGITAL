package kr.green.test.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import kr.green.test.pagination.Criteria;
import kr.green.test.vo.BoardVo;
import kr.green.test.vo.UserVo;

public interface BoardService {

	ArrayList<BoardVo> getBoardList(Criteria cri);

	BoardVo getBoard(Integer num);

	void registerBoard(BoardVo board);
	
	void modifyBoard(BoardVo board, UserVo user);

	void deleteBoard(Integer num, HttpServletRequest request);

	void Views(Integer num);

	int getTotalCount(Criteria cri);
}
