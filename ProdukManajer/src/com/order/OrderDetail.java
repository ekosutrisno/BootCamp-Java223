package com.order;

public class OrderDetail {
	private static int order_detail_id;
	private static int amount;
	private static int order_order_id;
	private static int product_produc_id;

	public int getOrder_detail_id() {
		return order_detail_id;
	}

	public void setOrder_detail_id(int order_detail_id) {
		OrderDetail.order_detail_id = order_detail_id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		OrderDetail.amount = amount;
	}

	public int getOrder_order_id() {
		return order_order_id;
	}

	public void setOrder_order_id(int order_order_id) {
		OrderDetail.order_order_id = order_order_id;
	}

	public int getProduct_produc_id() {
		return product_produc_id;
	}

	public void setProduct_produc_id(int product_produc_id) {
		OrderDetail.product_produc_id = product_produc_id;
	}

}
