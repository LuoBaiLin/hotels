<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>����Ա��¼</title>
	</head>
	<body>
		<h1>
			<font color="red">����Ա��¼</font>
		</h1>
		<s:form action="adminService">
			<s:textfield name="admin.username" label="�û���"></s:textfield>
			<s:password name="admin.password" label="����"></s:password>
			<s:submit method="login" value="�� ¼"></s:submit>
			<br />
			<s:a href="login.jsp">�û���¼</s:a>
			<br />
		</s:form>
	</body>
</html>
