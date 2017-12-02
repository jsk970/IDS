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

}
