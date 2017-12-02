package ids_dao.impl;

import java.sql.SQLException;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import ids_bean.Table;
import ids_dao.Table_dao;
import ids_util.DbUtil;




public class Table_daoimpl implements Table_dao{

QueryRunner qr = new QueryRunner(DbUtil.getDataSource());
	
	@Override
	public int add_table(Table t) {
		String sql = "insert into ids_table(table_id,table_name,table_state,table_witter,table_type,table_eat_number,table_dish_done,table_dish_nodone,table_photo) " + 
				"values(?,?,?,?,?,?,?,?,?)";
		int result = 0;
		Object[] params = {t.getTable_id(),t.getTable_name(),t.getTable_state(),t.getTable_witter(),t.getTable_type()
				,t.getTable_eat_number(),t.getTable_dish_done(),t.getTable_dish_nodone(),t.getTable_photo()};
		try {
			result = qr.update(sql, params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int delete_table(int id_number) {
		// TODO Auto-generated method stub
		String sql ="delete from ids_table where id_number=?";
		int result = 0;
		try {
			result = qr.update(sql,id_number);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int update_table(int id_number,Table t) {
		// TODO Auto-generated method stub
		String sql = "update ids_table set table_id=?,table_name=?,table_state=?,table_witter=?,table_type=?,table_eat_number=?,"
				+ "table_dish_done=?,table_dish_nodone=?,table_photo=? where id_numner=?";
		int result = 0;
		Object[] params={t.getTable_id(),t.getTable_name(),t.getTable_state(),t.getTable_witter(),t.getTable_type(),t.getTable_eat_number()
				,t.getTable_dish_done(),t.getTable_dish_nodone(),t.getTable_photo(),id_number};
		try {
			result = qr.update(sql, params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<Table> find_all_table() {
		// TODO Auto-generated method stub
		String sql = "select * from ids_table order by table_id asc";
		List<Table> list = null;
	
			try {
				list = qr.query(DbUtil.getConnection(),sql, new BeanListHandler<Table>(Table.class));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		return list;
	}

	@Override
	public Table findtable_byid(int id_number) {
		// TODO Auto-generated method stub
		Table t = null; 
		String sql = "select * from ids_table where id_number=?";
		try {
			t = qr.query(sql, new BeanHandler<Table>(Table.class), id_number);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return t;
	}

}
