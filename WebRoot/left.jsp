<%@page contentType="text/html; charset=utf-8" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>无标题文档</title>
</head>

<body>
<p><a href="<%=request.getContextPath() %>/users/user!list.action" target="mainFrame">用户管理</a></p>
<p>&nbsp;</p>
<p><a href="<%=request.getContextPath() %>/userGroups/userGroup!userGroupList.action" target="mainFrame">用户组管理</a></p>
<p>&nbsp;</p>
<p><a href="functions/function.htm" target="mainFrame">功能管理</a></p>
</body>
</html>
