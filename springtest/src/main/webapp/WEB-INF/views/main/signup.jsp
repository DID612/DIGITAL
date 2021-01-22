<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language ="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원가입</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">


<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <style>
        .title{
            text-align: center;
            margin-top: 50px;
        }
        label.error{
            color: red;
            display: none;
        }
    </style>
</head>
<body>
        <form action="<%=request.getContextPath()%>/signup" method="post" action="" id="form" class="container col-12">
            <h1 class="title">회원가입</h1>
            <div class="form-group">
            <!-- 클래스로 해도 상관은 없지만 클래스의 경우 잘못 사용할 경우 여러 가지 경우와 겹칠 수 있기 때문에 한번만 사용되는 id로 가자. id 등록검사는 더는 안할테니까 ^^ -->
                <input type="text" class="form-control id" id="id" name="id" placeholder="아이디" value="${user.id}">
                <label for="id" class="error" id="id-error"></label>
            </div>
            <div class="form-group">
            <button type="button" class="btn btn-outline-dark col-12	" id="id-check" name="id-check">아이디 중복 검사</button>  
            </div>
            <div class="form-group">
                <input type="text" class="form-control" id="pw" name="pw" placeholder="비밀번호" value="${user.pw}">
                <label for="pw" class="error" id="pw-error"></label>
            </div>
            <div class="form-group">
                <input type="text" class="form-control" id="pw2" name="pw2" placeholder="비밀번호2" value="">
                <label for="pw2" class="error" id="pw2-error"></label>
              </div>
            <div class="form-group">
                <input type="text" class="form-control" id="age" name="age" placeholder="나이" value="${user.age}">
                <label for="age" class="error" id="age-error"></label>
              </div>
            <div class="form-group">
                <input type="text" class="form-control" id="name" name="name" placeholder="이름" value="${user.name}">
                <label for="name" class="error" id="name-error"></label>
              </div>
            <div class="form-group">
                <input type="text" class="form-control" id="email" name="email" placeholder="이메일" value="${user.email}">
                <label for="email" class="error" id="email-error"></label>
              </div>
            <div class="form-group">
                <input type="text" class="form-control" id="home" name="home"	 placeholder="홈페이지" value="${user.home}">
                <label for="home" class="error" id="home-error"></label>
              </div>
            <button type="submit" class="btn btn-outline-success" name="signup">회원가입</button>
        </form>
        <script type="text/javascript">
        	$(function(){
        		var check = 0;
        		var dup = false;
        		$('#id-check').click(function(){
        			//id가 입력안되면 굳이 ajax로 서버에 다녀올 필요가 없다!!그러니까 ajax에서 되도록 빼자
        			var id = $('input[name=id]').val();
        			var data = {'id' : id};
            	    $.ajax({
            	        async:true,
            	        type:'POST',
            	        data:data,
            	        url:"<%=request.getContextPath()%>/dup",
            	        success : function(data){
            	            console.log(data);
            	            if(data == 'user'){
            	            	alert('이미 가입한 아이디입니다.')
            	            	console.log(1)
            	            }else if(data == ''){
            	            	alert('아이디를 입력한 후 중복 검사를 해주세요')
            	            	console.log(2)
            	            }else if(data == 'not user'){
            	            	alert('가입이 가능한 아이디입니다.')
            	            	//얘만 true로 해도 어차피 작동 안한다.
            	            	//근데 왜 안하지 작동을??
            	            	dup=true;
            	            	console.log(3)
            	            }            
            	        }
            	    });
        		})

/*         		$('submit[name=signup]').click(function(){
        			if(check != 1){
        				console.log('체크 작동하는지')
        				alert('아이디 중복 검사를 진행해주세요.')
        				return false;
        			}
        			if(check == 1)
        				return true;
        		}) */
        		$('#id').change(function(){
        			dup = false;
        		})
        		
        		$('form').submit(function(){
        			if(!dup){
        				alert('아이디 중복 검사를 하세요.')
        				return false;
        			}
        			return true;
        		})
        	})
        </script>
</body>
</html>
