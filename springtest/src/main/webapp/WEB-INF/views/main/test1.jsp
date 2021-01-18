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
	이름 : ${name}
	나이 : ${age}
	<br><br>
	한번에 : ${testVo}
	<div>${testVo.name}, ${testVo.age}</div>
	<!-- /board/list.jsp에서 페이지네이션에서 사용했음 -->
	<c:forEach var="index" begin="${start}" end="${end}">
	 ${index}<br>
	</c:forEach>
	<!-- items list 중 특정 값을 정해서 뽑아내서 testlist란 이름으로 지정 -->
	<c:forEach var="testlist" items="${list}">
		<div>이름: ${testlist.name}</div>
		<div>나이: ${testlist.age}</div>
	</c:forEach> 
</body>
</html>