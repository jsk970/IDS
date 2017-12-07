package ids_controller;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ids_bean.Order;
import ids_service.Order_services;
import ids_service.impl.Order_servicesimpl;
import ids_util.DateUtil;

@Controller
public class Order_Controller {
	private static final Log log = LogFactory.getLog(Order_Controller.class);
	
	@RequestMapping("/skiporder_page")
	public String order_page() {
		return "order_page";
	}
	
	
	
	@RequestMapping("/add_order")
	public String add_order(@RequestParam("chkItem") String dishes,
			@RequestParam("sumid") double order_tatol,
			HttpServletRequest request) throws JsonGenerationException, JsonMappingException, IOException {
		
		 // String id = Request.Params["tableid"];
		
		//double order_tatol = Double.parseDouble(request.getParameter("sumid"));
		System.out.println("dishes:"+dishes);
		System.out.println("order_tatol:"+order_tatol);
		Order_services os = new Order_servicesimpl();
		//查出最大的id_number的订单(也就是最新的一张订单)
		Order order = os.findMaxid_order();
		
		if(order!=null)
		{
			System.out.println("order:"+order);
			
			//判断此订单是不是今天的订单
			String order_id = order.getOrder_id();
			String date = order_id.substring(0, 8);
			//获取今日的时间yyyyMMdd
			SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
			String nowDate = sf.format(new Date());
			//如果时间相同，当天的订单流水号+1,否则插入新的一天的订单号为yyyyMMdd0001
			
			Order new_order = new Order();
			String new_Order_id = null; 
			if(date.equals(nowDate)) {
				DecimalFormat df = new DecimalFormat("0000");
				new_Order_id = nowDate+df.format(1+Integer.parseInt(order_id.substring(8,12)));
			
		}else {
			new_Order_id = nowDate+"0001";
		}
			new_order.setOrder_id(new_Order_id);
			new_order.setOrder_customer_id("顾客的登陆码");
			//顾客所点菜的编码拼接成字符串插入到数据库中
			new_order.setOrder_cashier(dishes);
			
			new_order.setOrder_table_id("table_id");
			
			Date nowtime = new Date();
			String time = DateUtil.dateToStr(nowtime);
			new_order.setOrder_time(time);
			new_order.setOrder_total(order_tatol);

			
			os.add_order(new_order);
			return null;
		}
		return null;
	}
	@RequestMapping("table_pay")
	public String table_pay(HttpSession session,Model model) {
		
		Order_services os = new Order_servicesimpl();
		
		//通过session获取当前登录的用户的验证码
		
		
		//User user = session.getAttribute("loginuser");
		//String user_vc = user.getorder_customer_id();
		String user_vc = "abcd";
		Order order = os.find_order(user_vc);
		model.addAttribute("order",order);
		String dishes = order.getOrder_cashier();
		String[] arr = dishes.split(",");
		System.out.println("arr:"+arr);
		for(String dish:arr)
		{
			System.out.print(dish+",");
			//通过菜编号搜索菜信息
//			List list = null;
//			list.add()
			
		}
		return "table_pay";
		
	}
}

	
