package test;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Order_number {
	
	public String number() {
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
		String temp = sf.format(new Date());
		String order_number = temp+"0001";
		System.out.println("order_number:"+order_number);
		String thisCode = temp+"0001";
		
		String year = order_number.substring(0,4);
		String month = order_number.substring(4,6);
		String day = order_number.substring(6,8);
		System.out.println("year:"+year);
		System.out.println("month:"+month);
		System.out.println("day:"+day);
		System.out.println("thisCode:"+thisCode);
		//	System.out.println(	"int:"+Integer.parseInt(order_number.substring(4, 8)));
			
			
		DecimalFormat df = new DecimalFormat("0000");
		System.out.println("now time:"+year+df.format(1+Integer.parseInt(order_number.substring(8,12))));
		//System.out.println("now time:"+year+df.format(1+Integer.parseInt(thisCode.substring(4, 12))));
		return order_number;
		
	}
	
	public static void main(String[] args) {
		Order_number on = new Order_number();
		System.out.println(on.number());
	}
	
}
