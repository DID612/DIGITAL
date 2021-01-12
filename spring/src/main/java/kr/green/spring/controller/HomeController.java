package kr.green.spring.controller;

import java.text.DateFormat;
import java.util.*;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.spring.service.UserService;
import kr.green.spring.vo.UserVo;
//@ 어노테이션
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	UserService userService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	//url 노출되도 상관없으면 get 아니면 host. 밑에 코드는 host:8080/spring/까지 인식하고 처리하는 코드.
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView homeGet(ModelAndView mv, String name) {
		mv.setViewName("/main/login");
		return mv;
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView signUpGet(ModelAndView mv) {
		mv.setViewName("/main/signup");
		return mv;
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public ModelAndView signUpPost(ModelAndView mv,UserVo user) {
		System.out.println(user);
		//회원가입을 진행시키기 위해 userService에게 일을 시키기위한 메소드를 생성해보세요.
		boolean isSignUp = userService.signUp(user);
		if(isSignUp) {
			mv.setViewName("redirect:/login");
		}
			mv.setViewName("redirect:/signup");
		return mv;
//		return "redirect:/"; 기본 해당 url에 맞는 get 방식 실행
//		return "main/signup";
	}
//		model.addAttribute("변수명", "값")
//		값으로 문자열, 정수, 실수, 객체 등 다양한 값들을 보낼 수 있다.

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginGet(ModelAndView mv) {
		mv.setViewName("/main/login");
		return mv;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView loginPost(ModelAndView mv, String id, String pw) {
		//수정전 : id와 pw가 일치하는 회원이 있으면 true, 없으면 false를 가져옴
		
		//수정후: id와 pw가 일치하는 회원이 있으면 회원 정보를 가져오고,
		//없으면 null을 가져옴
//		boolean isUser = userService.isUser(id,pw);
		//id와 일치하는 회원 정보를 가져오는 코드
		UserVo isUser = userService.isUser(id, pw);
		
		mv.addObject("user", isUser);
		if(isUser != null) {
			mv.setViewName("redirect:/");// 로그인 성공시
			//localhost:8080/spring/
		}else {
			mv.setViewName("redirect:/login"); //로그인 실패시
		}
			//localhost:8080/stpring/login
			return mv;
	}
	
	@RequestMapping(value = "/signout", method = RequestMethod.GET)
	public ModelAndView signoutGet(ModelAndView mv, HttpServletRequest r) {
		//보통은 post에서만 보내는데 로그아웃하면 일단 화면을 바꿔야 하니까 redirect:/
		//세션에 저장된 user 정보를 삭제
		r.getSession().removeAttribute("user");
		mv.setViewName("redirect:/");
		return mv;
	}
}
