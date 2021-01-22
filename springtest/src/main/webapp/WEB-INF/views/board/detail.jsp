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
	     <label for="pwd">게시글 번호:</label>
	      <input type="writer" class="form-control" id="num" name="num" readonly value="${board.num}">
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
	    <button type="button" class="btn btn-<c:if test="${like == null ||like.up != 1}">outline-</c:if>dark up" id = "rec">추천</button>
	    <button type="button" class="btn btn-<c:if test="${like == null ||like.up != -1}">outline-</c:if>dark down" id = "unRec">비추천</button>
	    
	    <!-- flist != null 하면 flist는 list가 하나도 안들어있는거지 null 값이 아니기 때문에 원하는 결과가 나오지 않음-->
	    <c:if test="${fList.size() != 0 }">
		<div class="form-group">
			<label for="fList">첨부 파일:</label>
			<c:forEach var= "file" items="${fList}">
				<div>
					<a href="<%=request.getContextPath()%>/board/download?filename=${file.filename}">
					${file.oriFilename}
					</a>
				</div>
			</c:forEach>
		</div>
	    </c:if>
	</c:if>
  <c:if test="${board == null}">
  	<h1>존재하지 않은 게시글입니다.</h1>
  </c:if>
</div>
	<a href="<%=request.getContextPath()%>/board/list?page=${cri.page}&type=${cri.type}&search=${cri.search}">
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
	<script type="text/javascript">
		var up =${like.up};
		$('.btn.up, .btn.down').click(function(){
			
			console.log(up)
			//데이터 베이스의 up을 가져와서 직접 수정하고 있는건가?
			
			//추천 버튼을 클릭하면 
			if($(this).hasClass('up')){
				//추천 상태에서 추천 버튼을 클릭하면
				if(up == 1)
					up = 0;
				else 
					up =1;
			}
			//비추천버튼을 클릭하면
			else{
				//비추천상태에서 비추천버튼을 클릭하면 
				if(up == -1)
					up = 0;
				//비추천상태가 아닌 상황에서 비추천버튼을 클릭하면
				else
					up = -1;
			}
			//추천/비추천인 경우
			if(up != 0){
				/*
				 추천/비추천버튼 모두에 btn-dark클래스 제거, 
				 btn-outline-dark 클래스 추가
				 */
				 $('.btn.up, .btn.down').removeClass('btn-dark').addClass('btn-outline-dark');			
				 /*
				 클릭한 버튼에 btn-dark클래스 추가, btn-outline-dark클래스 제거 
				 */
				 $(this).addClass('btn-dark').removeClass('btn-outline-dark');
				
			}
			//추천/비추천을 취소한 경우
			else{
				/*
				클릭한 버튼에 btn-dark클래스 제거, btn-outline-dark클래스 추가
				*/
				$(this).removeClass('btn-dark').addClass('btn-outline-dark');
			}
				
			var id = '${user.id}'; //id 있는지 확인하고 있으면 가져와
			if(id == ''){
				alert('추천/비추천 기능은 로그인해야합니다.');
				return;
			}
			var boardNum = $('input[name=num]').val();
			var data = {"boardNum": boardNum , "id" : id, "up" : up}
			
			var obj = $(this);  // ajax 안에서 다루고 싶은데 ajax 바깥에서 눌렸기 때문에 인식을 못함. 따라서 변수로 저장
			//post넘겨받는 순간 get 재실행?
			$.ajax({
    	        async:true,
    	        type:'POST',
    	        data:data,
    	        url:"<%=request.getContextPath()%>/board/like",
    	        success : function(data){
    				if(up == 1){
    					alert('추천했습니다.')
    				}else if(up == -1){
    					alert('비추천했습니다.')
    				}else{
    					//클릭된 버튼이 추처닝면 추천이 취소되었습니다.
    					if($('btn.up'))
    						alert('추천이 취소되었습니다..')
    					//아니면 비추천이 취소되었습니다.
    					else
    						alert('비추천이 취소되었습니다..')
    				}  
    	        }
    	    })
		})	

	</script>
</body>
</html>
