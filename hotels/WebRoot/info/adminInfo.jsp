<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>管理员管理首页</title>
	</head>
	<body>
		<h1>
			<font color="red">管理菜单</font>
		</h1>
		<s:a href="listUser.action">客户管理</s:a>
		&nbsp;
		<s:a href="listRoom.action">房间管理</s:a>
		&nbsp;
		<s:a href="listOrder.action">订单管理</s:a>
		&nbsp;
		<s:a href="adminService!loginOut">退出</s:a>

	</body>
</html>
