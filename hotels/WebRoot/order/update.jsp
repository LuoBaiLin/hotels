<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>修改房间信息</title>
	</head>
	<body>
		<h1>
			<font color="red"><center>
					修改房间
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
							label="房间名称"></s:textfield>
					</td>
				</tr>
				<tr>
					<td>						
							<s:textfield name="room.price" value="%{room.price}"
							label="房间价格"></s:textfield>
					</td>
				</tr>
				<tr>
					<td>
						<s:textfield name="room.category" value="%{room.category}"
							label="房间类型"></s:textfield>
					</td>
				</tr>
 				<tr>
 					<td> <tr>			      	
     					<td class="tdLabel">房间状态:</td>
     					<s:if test="room.status == 0">
							<td><select name="room.status">
							 	<option value="0" selected="selected">空房</option>
							 	<option value="1">有客人</option>
							</select></td>
     					</s:if>
						<s:else>							
							<td><select name="room.status">
							 	<option value="0">空房</option>
							 	<option value="1" selected="selected">有客人</option>
							</select></td>
						</s:else></tr>
 					</td>
 				</tr>
				<tr>
					<td>
						<s:submit value="修改"></s:submit>
					</td>
				</tr>
			</table>
		</s:form>
	</body>
</html>
