<%@page import="javax.swing.text.html.CSS"%>
<%@page import="com.yq.entity.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="com.yq.servlet.CheckCustomerServlet,com.yq.entity.Customer,java.util.* "%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客户管理</title>

</head>
<body>
	<table border="1" cellspacing="0" cellpadding="5" bordercolor="silver"
		align="center">
		<tr>
			<td colspan="5" align="center" bgcolor="#E8E8E8">极客影院客户表</td>
		</tr>
		<tr>
			<td>客户编号</td>
			<td>first_name</td>
			<td>last_name</td>
			<td>email</td>
			<td>address_id</td>
			<td>create_date</td>
		</tr>
		<%
			CheckCustomerServlet ccs = new CheckCustomerServlet();
		    List<Customer> list = ccs.readResult();
			for (Customer customer : list) {
		%>
		<tr>
			<td><%=customer.getCustomer_id()%></td>
			<td><%=customer.getFirst_name()%></td>
			<td><%=customer.getLast_name()%></td>
			<td><%=customer.getAddress_id()%></td>
			<td><%=customer.getEmail()%></td>
			<td><%=customer.getCreate_date()%></td>
			
			<td><a
				href="<%=request.getContextPath()%>/DeleteServlet?customer_id=<%=customer.getCustomer_id()%>">删除</a></td>
		</tr>
		<%
			}
		%>
	</table>
	<br />
		<br /> <a href="<%=request.getContextPath()%>/jsp/index.jsp">返回极客影院首页</a>
</html>