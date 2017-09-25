<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>无标题文档</title>
</head>

<body>
<h1 align="center">修改用户组</h1>
<form name="form1" method="post" action="userGroup!modifyUserGroup.action">
  <table width="90%"  border="1" cellspacing="1" cellpadding="1">
    <tr>
      <td width="23%" height="30">名称</td>
      <td width="77%" height="30"><input name="usergroup.usergroup_name" type="text" value="${usergroup.usergroup_name} "></td>
    </tr>
    <tr>
      <td height="30" colspan="2" align="center">
      <input type="hidden" name="usergroup.userGroup_id" value="${usergroup.userGroup_id }">
      <a href="userGroup!userGroupList.action" target="_self">
      	<input type="button" name="Submit2" value="返回"> 
      </a>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="submit" name="Submit" value="提交"></td>
    </tr>
  </table>
</form>
<p align="center">&nbsp;</p>
</body>
</html>
