<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 이름을 input 태그에 입력받아 서버로 전송하여 서버에서 전송된 이름을 
	콘솔에 출력하세요. 단, 데이터를 보낼 때 변수의 이름을 name으로 설정하세요. 
	데이터를 get으로 보내고, 보낸 url은 /test2
	-->
	<h1>연습1</h1>
	<form action="<%=request.getContextPath()%>/test2">
		<input type="text" id="name2" name="name">
		${name2}
		<!-- id의 쓰임 고민해보자 -->
	</form>
	
	<!-- 
	학생 이름과 나이를 input 태그에 입력받아 서버로 전송하여 
	서버에서 해당 학생정보를 출력하세요. 단, 컨트롤러에서 TestVo를 이용하여 출력하세요.
	url은 test3로, mv.setViewName("/main/test2");
	-->
	<h1>연습2</h1>
	<form action="<%=request.getContextPath()%>/test3">
		<!-- TestVo의 멤버변수 이름과 name을 일치시켜야 한다. -->
		<p>이름을 입력해주세요.</p>
		<input type="text" name="name">
		<p>나이를 입력해주세요.</p>
		<input type="text" name="age">
		<button>제출</button>
		<div>결과값 : ${testVo}</div>
	</form>
	
	<!-- 
		학생 3명의 이름을 input태그에 입력받아 서버로 전송하여 서버에서 해당 학생
		이름들을 출력하세요. 단, 컨트롤러에서는 학생 이름을 배열로 입력받아 처리하세요.
		url은 /test4로, mv.setViewName("/main/test2")
	 -->
	<h1>연습3</h1>
	<form action="<%=request.getContextPath()%>/test4">
		<!-- TestVo의 멤버변수 이름과 name을 일치시켜야 한다. -->
		<p>이름을 입력해주세요. 1</p>
		<input type="text" name="name">
		<p>이름을 입력해주세요. 2</p>
		<input type="text" name="name">
		<p>이름을 입력해주세요. 3</p>
		<input type="text" name="name">

		<button>제출</button>
		<div>결과값 : ${name}</div>
	</form>
	
	<!-- 
		학생 3명의 이름을 input태그에 입력받아 서버로 전송하여 서버에서 해당 학생
		이름들을 출력하세요. 단, 컨트롤러에서는 학생 이름들을 하나의 문자열로 처리하세요.
		url은 /tes54로, mv.setViewName("/main/test2")
	 -->
	<h1>연습4</h1>
	<form action="<%=request.getContextPath()%>/test5">
		<!-- TestVo의 멤버변수 이름과 name을 일치시켜야 한다. -->
		<p>이름을 입력해주세요. 1</p>
		<input type="text" name="name">
		<p>이름을 입력해주세요. 2</p>
		<input type="text" name="name">
		<p>이름을 입력해주세요. 3</p>
		<input type="text" name="name">

		<button>제출</button>
		<div>결과값 : ${name}</div>
	</form>
</body>
</html>