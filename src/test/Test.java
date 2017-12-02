package test;

import java.text.SimpleDateFormat;
import java.util.Date;



public class Test {
	/**
	 * 生成 日期+随机数的流水号
	 * */
	  public static String getNumberForPK(){  
	      String id="";  
	      SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");  
	      System.out.println("sf:"+sf);
	      String temp = sf.format(new Date()); 
	      System.out.println("temp:"+temp);
	      int random=(int) (Math.random()*10000);  
	      System.out.println("random:"+random);
	      id=temp+random;  
	      return id;  
	  }  
	  
	  public static void main(String[] args) {
		System.out.println(getNumberForPK());
	}

}
