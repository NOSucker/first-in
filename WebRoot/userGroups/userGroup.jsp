<%@page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>无标题文档</title>

</head>


<body>
<h1 align="center">用户组管理</h1>
<form action="">
<table width="90%"  border="1" align="center" cellpadding="1" cellspacing="1">
  <tr>
    <th scope="col">用户组名</th>
    <th scope="col">操作</th>
  </tr>
    <s:iterator value="userGroupList" var="item" status="st">
  		<tr>
    		<td><s:property value="#item.usergroup_name"/></td>
    		<td>
      			<a href="userGroup!openModifyUserGroup.action?usergroup_id=${item.usergroup_id}" target="_self"><input type="button" value="修改"  /></a>
      			<a href="userGroup!deleteUserGroup.action?usergroup_id=${item.usergroup_id}" target="_self"><input type="button"  value="删除"></a>
      			<a href="predom.jsp" target="_self"><input type="button" value="权限"></a>
			</td>
  		</tr>
    </s:iterator>
</table>
<p align="center">
<a href="userGroup!openAddUserGroup.action" target="_self"><input type="button" name="button4" value="添加"></a>
  
</p>
<p align="center">&nbsp;</p>
</form>
</body>
</html>
