<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<!-- 보트컨트롤러는 서버!! -->
<div class="container">
  <c:if test="${board != null }">
	  <form action="/action_page.php">
	    <div class="form-group">
	      <label for="title">제목:</label>
	      <input type="title" class="form-control" id="title" name="title" readonly value="${board.title}">
	    </div>
	    <div class="form-group">
	     <label for="pwd">작성자:</label>
	      <input type="writer" class="form-control" id="writer" name="writer" readonly value="${board.writer}">
	    </div>
	      <div class="form-group">
	     <label for="registerDate">등록일:</label>
	      <input type="registerDate" class="form-control" id="registerDate" name="registerDate" readonly value="${board.registerDate}">
	    </div>
	    <div class="form-group">
	     <label for="views">조회수:</label>
	      <input type="views" class="form-control" id="registerDate" name="views" readonly value="${board.views}">
	    </div>
	    <div class="form-group">
	      <label for="content">내용:</label>
	      <textarea rows="10" class="form-control" rows="5" id="content" name="content" readonly value>${board.content}</textarea>
	    </div>
	  </form>
  </c:if>
  <c:if test="${board == null}">
  <h1>존재하지 않은 게시글입니다.</h1>
  </c:if>
</div>
	<a href="<%=request.getContextPath()%>/board/list">
		    <button type="button" class="btn btn-primary">목록</button>
	</a>
	<c:if test="${user != null && user.id == board.writer}">
			<!-- 수정버튼을 클릭할때 어떤 정보를 알려줄지 알려주기 위해 -->
		<a href="<%=request.getContextPath()%>/board/modify?num=${board.num}">
			    <button type="button" class="btn btn-primary">수정</button>
		</a>
		<a href="<%=request.getContextPath()%>/board/delete?num=${board.num}">
			    <button type="button" class="btn btn-primary">삭제</button>
		</a>
	</c:if>
</body>
</html>
