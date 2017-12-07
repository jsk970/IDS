package ids_service.impl;

import ids_bean.Order;
import ids_dao.Order_dao;
import ids_dao.impl.Order_daoimpl;
import ids_service.Order_services;

public class Order_servicesimpl implements Order_services{

	Order_dao od = new Order_daoimpl();
	@Override
	public int add_order(Order ord) {
		if(od.add_order(ord)!=0)
			return 1;
		return 0;
	}
	@Override
	public Order findMaxid_order() {
		if(od.findMaxid_order()!=null)
			return od.findMaxid_order();
		return null;
	}
	@Override
	public Order find_order(String user_vc) {
		if(od.find_order(user_vc)!=null)
			return od.find_order(user_vc);
		return null;
	}

}
