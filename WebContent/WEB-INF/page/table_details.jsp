<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>table_details</title>
</head>
<body>

	桌位图片:<img src="${table_details.table_photo}" width="150"><br/>
	桌位号:${table_details.table_id}<br/>
	桌位名称:${table_details.table_name}<br/>
	桌位状态:${table_details.table_state}<br/>
	桌位服务员:${table_details.table_witter}<br/>
	桌位类型:${table_details.table_type}<br/>
	就餐人数:${table_details.table_eat_number}<br/>
	以做菜数:${table_details.table_dish_done}<br/>
	未做菜数:${table_details.table_dish_nodone}<br/>
	

</body>
</html>