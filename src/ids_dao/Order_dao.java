package ids_dao;

import ids_bean.Order;

public interface Order_dao {
	/**
	 * ��Ӷ���
	 * @return ����ֵ  int����
	 */
	public int add_order(Order ord);
	/**
	 * ��ѯ���µ�һ�ݶ���
	 * @return
	 */
	public Order findMaxid_order();
	/**
	 * 
	 */
	public Order find_order(String user_vc);
	
	

}
