package com.product;

public class MenuKategori extends MenuProduk {
	private static int id;
	private static String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		MenuKategori.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		MenuKategori.name = name;
	}
}
