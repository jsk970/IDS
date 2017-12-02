<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>table_main</title>

<script type="text/javascript"> 
function del(){ 
if(!confirm("确认要删除？")){ 
window.event.returnValue = false; 
} 
} 
</script> 
</head>
<body>
<table border="1px">
<tr>
	<th>桌位图片</th>
	<th>桌位号</th>
	<th>桌位名称</th>
	<th>桌位状态</th>
	<th>桌位服务员</th>
	<th>桌位类型</th>
	<th>就餐人数</th>
	<th>以做菜数</th>
	<th>未做菜数</th>
	<th>操作</th>
</tr>
<c:forEach items="${table_list }" var="table">
<tr>
	
	<td><img src="${table.table_photo }" width="50"></td>
	<td>${table.table_id }</td>
	<td>${table.table_name }</td>
	<td>${table.table_state }</td>
	<td>${table.table_witter }</td>
	<td>${table.table_type }</td>
	<td>${table.table_eat_number }</td>
	<td>${table.table_dish_done }</td>
	<td>${table.table_dish_nodone }</td>
	<td>
	<a href="update_table?id_number=${table.id_number }">修改</a>/
	<a href="table_details?id_number=${table.id_number }">详情</a>/
	<a href="delete_table?id_number=${table.id_number }" onclick="return del()">删除</a>
	</td>
</tr>
</c:forEach>


</table>
</body>
</html>