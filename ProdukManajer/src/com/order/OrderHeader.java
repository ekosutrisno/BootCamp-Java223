package com.order;

public class OrderHeader extends OrderDetail {
	private static int order_id;
	private static String no_ref;
	private static int total_item;

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		OrderHeader.order_id = order_id;
	}

	public String getNo_ref() {
		return no_ref;
	}

	public void setNo_ref(String no_ref) {
		OrderHeader.no_ref = no_ref;
	}

	public int getTotal_item() {
		return total_item;
	}

	public void setTotal_item(int total_item) {
		OrderHeader.total_item = total_item;
	}
}
