package kr.green.spring.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.green.spring.dao.UserDao;
import kr.green.spring.vo.UserVo;

@Service
public class UserServiceImp implements UserService{

	@Autowired
	UserDao userDao;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public String getEmail(String id) {
		return userDao.getEmail(id);
	}

	@Override
	public String getName(String id) {
		// TODO Auto-generated method stub
		return userDao.getName(id);
	}

	@Override
	public UserVo getUser(String id) {
		// TODO Auto-generated method stub
		return userDao.getUser(id);
	}

	@Override
	public int getAge(String id) {
		// TODO Auto-generated method stub
		return userDao.getAge(id);
	}

	@Override
	public ArrayList<UserVo> getAllUser() {
		// TODO Auto-generated method stub
		return userDao.getAllUser();
	}

	@Override
	public UserVo isUser(String id, String pw) {
		//Dao에게 id를 전달하여 회원정보 를요청합니다.
		UserVo user = userDao.getUser(id);
		//DB에서 가져온 회원정보의 비밀번호와 입력받은 비밀번호를 비교하여
		//같으면 true 다르면 false
		if(user == null) 
			//회원이 아닌 경우 넘겨줄 정보가 마땅히 없다.
			return null;
		System.out.println(user);
		System.out.println(pw);
		if(passwordEncoder.matches(pw, user.getPw())) {
			return user;
		}else {
			return null;
		}
	}

	@Override
	public boolean signUp(UserVo user) {
		//아이디가 중복되면 회원가입 실패를 알림
		//=> 아이디와 일치하는 정보를 DB에서 가져옴
		UserVo tmpUser = userDao.getUser(user.getId());
		//=> 가져온 회원 정보가 비어있으면 가입된 아이디=>아이디 중복 =>회원가입 실패
		//=> 가져온 회원 정보가 비어있으면(null) 가입되지 않은 아이디=>회원가입 가능
		if(tmpUser != null) {
			return false;
		}
		//아이디가 중복되지 않았으면 회원가입을 하고 성공을 알림
		//회원정보의 유효성 검사를 하여 유효성 검사에 맞지 않으면 실패를 알림
		//아이디 유효성 검사: 아이디가 입력 안되면 회원가입 불가능
		if(user.getId() == null || user.getId().length() == 0) {
			return false;
		}
		//비밀번호 유효성 검사 : 비밀번호가 입력 안되면 회원가입 불가능
		if(user.getPw() == null || user.getPw().length() == 0) {
			return false;
		}
		//비밀번호 암호화 과정
		//비밀번호 비밀번호
		String pw = user.getPw();
		//입력받은 비밀번호 암호화
		String encodePw = passwordEncoder.encode(pw);
		//회원 비밀번호를 암호화된 비밀번호로 수정
		user.setPw(encodePw);
		//회원가입 => user 테이블에 회원정보를 추가(insert)
		userDao.insertUser(user);
		
		return false;
	}

	@Override
	public UserVo getUser(HttpServletRequest request) {
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		return user;
	}
}
