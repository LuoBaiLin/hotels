<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>��ӹ���Ա</title>
	</head>
	<body>
		<%@include file="/info/adminInfo.jsp"%>
		<h1>
			<font color="red">��ӹ���Ա</font>
		</h1>
		<s:form action="saveAdmin">
			<s:textfield name="admin.username" label="�û���"></s:textfield>
			<s:password name="admin.password" label="����"></s:password>
			<s:submit value="�� ��"></s:submit>
		</s:form>
	</body>
</html>
