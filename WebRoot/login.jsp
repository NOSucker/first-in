<%@page contentType="text/html; charset=utf-8" %>
<%@taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>无标题文档</title>
</head>

<body>
<h1 align="center">登陆
	<br>
	<font color="red"><s:fielderror/></font>
</h1>
<form name="form1" method="post" action="login.action">
<table width="90%"  border="1" align="center" cellpadding="1" cellspacing="1">
  <tr>
    <td width="19%" height="30">登陆名：</td>
    <td width="81%" height="30"><input type="text" name="user_email" value="${user_email}"></td>
  </tr>
  <tr>
    <td height="30">密码：</td>
    <td height="30"><input type="password" name="user_password" value="${user_password }"></td>
  </tr>
  <tr>
    <td height="30" colspan="2" align="center"><input type="submit" name="Submit" value="登陆"></td>
    </tr>
</table>

</form>

</body>
</html>
