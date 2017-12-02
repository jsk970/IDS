package ids_bean;

public class Order {
	private int id_unmber;
	
	private String order_id;
	private String order_customer_id;
	private String order_table_id;
	private String order_witter;
	private String order_cashier;
	private String order_time;
	private double order_total;
	private String order_checkout_state;
	
	
	public int getId_unmber() {
		return id_unmber;
	}
	public void setId_unmber(int id_unmber) {
		this.id_unmber = id_unmber;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getOrder_customer_id() {
		return order_customer_id;
	}
	public void setOrder_customer_id(String order_customer_id) {
		this.order_customer_id = order_customer_id;
	}
	public String getOrder_table_id() {
		return order_table_id;
	}
	public void setOrder_table_id(String order_table_id) {
		this.order_table_id = order_table_id;
	}
	public String getOrder_witter() {
		return order_witter;
	}
	public void setOrder_witter(String order_witter) {
		this.order_witter = order_witter;
	}
	public String getOrder_cashier() {
		return order_cashier;
	}
	public void setOrder_cashier(String order_cashier) {
		this.order_cashier = order_cashier;
	}
	public String getOrder_time() {
		return order_time;
	}
	public void setOrder_time(String order_time) {
		this.order_time = order_time;
	}
	public double getOrder_total() {
		return order_total;
	}
	public void setOrder_total(double order_total) {
		this.order_total = order_total;
	}
	public String getOrder_checkout_state() {
		return order_checkout_state;
	}
	public void setOrder_checkout_state(String order_checkout_state) {
		this.order_checkout_state = order_checkout_state;
	}
	@Override
	public String toString() {
		return "Order [id_unmber=" + id_unmber + ", order_id=" + order_id + ", order_customer_id=" + order_customer_id
				+ ", order_table_id=" + order_table_id + ", order_witter=" + order_witter + ", order_cashier="
				+ order_cashier + ", order_time=" + order_time + ", order_total=" + order_total
				+ ", order_checkout_state=" + order_checkout_state + "]";
	}
}
