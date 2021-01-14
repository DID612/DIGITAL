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

  <form action="/board/list" method="get">
    <div class="input-group mt-3 mb-3">
      <div class="input-group-prepend">
        <button type="button" class="btn btn-outline-secondary dropdown-toggle" data-toggle="dropdown">
          Dropdown button
        </button>
        <div class="dropdown-menu">
          <a class="dropdown-item" href="#" <c:if test="${cri.type == 1}">active</c:if>>전체</a>
          <a class="dropdown-item" href="#" <c:if test="${cri.type == 2}">active</c:if>>제목</a>
          <a class="dropdown-item" href="#" <c:if test="${cri.type == 4}">active</c:if>>내용</a>
          <a class="dropdown-item" href="#" <c:if test="${cri.type == 4}">active</c:if>>작성자</a>
        </div>
      </div>
      <input type="text" class="form-control -col6" placeholder="Username" value="${cri.search}">
      <button class="btn btn-success" type="submit">Go</button>  
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
				<td><a href="<%=request.getContextPath()%>/board/detail?num=${board.num}?type=${cri.type}?search=${cri.search}">${board.title}</a></td>
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
	            <a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${pm.startPage-1}?type=${cri.type}?search=${cri.search}">이전</a>
	        </li>
	    </c:if>
	    <c:forEach begin="${pm.startPage}" end="${pm.endPage}" var="index">
	        <li class="page-item <c:if test="${index == pm.criteria.page}">active</c:if>">
	        <!-- ${index}에 어떻게 page수가 잘 들어갈까. ${pm.criteria.page}현재페이지 번호. ${index}도 되는 이유는 뭘까 -->
	            <a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${index}?type=${cri.type}?search=${cri.search}">${index}</a><!-- index를 var와 맞춰준다 -->
	        </li>
	    </c:forEach>
	    <c:if test="${pm.next}">
	        <li class="page-item">
	            <a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${pm.endPage+1}?type=${cri.type}?search=${cri.search}">다음</a>
	        </li>
	    </c:if>
	</ul>
</body>
</html>