<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand/logo -->
  <a class="navbar-brand" href="/spring">홈</a>
  
  <!-- Links -->
  <ul class="navbar-nav">
  	<c:if test="${user == null}">
	  	<li class="nav-item">
	      <a class="nav-link" href="<%=request.getContextPath()%>/signup">회원가입</a>
	    </li>
	    <li class="nav-item">
	      <a class="nav-link" href="<%=request.getContextPath()%>/login">로그인</a>
	    </li>
	    <li class="nav-item">
	      <a class="nav-link" href="<%=request.getContextPath()%>/board/list">게시판</a>
	    </li>
	    	    <li class="nav-item">
	      <a class="nav-link" href="<%=request.getContextPath()%>/find/pw">비밀번호찾기</a>
	    </li>
	    
  	</c:if>
	<c:if test="${user != null}">
		<li class="nav-item">
	      <a class="nav-link" href="<%=request.getContextPath()%>/signout">로그아웃</a>
	    </li>
	    <li class="nav-item">
	      <a class="nav-link" href="<%=request.getContextPath()%>/board/list">게시판</a>
	    </li>
	    <c:if test="${user!= null && user.author > 9}">
		    <li class="nav-item">
		      <a class="nav-link" href="<%=request.getContextPath()%>/list2">회원 관리</a>
		    </li>
	    </c:if>
	    <li class="nav-item">
	      <a class="nav-link" href="<%=request.getContextPath()%>/mypage">마이페이지</a>
	    </li>
	</c:if>
  </ul>
</nav>