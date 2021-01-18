<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>게시글 수정</title>
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
	<c:if test="${board != null && board.writer == user.id}">
	  <form action="<%=request.getContextPath()%>/board/modify" method="post" enctype="multipart/form-data">
	    <div class="form-group">
	    <input type="hidden" name="num" value="${board.num}"> <!-- 칸 안만들고 왼쪽도 됨, 숫자가 없어서 못가져가서 못비교중이엇음 -->
	    <div class="form-group">
	      <label for="title">제목:</label>
	      <input type="title" class="form-control" id="title" name="title" value="${board.title}">
	    </div>
	    <div class="form-group">
	     <label for="pwd">작성자:</label>
	      <input type="writer" class="form-control" id="writer" name="writer" readonly value="${user.id}">
	    </div>
	    <div class="form-group">
	      <label for="content">내용:</label>
	      <textarea rows="10" class="form-control" rows="5" id="content" name="content">${board.content}</textarea>
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
	    <c:if test="${fList.size() != 0 }">
		<div class="form-group">
			<label for="fList">기존 첨부 파일:</label>
			<c:forEach var= "file" items="${fList}">
				<div>
					<a href="<%=request.getContextPath()%>/board/download?filename=${file.filename}">
					${file.oriFilename}
					</a>
				</div>
			</c:forEach>
		</div>
	    </c:if>
	  </form>
	</c:if>
	
	<c:if test="${board == null || board.writer != user.id}">
		<h1>존재하지 않은 게시글이거나 작성자가 아닙니다.</h1>
	</c:if>
		
	<button type="submit" class="btn btn-primary">수정</button>
		
	<a href="<%=request.getContextPath()%>/board/list">
		<button type="button" class="btn btn-primary">목록</button>
	</a>
</div>
<!-- script 콘솔은 콘솔창이 아니라 브라우저 창을 의미한다. 말하자면 브라우저 콘솔 -->
<script type="text/javascript">
	$(function(){
		/*
		submit()은 return 값이 true이면 submit을 진행하고, false이면
		진행하지 않는다. 즉, return이 true이면 서버로 데이터를 전송하고.
		false이면 서버로 데이터를 전송하지 않는다.
		*/
		$('form').submit(function(){
			/*첨부파일의 파일명을 가져와서 콘솔에 출력하는 코드
			input[name=fileList]
			*/
			/* var[] fileName = $('input#fList').eq(0).val();
			var fileName2 = $('input#fList').eq(1).val();
			var fileName3 = $('input#fList').eq(2).val();		
			var test1 = $('선택자').eq(0).val();
			var test2 = $('선택자').eq(1).val();
			var test3 = $('선택자').eq(2).val();
			console.log(fileName);
			console.log(fileName2);
			console.log(fileName3); */
			
			/* 파일명이 빈 문자열인 ''와 같지 않으면(추가된 첨부파일이 있으면 갯수를 증가'*/
			var cnt = 0;
			$('input#fList').each(function(){
				var fileName = $(this).val()
				if(fileName != ''){
					cnt++;
				}
				console.log(fileName);
			})
			if(cnt == 0){
				return confirm('선택된 첨부파일이 없습니다. 수정하시겠습니까?');
			}
			return true;
		})
	})
</script>
</body>
</html>
