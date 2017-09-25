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
<h1 align="center">用户管理</h1>
<table width="90%"  border="1" align="center" cellpadding="1" cellspacing="1">
  <tr>
    <th scope="col">姓名</th>
    <th scope="col">地址</th>
    <th scope="col">邮编</th>
    <th scope="col">电话</th>
    <th scope="col">Email</th>
    <th scope="col">操作</th>
  </tr>
  
  <c:forEach items="${userList}" var="user">
  	<tr>
    <td>${user["user_name"]}</td><!-- Map取数据最好用[]，用.取变量取不到 -->
    <td>${user["user_address"]}</td>
    <td>${user["user_code"]}</td>
    <td>${user["user_phone"]}</td>
    <td>${user.user_email}</td>
    <td> <a href="user!openModify.action?user_ID=${user.user_ID}" target="_self"><input type="button" value="修改"  /></a>
      <a href="user!delete.action?user_ID=${user.user_ID}" target="_self"><input type="button"  value="删除"></a>
    </td>
  </tr>
  </c:forEach>
  
</table>
<p align="center">
<a href="user!openAdd.action" target="_self"><input type="button"  value="添加"/></a>
  
</p>
</body>
</html>
