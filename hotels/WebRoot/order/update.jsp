<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>�޸ķ�����Ϣ</title>
	</head>
	<body>
		<h1>
			<font color="red"><center>
					�޸ķ���
				</center>
			</font>
		</h1>
		<s:form action="updateRoom">
			<table>
				<tr>
					<td>
						<s:hidden name="room.roomid" value="%{room.roomid}"></s:hidden>
					</td>
				</tr>
				<tr>
					<td>
						<s:textfield name="room.name" value="%{room.name}"
							label="��������"></s:textfield>
					</td>
				</tr>
				<tr>
					<td>						
							<s:textfield name="room.price" value="%{room.price}"
							label="����۸�"></s:textfield>
					</td>
				</tr>
				<tr>
					<td>
						<s:textfield name="room.category" value="%{room.category}"
							label="��������"></s:textfield>
					</td>
				</tr>
 				<tr>
 					<td> <tr>			      	
     					<td class="tdLabel">����״̬:</td>
     					<s:if test="room.status == 0">
							<td><select name="room.status">
							 	<option value="0" selected="selected">�շ�</option>
							 	<option value="1">�п���</option>
							</select></td>
     					</s:if>
						<s:else>							
							<td><select name="room.status">
							 	<option value="0">�շ�</option>
							 	<option value="1" selected="selected">�п���</option>
							</select></td>
						</s:else></tr>
 					</td>
 				</tr>
				<tr>
					<td>
						<s:submit value="�޸�"></s:submit>
					</td>
				</tr>
			</table>
		</s:form>
	</body>
</html>
