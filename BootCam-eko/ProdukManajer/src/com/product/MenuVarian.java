package com.product;

public class MenuVarian {
	private static int varian_id;
	private static String varian_name;
	private static int category_id;

	public static int getVarian_id() {
		return varian_id;
	}

	public static void setVarian_id(int varian_id) {
		MenuVarian.varian_id = varian_id;
	}

	public static String getVarian_name() {
		return varian_name;
	}

	public static void setVarian_name(String varian_name) {
		MenuVarian.varian_name = varian_name;
	}

	public static int getCategory_id() {
		return category_id;
	}

	public static void setCategory_id(int category_id) {
		MenuVarian.category_id = category_id;
	}
}
