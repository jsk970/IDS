<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>order page</title>

<script LANGUAGE="JavaScript" src="js/jquery.js"></script>
<script src="js/jquery-1.7.2.js" type="text/javascript"></script>
<script type="text/javascript">
   


//总和
$(function(){
$("input:checkbox").click(function(){
	var sum=0;
	$("input:checkbox:checked").each(function(){
	sum+= parseInt(this.value);
	$('#sumid').html(sum);});	
	});
 });
 		

 //判断是否点餐
 var SelectFalse = false; //用于判断是否被选择条件
 function check()
 {
	 var chboxValue = [];
	 var CheckBox = $('input[name = chkItem]');//得到所的复选框
	
	 for(var i = 0; i < CheckBox.length; i++)
	 {
	
		 if(CheckBox[i].checked)//如果有1个被选中时
		 {
			 SelectFalse = true; 
		 }
 }

	 if(!SelectFalse)
	 {
	 alert("请选择菜品！");
	 return false;
	 }
 
 }
 
 

 
  </script>  
  </head>  
  <body>  		

		<form action="add_order" method="post">
		
		
        <input name="chkItem" type="checkbox" value="1" />1
        <input name="chkItem" type="checkbox" value="2" />2
        <input name="chkItem" type="checkbox" value="3" />3
        <input name="chkItem" type="checkbox" value="4" />4
        <input name="chkItem" type="checkbox" value="5" />5
        <input name="chkItem" type="checkbox" value="6" />6
        <input name="chkItem" type="checkbox" value="7" />7
       
        
        <br />
    总和：<span id="sumid" ></span>元
    <br/>
     <input type="submit" value="提交" onclick="return check()">
  
        </form>
</body>

</html>