<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>�û��޸�����</title>
	</head>
	<body>
		<h1>
			<font color="red">�޸�����</font>
		</h1>
		<s:form action="userService">
			<table>
				<tr>
					<td>
						<s:hidden name="user.userid" value="%{user.userid}"></s:hidden>
					</td>
				</tr>
				<tr>
					<td>
						<s:textfield readonly="true" name="user.username"
							value="%{user.username}" label="�û���"></s:textfield>
					</td>
				</tr>
				<tr>
					<td>
						<!--<s:password name="user.password" value="%{user.password}" label="����"></s:password>-->
						<s:textfield name="user.password" value="%{user.password}"
							label="����"></s:textfield>
					</td>
				</tr>
				<tr>
					<td>
						<s:textfield name="user.mobile" value="%{user.mobile}"
							label="�ֻ�����"></s:textfield>
					</td>
				</tr>
				<tr>
					<td>
						<s:textfield name="user.email" value="%{user.email}" label="�����ַ"></s:textfield>
					</td>
				</tr>
				<tr>
					<td>
						<s:submit method="updateUser" value="�޸�"></s:submit>
					</td>
				</tr>
			</table>
		</s:form>
	</body>
</html>
