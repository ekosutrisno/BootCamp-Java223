package com.product;

public class MenuKategori extends MenuProduk {
	private static int id;
	private static String name;

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		MenuKategori.id = id;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		MenuKategori.name = name;
	}
}
