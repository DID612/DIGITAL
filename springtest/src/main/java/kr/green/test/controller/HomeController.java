package kr.green.test.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kr.green.test.service.UserService;
import kr.green.test.vo.UserVo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private UserService userService;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private JavaMailSender mailSender;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(ModelAndView mv) {
		//abcd1234의 이메일을 가져옴
		String id = "abcd1234";
		String email = userService.getEmail(id);
		System.out.println(email);
		UserVo user = userService.getUser(id);
		mv.setViewName("/main/home");
		return mv;
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginGet(ModelAndView mv) {
		mv.setViewName("/main/login");
		return mv;
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView loginPost(ModelAndView mv,String username, String password, HttpServletRequest request) {	
		UserVo isUser = userService.isUser(username, password);
		mv.addObject("user", isUser); // 가로채려면 전달이 있어야 해서 "user"에 isUser 전달
		if(isUser != null) {
			mv.setViewName("redirect:/");			
		}
		else {
			mv.setViewName("redirect:/login");	
		}
		return mv;
	}
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView signupGet(ModelAndView mv) {
		mv.setViewName("/main/signup");
		return mv;
	}
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public ModelAndView signupPost(ModelAndView mv, UserVo user) {
		boolean isSignup = userService.isSignup(user);
		if(isSignup) {
			//localhost:8080/test
			mv.setViewName("redirect:/");	
			//localhost:8080/test/signup. <= 보이는것만 home으로 보이는것! 실제는 왼쪽과 같음
//			mv.setViewName("/main/home");
		}
		else {
			mv.setViewName("redirect:/signup");	
		}
		return mv;
	}
	@RequestMapping(value = "/signout", method = RequestMethod.GET)
	public ModelAndView signOutGet(ModelAndView mv,HttpServletRequest request) {
		request.getSession().removeAttribute("user");
		mv.setViewName("redirect:/");
		return mv;
	}
	
	@RequestMapping(value = "/dup", method = RequestMethod.POST)
	@ResponseBody
	public String dupPost(String id) {
		UserVo user = userService.getUser(id);
		System.out.println(user);
		if(id ==null || id.equals(""))
			return "";
		if(user == null)
			return "not user";
		return "user";
	}
	
	@RequestMapping(value = "/find/pw", method = RequestMethod.POST)
	@ResponseBody
	public String findPwPost(String id) {
		/*
		 * HashMap<String, Object> map = new HashMap<String,Object>();
		 * System.out.println(id); UserVo user = userService.getUser(id);
		 * System.out.println(user);
		 * 
		 * if(user == null) { return map.put("result", "비회원"); }else { String pw =
		 * "1234"; user.setPw(pw); System.out.println(user.getPw());
		 * userService.updateUser(user); String setfrom = "q23dp1@gmail.com"; String
		 * tomail = user.getEmail(); // 받는 사람 이메일 String title = "이메일보내기테스트"; // 제목
		 * String content = "받앗닝?"; // 내용
		 * 
		 * try { MimeMessage message = mailSender.createMimeMessage(); MimeMessageHelper
		 * messageHelper = new MimeMessageHelper(message, true, "UTF-8");
		 * 
		 * messageHelper.setFrom(setfrom); // 보내는사람 생략하거나 하면 정상작동을 안함
		 * messageHelper.setTo(tomail); // 받는사람 이메일 messageHelper.setSubject(title); //
		 * 메일제목은 생략이 가능하다 messageHelper.setText(content); // 메일 내용
		 * 
		 * mailSender.send(message); } catch(Exception e){ System.out.println(e);
		 * map.put("result", "실패"); return map; } map.put("result", "성공"); }
		 */
		UserVo user = userService.getUser(id);
		if(user == null)
			return "fail";
		String pw = "1234";
		user.setPw(pw);
		userService.updateUser(user);
		String title = "비밀번호 변경 메일입니다.";
		String content = "새 비밀번호: " + pw;
		
		userService.sendMail(title, content, user.getEmail());
		
		
		
		return "success";
		
	}
}
