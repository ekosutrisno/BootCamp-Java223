package com.product;

public class MenuProduk {
	private static int product_id;
	private static int category_id;
	private static int stock;
	private static String name;
	private static double price;

	public static int getProduct_id() {
		return product_id;
	}

	public static void setProduct_id(int product_id) {
		MenuProduk.product_id = product_id;
	}

	public static int getCategory_id() {
		return category_id;
	}

	public static void setCategory_id(int category_id) {
		MenuProduk.category_id = category_id;
	}

	public static int getStock() {
		return stock;
	}

	public static void setStock(int stock) {
		MenuProduk.stock = stock;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		MenuProduk.name = name;
	}

	public static double getPrice() {
		return price;
	}

	public static void setPrice(double price) {
		MenuProduk.price = price;
	}

}
