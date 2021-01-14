package kr.green.test.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import kr.green.test.vo.BoardVo;
import kr.green.test.vo.UserVo;
import kr.green.test.pagination.Criteria;

public interface BoardDao {
	ArrayList<BoardVo> getBoardList(@Param("cri")Criteria cri);
	
	//한번에 매개변수가 두개 이상 있으면 인식 못할 수도 있음, 이럴때 @Param
	//"num"라는 이름을 가진 애들을 다시 매개변수로 갈무리 함. Mapper와 "num2" 맞춰줘야함!! 
	BoardVo getBoard(@Param("num")Integer num);

	void registerBoard(@Param("board")BoardVo board);

//	왜 안될까? oriboard
	void updateBoard(@Param("board")BoardVo oriboard);

	void updateViews(@Param("num")Integer num);

	int getTotalCount(@Param("cri")Criteria cri);
	
}
