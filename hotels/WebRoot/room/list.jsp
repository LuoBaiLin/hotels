<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>�����б�</title>
		<script type="text/javascript">
function del() {
	if (confirm("ȷ��ɾ��������Ϣ��?")) {
		return true;
	}
	return false;
}
</script>
	</head>
	<body>
		<%@include file="/info/adminInfo.jsp"%>
		<h1>
			<font color="red"><center>
					�����б�
				</center> </font>
		</h1>
		<s:a href="../room/add.jsp">���ӷ���</s:a>
		<table border="1" width="80%" align="center">
			<tr>
				<td>
					�������
				</td>
				<td>
					��������
				</td>
				<td>
					����۸�
				</td>
				<td> 
					�������� 
				</td>
				<td>
					����״̬
				</td>
				<td>
					ɾ��
				</td>
				<td>
					����
				</td>
			</tr>
			<s:iterator value="#request.list" id="room">
				<tr>
					<td>
						<s:property value="#room.roomid" />
					</td>
					<td>
						<s:property value="#room.name" />
					</td>
					<td>
						<s:property value="#room.price" />
					</td>
					<td>
						<s:property value="#room.category" />
					</td>
					<td>
						<s:if test="#room.status == 0">����</s:if>
						<s:else>����ס</s:else>
					</td>
					<td>
						<s:a href="deleteRoom.action?room.roomid=%{#room.roomid}"
							onclick="return del();">delete</s:a>
					</td>
					<td>
						<s:a href="updatePRoom.action?room.roomid=%{#room.roomid}">update</s:a>
					</td>
				</tr>
			</s:iterator>
		</table>
	</body>
</html>
