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
	<h1>비밀번호 찾기</h1>
	    <div class="form-group">
	      <input type="text" class="form-control" id="usr" name="id" placeholder="아이디를 입력하세요.">
	    </div>
	    <button type="button" class="btn btn-primary col-12 btn-find-pw">찾기</button>
	    <script type="text/javascript">
	    	$('.btn-find-pw').click(function(){
	    		var id = $('input[name=id]').val();
	    		console.log(id);
	    		var data = {'id' : id}; // 이름 : 실제값
	    	    $.ajax({
	    	        async:true,
	    	        type:'POST',
	    	        data:JSON.stringify(data),
	    	        url:"<%=request.getContextPath()%>/find/pw",
	    	        dataType:"json",
	    	        contentType:"application/json; charset=UTF-8",
	    	        success : function(data){
	    	            console.log(data);
	    	        }
	    	    });
	    	})
	    </script>
</body>
</html>