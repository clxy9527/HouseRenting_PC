<!doctype html>
<html lang="zh">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>预约租房后台系统____登录</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/login/css/styles.css">
</head>
<body>
<div class="htmleaf-container">
	<div class="wrapper">
		<div class="container">
			<h1>欢迎</h1>
			
			<form class="form" action="${pageContext.request.contextPath}/userinfoController/weblogin">
				<input name="userNo" type="text" placeholder="工号">
				<input name="loginPassword" type="password" placeholder="密码">
				<button type="submit" id="login-button">登录</button>
			</form>
		</div>
		
		<ul class="bg-bubbles">

		</ul>
	</div>
</div>

<script src="${pageContext.request.contextPath}/login/js/jquery-2.1.1.min.js" type="text/javascript"></script>
<!-- <script>
$('#login-button').click(function (event) {
	event.preventDefault();
	$('form').fadeOut(500);
	$('.wrapper').addClass('form-success');
});
</script> -->

<div style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';color:#000000">
<h1>预约租房后台系统</h1>
</div>
</body>
</html>