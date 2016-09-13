<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<link rel="stylesheet" type="text/css" href="background.css">
<style type="text/css">
body {
	color: #000;
	font-size: 25px;
	margin: 20px auto;
}
</style>

11538-辛璇
<br/>
<br/>
<br/>
<br/>

<script type="text/javascript">
	function check(form) {
		if (document.forms.loginForm.first_name.value == "") {
			alert("请输入用户名！");
			document.forms.loginForm.first_name.focus();
			return false;
		}
	}
</script>

<script type="text/javascript">
	function check(form) {
		if (document.forms.loginForm.password.value =="")	{
			alert("请输入密码！");
			document.forms.loginForm.password.focus();
			return false;
		}
		
	}
</script>


</head>
<body>
	<form action="<%=request.getContextPath()%>/CheckServlet" method="post"
		name="loginForm">

		<table border="1" cellspacing="0" cellpadding="5" bordercolor="silver"
			align="center">
			<tr>
				<td colspan="2" align="center" bgcolor="#E8E8E8">用户登录</td>
			</tr>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="first_name" /></td>
			</tr>
			
			<tr>
				<td>密码：</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td colspan="2" align="Center"><input type="submit" value="提交"
					onclick="return check(this);" /> <input type="reset" value="重置">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>