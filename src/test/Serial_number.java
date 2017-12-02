package test;


import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Serial_number {
  private static String SERIAL_NUMBER = "0001" ;
  private static Serial_number primaryGenerater = null;
  
  private Serial_number(){}
  
  /**
   * 取得PrimaryGenerater的单例实现
   *
   * @return
   */
  public static Serial_number getInstance() {
      if (primaryGenerater == null) {
          synchronized (Serial_number.class) {
              if (primaryGenerater == null) {
                  primaryGenerater = new Serial_number();
              }
          }
      }
      return primaryGenerater;
  }
  

  
/**
 * 生成 日期+随机数的流水号
 * */
  public static String getNumberForPK(){  
      String id="";  
      SimpleDateFormat sf = new SimpleDateFormat("yyyyMM");  
      System.out.println("sf:"+sf);
      String temp = sf.format(new Date()); 
      System.out.println("temp:"+temp);
      int random=(int) (Math.random()*10000);  
      System.out.println(random);
      id=temp+random;  
      return id;  
  }  
  
  
  
/**
 * HHTG+年月+8+0001
 * 每月从0001开始计数
 * */
public static synchronized String getnumber(String thisCode){
        
      String id = null;
      Date date = new Date();
      SimpleDateFormat formatter = new SimpleDateFormat("yyMM");
      System.out.println("foematter:"+formatter.format(date));
      System.out.println("thisCode:"+thisCode);
      String thisData = thisCode.substring(4, 8);
      System.out.println("thisData:"+thisData);
      //这个判断就是判断你数据取出来的最后一个业务单号是不是当月的
      if(!formatter.format(date).equals(thisData)){
          System.out.println("新的一月");
          thisData = formatter.format(date);
          //如果是新的一月的就直接变成0001
          id = "HHTG-" + thisData + "-80001";
      }else{
          System.out.println("当月");
          DecimalFormat df = new DecimalFormat("0000");
          
          //不是新的一月就累加
          id ="HHTG-"+ formatter.format(date)+"-8-"
                + df.format(1 + Integer.parseInt(thisCode.substring(8, 13)));
      }
    return id;
    }



  public static void main(String[] args){
    /**
     *  HHTG170980001
     *  HH公司简称  + TG业务类型 + 年月 + 8部门 + 0001
     * 
     *  */
      String sno = "HHTG171180001";
      
     // String sno = getNumberForPK();
      System.out.println("sno:"+sno);
      System.out.println("结果："+getnumber(sno));
      }
  }