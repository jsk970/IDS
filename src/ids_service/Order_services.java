package ids_service;

import ids_bean.Order;

public interface Order_services {
	/**
	 * ��Ӷ���
	 * @param ord
	 * @return int
	 */
	public int add_order(Order ord);
	/**
	 * ��ѯ���¶���
	 * @return Order
	 */
	public Order findMaxid_order();
	/**
	 * ͨ���˿͵�½����Ҷ���
	 * @return
	 */
	public Order find_order(String user_vc);
}
