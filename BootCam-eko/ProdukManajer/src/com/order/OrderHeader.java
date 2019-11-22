package com.order;

public class OrderHeader extends OrderDetail {
	private static int order_id;
	private static String no_ref;
	private static int total_item;

	public static int getOrder_id() {
		return order_id;
	}

	public static void setOrder_id(int order_id) {
		OrderHeader.order_id = order_id;
	}

	public static String getNo_ref() {
		return no_ref;
	}

	public static void setNo_ref(String no_ref) {
		OrderHeader.no_ref = no_ref;
	}

	public static int getTotal_item() {
		return total_item;
	}

	public static void setTotal_item(int total_item) {
		OrderHeader.total_item = total_item;
	}
}
