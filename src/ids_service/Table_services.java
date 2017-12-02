package ids_service;

import java.util.List;

import ids_bean.Table;

public interface Table_services {
	/**
	 * �����λ
	 * @param table_id
	 * @return
	 */
	public int add_table(Table t);
	/**
	 * ɾ����λ
	 * @param 
	 * @return
	 */
	public int delete_table(int id_unmber);
	/**
	 * �޸���λ��Ϣ
	 * @param table_id
	 * @param t
	 * @return
	 */

	public int update_table(int id_number,Table t);
	/**
	 * 
	 *  @param int id_number
	 * @return 
	 */

	public Table findtable_byid(int id_number);
	/**
	 * 
	 * @return
	 */
	public List<Table> find_all_table();

}
