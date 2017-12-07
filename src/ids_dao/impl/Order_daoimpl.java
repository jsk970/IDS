package ids_dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import ids_bean.Order;
import ids_dao.Order_dao;
import ids_util.DbUtil;


public class Order_daoimpl implements Order_dao{
	
	QueryRunner qr = new QueryRunner(DbUtil.getDataSource());
	
	@Override
	public int add_order(Order ord) {
		String sql = "insert into ids_order(order_id,order_customer_id,order_table_id,order_witter,"
				+ "order_cashier,order_time,order_total,order_checkout_state) value(?,?,?,?,?,?,?,?)";
		int result = 0 ;
		Object[] params= {ord.getOrder_id(),ord.getOrder_customer_id(),ord.getOrder_table_id(),ord.getOrder_witter(),
				ord.getOrder_cashier(),ord.getOrder_time(),ord.getOrder_total(),ord.getOrder_checkout_state()};
		
		try {
			result = qr.update(sql, params);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return result;
	}
	
	public Order findMaxid_order() {
		String sql = "select * FROM ids_order where id_number=(select MAX(id_number) from ids_order)";
		Order order =null;
		try {
			order = qr.query(sql, new BeanHandler<Order>(Order.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return order;
}

	@Override
	public Order find_order(String user_vc) {
		String sql = "SELECT * from ids_order where order_customer_id=?";
		Order order =null;
		try {
			order = qr.query(sql, new BeanHandler<Order>(Order.class),user_vc);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return order;
	}
}
