<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <c:if test="${user == null}">
	<!--  url이 localhost:8080/test/login 중간부분 test를 직접 입력해주어야함. -->
	<!--  중간코드를 다른 곳에 쓸때도 그대로 쓸 수 있게 <%=request.getContextPath() %> 쓰자. -->
	   <form action="<%=request.getContextPath()%>/login" method="post">
	    <div class="form-group">
	      <label for="usr">Name:</label>
	      <input type="text" class="form-control" id="usr" name="id">
	    </div>
	    <div class="form-group">
	      <label for="pwd">Password:</label>
	      <input type="password" class="form-control" id="pwd" name="pw">
	    </div>
	    <button type="submit" class="btn btn-primary col-12">로그인</button>
	  </form>
  </c:if>
  
  <c:if test="${user != null}">
  	<button id="btnAjax1">ajax 버튼1</button>
  	<button id="btnAjax2">ajax 버튼2</button>
  	
  	<div>
  			<table class="table table-hover">
				<thead>
				<tr>
					<td>아이디</td>
					<td>이름</td>
					<td>이메일</td>
					<td>나이</td>
					<td>홈페이지</td>
					<td>권한</td>
				</tr>
				</thead>
				<tbody>
					<tr>
						<td>임시1</td>
						<td>임시1</td>
						<td>임시1</td>
						<td>임시1</td>
						<td>임시1</td>
						<td>임시1</td>
					</tr>
					<tr>
						<td>임시2</td>
						<td>임시2</td>
						<td>임시2</td>
						<td>임시2</td>
						<td>임시2</td>
						<td>임시2</td>
					</tr>
				</tbody>
			</table>
  	</div>
  	<script type="text/javascript">
  		$(function(){
  			$('#btnAjax1').click(function(){
  				var data = {name : 'Hong', age : 21};
  				$.ajax({
  					url : '<%=request.getContextPath()%>/ajax1',
  					type : 'post',
  					data : data,
  					data : JSON.stringify(data),
  					dataType:"json",
  					contentType:"application/json; charset=UTF-8",
  					success : function(data){
  						console.log(data);
  					},
  					error : function(){
  						console.log('실패');
  					}
  				})
  			})
  		})
  	</script>
  	<script type="text/javascript">
  	$('#btnAjax2').click(function(){
			var sendData = {name : 'Hong', age : 21};
			$.ajax({
				url : '<%=request.getContextPath()%>/ajax2',
				type : 'post',
				data : JSON.stringify(sendData),
				dataType:"json",
				contentType:"application/json; charset=UTF-8",
				// 보내는 data 받는 data 이름이 다르다!
				success : function(data){
					var str='';
					var list = data['list'];
					for(var i = 0; i<list.length; i++){
						str += '<tr>'
						str += '<td>'+list[i]['id']+'</td>'
						str += '<td>'+list[i]['name']+'</td>'
						str += '<td>'+list[i]['email']+'</td>'
						str += '<td>'+list[i]['age']+'</td>'
						str += '<td>'+list[i]['home']+'</td>'
						str += '<td>'+list[i]['author']+'</td>'
						str += '</tr>'
					}
					$('tbody').html(str);
					console.log(data);
					console.log(data['list'][0]['email']);
					console.log(data.list[0].email);
					console.log(data.testVo.name);
					console.log(data['testVo']['name']);
				},
				error : function(){
					console.log('실패');
				}
			})
		})
  	</script>
  	<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/test.js"></script>
  </c:if>
</body>
</html>