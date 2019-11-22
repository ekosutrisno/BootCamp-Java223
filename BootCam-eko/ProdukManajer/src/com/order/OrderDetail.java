package com.order;

public class OrderDetail {
	private static int order_detail_id;
	private static int amount;
	private static int order_order_id;
	private static int product_produc_id;

	public static int getOrder_detail_id() {
		return order_detail_id;
	}

	public static void setOrder_detail_id(int order_detail_id) {
		OrderDetail.order_detail_id = order_detail_id;
	}

	public static int getAmount() {
		return amount;
	}

	public static void setAmount(int amount) {
		OrderDetail.amount = amount;
	}

	public static int getOrder_order_id() {
		return order_order_id;
	}

	public static void setOrder_order_id(int order_order_id) {
		OrderDetail.order_order_id = order_order_id;
	}

	public static int getProduct_produc_id() {
		return product_produc_id;
	}

	public static void setProduct_produc_id(int product_produc_id) {
		OrderDetail.product_produc_id = product_produc_id;
	}

}
