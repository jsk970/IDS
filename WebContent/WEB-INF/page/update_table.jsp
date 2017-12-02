<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>



</head>
<body>


<form action="Table_controller?action=update_table&table_id=${table_info.table_id }" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<td>桌位号：</td><td><input type="text" name="new_table_id" value="${table_info.table_id }"></td>
			</tr>
			<tr>
				<td>桌位名称：</td><td><input type="text" name="table_name" value="${table_info.table_name }"></td>
			</tr>
			<tr>
				<td>桌位状态：</td><td><input type="text" name="table_state" value="${table_info.table_state }"></td>
			</tr>
			<tr>
				<td>桌位类型：</td><td><input type="text" name="table_type" value="${table_info.table_type }"></td>
			</tr>
			<tr>
				<td>服务员：</td><td><input type="text" name="table_witter" value="${table_info.table_witter }"></td>
			</tr>
			<tr>
				<td>上传图片：</td><td><input type="file" name="table_photo" value="${table_info.table_photo }"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="确认修改"></td>
			</tr>
		</table>
</form>
</body>
</html>