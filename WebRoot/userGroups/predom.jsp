<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>无标题文档</title>
</head>

	<SCRIPT LANGUAGE=javascript>
<!--
	
 function openModify()
	 {
	  location.href="modifyFunction.htm";
	 }
	 function delete1()
	 {
	  location.href="function.htm";
	 }
	 function predom()
	 {
	  location.href="changeUserInf.jsp";
	 }
	 	 function add()
	 {
	  location.href="addfunction.htm";
	 }
  
//-->
</SCRIPT>

<body>
<h1 align="center">配置权限</h1>
<table width="90%" border="1" align="center">
  <tr>
    <td width="12%">名称：</td>
    <td width="88%">教师</td>
  </tr>
  <tr>
    <td>说明：</td>
    <td>&nbsp;</td>
  </tr>
</table>
<p align="center">&nbsp;</p>
<table width="90%"  border="1" align="center" cellpadding="1" cellspacing="1">
  <tr>
    <th width="10%" scope="col">选择</th>
    <th width="36%" scope="col">名称</th>
    <th width="54%" scope="col">说明</th>
  </tr>
  <tr>
    <td><input type="checkbox" name="checkbox" id="checkbox"></td>
    <td>/User/List</td>
    <td>用户列表</td>
  </tr>
</table>
<p align="center">
  <input type="button" name="button2" id="button2" value="配置">
</p>
<p align="center">&nbsp;</p>
</body>
</html>
