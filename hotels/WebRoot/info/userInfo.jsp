<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>�û�������ҳ</title>
	</head>
	<body>
		<h1>
			<font color="red">�����˵�</font>
		</h1>
		<s:a href="userService!userUpdateInfo">�޸�����</s:a>
		&nbsp;
		<s:a href="saveOrder.action">Ԥ������</s:a>
		&nbsp;
		<s:a href="orderService">�鿴Ԥ����Ϣ</s:a>
		&nbsp;
		<s:a href="userService!loginOut">�˳�</s:a>
	</body>
</html>