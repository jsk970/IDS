package ids_service.impl;


import java.util.List;

import ids_bean.Table;
import ids_dao.Table_dao;
import ids_dao.impl.Table_daoimpl;
import ids_service.Table_services;

public class Table_servicesimpl implements Table_services {
	Table_dao ta = new Table_daoimpl();

	@Override
	public int add_table(Table t) {
		if(ta.add_table(t)!=0)
			return 1;
		return 0;
	}

	@Override
	public int delete_table(int id_number) {
		if(ta.delete_table(id_number)!=0)
			return 1;
		return 0;
	}

	@Override
	public int update_table(int id_unmber,Table t) {
		if(ta.update_table(id_unmber, t)!=0)
			return 1;
		return 0;
	}

	@Override
	public List<Table> find_all_table() {
		// TODO Auto-generated method stub
		if(ta.find_all_table()!=null)
			return ta.find_all_table();
		return null;
	}

	@Override
	public Table findtable_byid(int id_unmber) {
		// TODO Auto-generated method stub
		if(ta.findtable_byid(id_unmber)!=null)
			return ta.findtable_byid(id_unmber);
		return null;
	}

}
