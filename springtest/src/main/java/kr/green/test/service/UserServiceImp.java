package kr.green.test.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.green.test.dao.UserDao;
import kr.green.test.vo.UserVo;

@Service
public class UserServiceImp implements UserService {
	@Autowired
	private UserDao userDao;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public String getEmail(String id) {
		UserVo user = userDao.getUser(id);
		//id와 일치하는 회원이 없으면
		if(user == null) {
			return null;
		}
		//id와 일치하는 회원이 있으면
		return user.getEmail();
	}
	
	@Override
	public UserVo getUser(String id) {
		UserVo user = userDao.getUser(id);
		return user;
	}

	@Override
	public UserVo isUser(String id, String pw) {
		UserVo user = userDao.getUser(id);
		if(user == null) {
			return null;//회원 아님
		}
		//매개변수 pw가 user의 암호화된 pw와 같은지 확인
		if(passwordEncoder.matches(pw, user.getPw())) {
			return user;			// 비밀번호가 같아서 회원
		}
		return null; // 비밀번호가 달라서 회원 아님
	}

	@Override
	public boolean isSignup(UserVo user) {
		UserVo tmp = userDao.getUser(user.getId());
		//회원가입시 암호 암호화
		String encPw = passwordEncoder.encode(user.getPw());
		user.setPw(encPw);
		if(tmp != null) {
			return false;
		}else{
			userDao.insertUser(user);
			return true;
		}
	}

	@Override
	public UserVo getUser(HttpServletRequest request) {
		// 여기서 "user" 세션 불러오는건강?
		return (UserVo)request.getSession().getAttribute("user");
	}
}