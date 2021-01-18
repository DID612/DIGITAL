<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>게시글 등록</title>
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
<!-- classVo 받을때는 name이 매개변수 이름들과 같아야 한다 ~~ -->
  <form action="<%=request.getContextPath()%>/board/register" method="post" enctype="multipart/form-data">
    <div class="form-group">
      <label for="title">제목:</label>
      <input type="title" class="form-control" id="title" name="title">
    </div>
    <div class="form-group">
     <label for="pwd">작성자:</label>
      <input type="writer" class="form-control" id="writer" name="writer" readonly value="${user.id}">
    </div>
    <div class="form-group">
      <label for="content">내용:</label>
      <textarea rows="10" class="form-control" rows="5" id="content" name="content"></textarea>
    </div>
	    <div class="form-group">
	     <label for="files">첨부파일</label>
	      <input type="file" class="form-control" id="fList" name="fList">
	    </div> 
	    <div class="form-group">
	     <label for="files">첨부파일</label>
	      <input type="file" class="form-control" id="fList" name="fList">
	    </div> 
	    <div class="form-group">
	     <label for="files">첨부파일</label>
	      <input type="file" class="form-control" id="fList" name="fList">
	    </div> 

			<button type="submit" class="btn btn-primary">게시글 등록</button>

	<a href="<%=request.getContextPath()%>/board/list">
	    <button type="button" class="btn btn-primary">목록</button>
	</a>
  </form>
</div>
</body>
</html>
