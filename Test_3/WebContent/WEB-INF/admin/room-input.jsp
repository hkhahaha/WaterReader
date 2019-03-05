<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理员</title>
<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">  
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
   .fakeimg {
      height: 200px;
      background: #aaa;
    }
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
</style>

</head>
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
<body>
<div class="container">
	<h1>添加宿舍</h1>
	<hr>
	<s:form action="room-save" method="post" theme="simple" class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">宿舍号</label>
			<div class="col-sm-10">
				<input class="form-control" name="room" id="focusedInput" type="text" value="请输入宿舍号。。。。">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">宿舍位置</label>
			<div class="col-sm-10">
				<input class="form-control" name="address" id="focusedInput" type="text" value="请输入宿舍位置。。。。">
			</div>
		</div>
		<div class="form-group">
		<label class="col-sm-2 control-label">操作</label>
		<div class="col-sm-10">
		<button type="submit" class="btn btn-warning">提交</button>
		</div>
		</div>
	</s:form>
</div>
</body>
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