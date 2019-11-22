package com.product;

public class MenuProduk {
	private static int product_id;
	private static int category_id;
	private static int stock;
	private static String name;
	private static double price;

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		MenuProduk.product_id = product_id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		MenuProduk.category_id = category_id;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		MenuProduk.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		MenuProduk.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		MenuProduk.price = price;
	}

}
