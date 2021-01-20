package kr.green.spring.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import kr.green.spring.pagination.Criteria;
import kr.green.spring.vo.BoardVo;
import kr.green.spring.vo.FileVo;
import kr.green.spring.vo.LikeVo;

public interface BoardDao {

	ArrayList<BoardVo> getBoardList(@Param("cri")Criteria cri);

	BoardVo getBoard(@Param("num")Integer num);

	void insertBoard(@Param("board")BoardVo board);

	void updateBoard(@Param("board")BoardVo board);

	void updateViews(@Param("num")Integer num);

	int getTotalCount(@Param("cri")Criteria cri);

	void insertFile(@Param("num")int num, @Param("oriFilename")String originalFilename, @Param("filename")String fileName);
	//"filename" 과 데이터베이스의 'filename' 매개변수이름 일치시킬것 

	ArrayList<FileVo> getFileList(@Param("num")int num);
	//integer 대신 int로 넘겨봣음

	void deleteFile(@Param("num")int num);

	LikeVo getLike(@Param("like")LikeVo likeVo);

	void updateLike(@Param("like")LikeVo likeVo);

	void insertLike(@Param("like")LikeVo likeVo);
}
