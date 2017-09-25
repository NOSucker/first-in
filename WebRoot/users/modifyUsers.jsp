<%@page contentType="text/html; charset=utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>无标题文档</title>
</head>

<body>
<h1 align="center">修改用户</h1>
<form name="form1" method="post" action="user!modify.action">
  <table width="90%"  border="1" cellspacing="1" cellpadding="1">
    <tr>
      <td width="23%" height="30">姓名</td>
      <td width="77%" height="30"><input name="user.user_name" type="text" value="${user.user_name}"></td>
    </tr>
    <tr>
      <td height="30">地址</td>
      <td height="30"><input name="user.user_address" type="text" value="${user.user_address}"></td>
    </tr>
    <tr>
      <td height="30">邮编</td>
      <td height="30"><input name="user.user_code" type="text" value="${user.user_code}"></td>
    </tr>
        <tr>
      <td height="30">密码</td>
      <td height="30"><input name="user.user_password" type="password" value="${user.user_password}"></td>
    </tr>
    <tr>
      <td height="30">电话</td>
      <td height="30"><input name="user.user_phone" type="text" value="${user.user_phone}"></td>
    </tr>
    <tr>
      <td height="30">Email</td>
      <td height="30"><input name="user.user_email" type="text" value="${user.user_email}"></td>
    </tr>
    <tr>
      <td height="30">用户组</td>
      <td height="30"><select name="user.userGroup_id">
      		<option>------</option>
          <c:forEach items="${ugs }" var="ug">
          	<option value="${ug.usergroup_id }" ${(ug.usergroup_id==user.userGroup_id)?"selected":"" }>${ug.usergroup_name }</option>
          </c:forEach>
      </select></td>
    </tr>
    <tr>
      <td height="30" colspan="2" align="center">
      <input type="hidden" name="user.user_ID" value="${user.user_ID }">
      <a href="user!list.action" target="_self"><input type="button" name="Submit2" value="返回"> </a>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="submit" name="Submit" value="提交"></td>
    </tr>
  </table>
</form>
<p align="center">&nbsp;</p>
</body>
</html>
