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
<!-- pm에 넣을지 pm.criteria에 넣을지 어떻게 구별한거지? mapper에서도 cri... -->
	<form action="<%=request.getContextPath()%>/board/list">
		<div class="input-group mb-3">
	      <div class="input-group-prepend">
			<select class="form-control" name="type">
				<option value="1" <c:if test="${pm.criteria.type == 1}">selected</c:if>>전체</option>
				<option value="2" <c:if test="${pm.criteria.type == 2}">selected</c:if>>제목</option>
				<option value="3" <c:if test="${pm.criteria.type == 3}">selected</c:if>>내용</option>
				<option value="4" <c:if test="${pm.criteria.type == 4}">selected</c:if>>작성자</option>
			</select>
	      </div>
	      <input type="text" class="form-control" name="search" placeholder="Search" value="${pm.criteria.search}">
	      <div class="input-group-append">
   			 <button class="btn btn-success" type="submit">Go</button>
 		  </div>
	    </div>
	 </form>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>내용</th>
				<th>등록일</th>
				<th>조회수</th>	
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${list}" var="board">
			<tr>
				<td>${board.num}</td>
				<!-- ? = get 방식으로 데이터를 전달 -->
				<td><a href="<%=request.getContextPath()%>/board/detail?num=${board.num}&page=${pm.criteria.page}&type=${pm.criteria.type}&search=${pm.criteria.search}">${board.title}</a></td>
				<td>${board.writer}</td>
				<td>${board.content}</td>
				<td>${board.registerDate}</td>
				<td>${board.views}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	
	<a href="<%=request.getContextPath()%>/board/register">
	    <button type="button" class="btn btn-primary">글쓰기</button>
	</a>
	<ul class="pagination" style="justify-content: center;">
	    <c:if test="${pm.prev}">
	        <li class="page-item">
	            <a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${pm.startPage-1}&type=${pm.criteria.type}&search=${pm.criteria.search}">이전</a>
	        </li>
	    </c:if>
	    <c:forEach begin="${pm.startPage}" end="${pm.endPage}" var="index">
	        <li class="page-item <c:if test="${index == pm.criteria.page}">active</c:if>">
	        <!-- ${index}에 어떻게 page수가 잘 들어갈까. ${pm.criteria.page}현재페이지 번호. ${index}도 되는 이유는 뭘까 -->
	            <a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${index}&type=${pm.criteria.type}&search=${pm.criteria.search}">${index}</a><!-- index를 var와 맞춰준다 -->
	        </li>
	    </c:forEach>
	    <c:if test="${pm.next}">
	        <li class="page-item">
	            <a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${pm.endPage+1}&type=${pm.criteria.type}&search=${pm.criteria.search}">다음</a>
	        </li>
	    </c:if>
	</ul>
</body>
</html>