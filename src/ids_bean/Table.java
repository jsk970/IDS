package ids_bean;

public class Table {
	private int id_number;
	
	private String table_id;
	private String table_name;
	private String table_state;
	private String table_witter;
	private String table_type;
	private int table_eat_number;
	private int table_dish_done;
	private int table_dish_nodone;
	private String table_photo;
	
	public int getId_number() {
		return id_number;
	}
	public void setId_number(int id_number) {
		this.id_number = id_number;
	}
	public String getTable_id() {
		return table_id;
	}
	public void setTable_id(String table_id) {
		this.table_id = table_id;
	}
	public String getTable_name() {
		return table_name;
	}
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}
	public String getTable_state() {
		return table_state;
	}
	public void setTable_state(String table_state) {
		this.table_state = table_state;
	}
	public String getTable_witter() {
		return table_witter;
	}
	public void setTable_witter(String table_witter) {
		this.table_witter = table_witter;
	}
	public String getTable_type() {
		return table_type;
	}
	public void setTable_type(String table_type) {
		this.table_type = table_type;
	}
	public int getTable_eat_number() {
		return table_eat_number;
	}
	public void setTable_eat_number(int table_eat_number) {
		this.table_eat_number = table_eat_number;
	}
	public int getTable_dish_done() {
		return table_dish_done;
	}
	public void setTable_dish_done(int table_dish_done) {
		this.table_dish_done = table_dish_done;
	}
	public int getTable_dish_nodone() {
		return table_dish_nodone;
	}
	public void setTable_dish_nodone(int table_dish_nodone) {
		this.table_dish_nodone = table_dish_nodone;
	}
	public String getTable_photo() {
		return table_photo;
	}
	public void setTable_photo(String table_phtot) {
		this.table_photo = table_phtot;
	}
	@Override
	public String toString() {
		return "Table [id_number=" + id_number + ", table_id=" + table_id + ", table_name=" + table_name
				+ ", table_state=" + table_state + ", table_witter=" + table_witter + ", table_type=" + table_type
				+ ", table_eat_number=" + table_eat_number + ", table_dish_done=" + table_dish_done
				+ ", table_dish_nodone=" + table_dish_nodone + ", table_photo=" + table_photo + "]";
	}

	

}
