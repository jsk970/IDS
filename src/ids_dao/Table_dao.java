package ids_dao;

import java.util.List;

import ids_bean.Table;

public interface Table_dao {
	/**
	 * �����λ
	 * @param t
	 * @return ����ֵInt����
	 */
	public int add_table(Table t);
	/**
	 * ɾ����λ
	 * @param table_id
	 * @return ����ֵInt����
	 */
	public int delete_table(int number);
	/**
	 * �޸���λ��Ϣ
	 * @param table_id
	 * @return ����ֵInt����
	 */
	public int update_table(int id_number,Table t);
	
	/**
	 * ͨ��table_id ������λ
	 * @param table_id
	 * @return ���� Table
	 */
	public Table findtable_byid(int id_number);
	/**
	 * �鿴���е���λ��Ϣ
	 * @return ���� int
	 */
	public List<Table> find_all_table();
	
	
	

}
