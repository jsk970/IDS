package test;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Order_number {
	
	public String number() {
		
		SimpleDateFormat sf = new SimpleDateFormat("yyMM");
		String temp = sf.format(new Date());
		
		
		String order_number = temp+"0001";
		System.out.println("order_number:"+order_number);
		String thisCode = temp+"0001";
		
		String number = order_number.substring(0,4) ;
		String number2 = order_number.substring(4,8) ;
		System.out.println("number:"+number);
				System.out.println("number2:"+number2);
		//	System.out.println(	"int:"+Integer.parseInt(order_number.substring(4, 8)));
			
			
			DecimalFormat df = new DecimalFormat("0000");
		System.out.println("结果:"+number+df.format(1+Integer.parseInt(thisCode.substring(4, 8))));
		return order_number;
		
	}
	
	public static void main(String[] args) {
		Order_number on = new Order_number();
		System.out.println(on.number());
	}
	
}
