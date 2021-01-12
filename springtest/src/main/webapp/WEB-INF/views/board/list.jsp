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
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>내용</th>
				<th>등록일</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${list}" var="board">
			<tr>
				<td>${board.num}</td>
				<!-- ? = get 방식으로 데이터를 전달 -->
				<td><a href="<%=request.getContextPath()%>/board/detail?num=${board.num}">${board.title}</a></td>
				<td>${board.writer}</td>
				<td>${board.content}</td>
				<td>${board.registerDate}</td	>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<a href="<%=request.getContextPath()%>/board/register">
	    <button type="button" class="btn btn-primary">글쓰기</button>
	</a>
</body>
</html>