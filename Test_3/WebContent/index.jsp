<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>基于WEB的高校自来水管理系统</title>
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.admin {
	height: 200px;
	background: rgb(251, 186, 49);
	font-size: 100px;
}

.top {
	background: rgb(251, 186, 49);
}

.down {
	background: rgb(35, 35, 35);
}

a:link {
	color: black
}

a:visited {
	color: black
}

a:hover {
	color: black
}

a:active {
	color: black
}
</style>
</head>
<body>
	<div class="jumbotron text-center top" style="margin-bottom: 0">
		<h1>高校自来水管理系统</h1>
		<p>Water Management System in Colleges and Universities</p>
	</div>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="https://www.sise.com.cn/">华软首页</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">主页</a></li>
					<li><a href="http://home.sise.cn/">华软首页</a></li>
					<li><a href="http://class.sise.com.cn:7001/sise/">MySise</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container" style="margin-left: auto;">
		<div class="row">
			<div class="col-sm-10">
				<h2>管理员登录</h2>
				<h5>Administrator login</h5>
				<button type="button"
					class="btn btn-warning btn-block admin text-center jumbotron"
					onclick="location.href='admin.jsp'">管理员</button>
				<br>
				<h2>抄表员登录</h2>
				<h5>Meter Reader login</h5>
				<h5>请抄表员通过手机登录</h5>
				<button type="button"
					class="btn btn-warning btn-block admin text-center jumbotron"
					onclick="location.href='water.jsp'">抄表员</button>
			</div>
		</div>
	</div>

	<div class="jumbotron text-center down" style="margin-bottom: 0">
		<p class="link">
			<span style="color: white;">Copyright &copy; 9102.Company name
				All rights reserved.by__<a target="_blank" href="test1"
				style="color: darkorange;">&nbsp;Seashell Huang</a>
			</span>
		</p>
	</div>
</body>
</html>