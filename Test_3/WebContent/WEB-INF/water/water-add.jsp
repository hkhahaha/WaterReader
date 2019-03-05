<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1"
	charset="utf-8">
<title>添加水量界面</title>
<!-- css 文件 -->
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/foundation/5.5.3/css/foundation.min.css">

<!-- jQuery 库 -->
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>

<!-- JavaScript 文件 -->
<script
	src="http://cdn.static.runoob.com/libs/foundation/5.5.3/js/foundation.min.js"></script>

<!-- modernizr.js 文件 -->
<script
	src="http://cdn.static.runoob.com/libs/foundation/5.5.3/js/vendor/modernizr.js"></script>
</head>
<style type="text/css">
.button1 {
	margin-bottom: 0;
	margin-left: 0;
	font-size: 16px;
}

.change {
	margin-top: 20px;
}

.box2 {
	margin-top: 100px;
}

.box1 {
	margin-top: 10px;
}

.box3 {
	margin-bottom: 10px;
}
</style>
<body style="padding:20px;">
		<div class="callout large primary">
			<div class="row column text-center">
				<h1>添加水量信息</h1>
				<h2 class="subheader">Add Water Info</h2>
			</div>
		</div>
	<br>
	<h3>
		<s:actionerror />
	</h3>
	<br>
	<div class="container">
		<div class="box2">
			<hr>
			<s:form action="water-add" method="post" theme="simple">
				<!-- 添加水量信息还没完成 -->
				<div class="box3"><span style="font-size: 20px;">水量:</span></div>
				<s:textfield name="water" placeholder="请输入水量"></s:textfield>
				<div class="box3" >
					<s:radio list="#request.cycle" label="抄表周期" name="date"
						format="yyyy-MM" value="date" listKey="date" listValue="date"
						listValueKey="date" theme="simple"></s:radio>
				</div>
				<br>
				<div class="box3"><span style="font-size: 20px;">宿舍:</span></div>
				<s:select list="#request.room" listKey="id" listValue="room"
					name="tbRoom.id">
				</s:select>
				<div style="margin-top: 40px;">
				<s:submit class="button round button1" value="添加" ></s:submit>
				</div>
			</s:form>
		</div>
	</div>
</body>
</html>