package ids_service;

import ids_bean.Order;

public interface Order_services {
	/**
	 * 添加订单
	 * @param ord
	 * @return int
	 */
	public int add_order(Order ord);
	/**
	 * 查询最新订单
	 * @return Order
	 */
	public Order findMaxid_order();
	/**
	 * 通过顾客登陆码查找订单
	 * @return
	 */
	public Order find_order(String user_vc);
}
