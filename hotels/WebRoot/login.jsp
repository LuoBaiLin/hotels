<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>�û���¼</title>
	</head>
	<body>
		<h1>
			<font color="red">�û���¼</font>
		</h1>
		<s:form action="userService">
			<s:textfield name="user.username" label="�û���"></s:textfield>
			<s:password name="user.password" label="����"></s:password>
			<s:submit method="login" value="�� ¼"></s:submit>
			<br />
			<s:a href="adminLogin.jsp">����Ա��¼</s:a>
			<s:a href="register.jsp">���û�ע��</s:a>
			<br />
			<br />
			<br />
		</s:form>
	</body>
</html>
