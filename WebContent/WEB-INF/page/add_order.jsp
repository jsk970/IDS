<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="order_controller" method="post" >
		<table>
			<tr>
				<td>订单编号：</td><td><input type="text" name="table_id"></td>
			</tr>
			<tr>
				<td>顾客登陆码：</td><td><input type="text" name="table_name"></td>
			</tr>
			<tr>
				<td>桌位号：</td><td><input type="text" name="table_state"></td>
			</tr>
			<tr>
				<td>桌位服务员：</td><td><input type="text" name="table_type"></td>
			</tr>
			<tr>
				<td>收银员：</td><td><input type="text" name="table_witter"></td>
			</tr>
			<tr>
				<td>订单时间：</td><td><input type="text" name="table_witter"></td>
			</tr>
			<tr>
				<td>订单状态：</td><td><input type="text" name="table_witter"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="确认添加"></td>
			</tr>
		</table>
</form>
</body>
</html>