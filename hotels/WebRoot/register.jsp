<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>�û�ע��</title>
	</head>
	<body>
		<h1>
			<font color="red">���û�ע��</font>
		</h1>
		<s:form action="saveUser">
			<s:textfield name="user.username" label="�û���"></s:textfield>
			<s:password name="user.password" label="����"></s:password>
			<s:textfield name="user.mobile" label="��ϵ�绰"></s:textfield>
			<s:textfield name="user.email" label="��������"></s:textfield>
			<s:submit method="register" value="ע ��"></s:submit>
		</s:form>
	</body>
</html>
