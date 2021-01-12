package kr.green.test.service;

import javax.servlet.http.HttpServletRequest;

import kr.green.test.vo.UserVo;

public interface UserService {
	UserVo getUser(String id);

	String getEmail(String id);

	boolean isSignup(UserVo user);

	UserVo isUser(String id, String pw);
	
	UserVo getUser(HttpServletRequest request);
}
