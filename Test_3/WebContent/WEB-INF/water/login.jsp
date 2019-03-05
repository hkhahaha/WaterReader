<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1" charset="utf-8">
		<title>登陆界面</title>
		<!-- css 文件 -->
		<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/foundation/5.5.3/css/foundation.min.css">

		<!-- jQuery 库 -->
		<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>

		<!-- JavaScript 文件 -->
		<script src="http://cdn.static.runoob.com/libs/foundation/5.5.3/js/foundation.min.js"></script>

		<!-- modernizr.js 文件 -->
		<script src="http://cdn.static.runoob.com/libs/foundation/5.5.3/js/vendor/modernizr.js"></script>
	</head>
	<style type="text/css">
		.button1 {
			margin-bottom: 0;
			margin-left: 0;
			font-size: 16px;
		}
		.change{
			margin-top: 20px;
		}
		.box2{
			margin-top: 150px;
			margin-left: 20px;
		}
		.box1 {
			margin-top: 10px;
		}
		.box3 {
			margin-bottom: 20px;
		}
		
	</style>
	<body style="padding:20px;">
		<%!long count = 0;%>
	<%
		session.setMaxInactiveInterval(5);//设置session失效时间
		boolean a = session.isNew();
		if (!a) {
			count = count + 1;
			if (count > 10) {
				response.sendRedirect("500.html");
			}
		}
		System.out.print(count + "!");
	%>
<div class="callout large primary">
<div class="row column text-center">
<h1>抄表员登陆</h1>
<h2 class="subheader">Meter Reader logining</h2>
</div>
</div>
<br>
<h3><s:actionerror/></h3>
		<div class="container">
		<div class="box2">
		<s:form action="water-login" method="post" theme="simple">
		  <div class="box3"><span style="font-size: 20px;">用户名:</span></div>
		  <s:textfield name="username" placeholder="Username"></s:textfield>
		  
		  <div class="box3"><span style="font-size: 20px;">密码:</span></div>
		  <s:textfield name="password" placeholder="Password"></s:textfield>
		  <!-- <button type="button" class="button round button1" >登陆</button> -->
		  <div style="margin-top: 40px;">
		  <s:submit class="button round button1" value="登陆"></s:submit>
		  </div>
		</s:form>
		</div>
		</div>
	</body>
</html>
