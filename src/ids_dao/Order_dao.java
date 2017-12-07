package ids_dao;

import ids_bean.Order;

public interface Order_dao {
	/**
	 * 添加订单
	 * @return 返回值  int类型
	 */
	public int add_order(Order ord);
	/**
	 * 查询最新的一份订单
	 * @return
	 */
	public Order findMaxid_order();
	/**
	 * 
	 */
	public Order find_order(String user_vc);
	
	

}
