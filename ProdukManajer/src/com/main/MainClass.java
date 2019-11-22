package com.main;

import com.order.OrderDetail;
import com.order.OrderHeader;
import com.product.MenuKategori;
import com.product.MenuProduk;
import com.product.MenuVarian;

public class MainClass {

	public static void main(String[] args) {
		// Menginstansiasi kelas
		MenuProduk produk = new MenuProduk();
		MenuKategori kategori = new MenuKategori();
		MenuVarian varian = new MenuVarian();
		OrderHeader order_header = new OrderHeader();
		OrderDetail order_detail = new OrderDetail();

		// Inputan dan Informasi untuk User
		System.out.println("==== WELCOME TO MY APP PRODUK MANAGER ====");
		System.out.println("---------------MENU UTAMA-----------------");
		System.out.println("1. Info Produk");
		System.out.println("2. Info Kategori");
		System.out.println("3. Info Varian");
		System.out.println("4. Order Detail Info");
		System.out.println("5. Order Header Info");

		// Set Properti produk
		produk.setName("Makanan");
		produk.setProduct_id(1);
		produk.setCategory_id(11);
		produk.setStock(120);
		produk.setPrice(12000);

		// Set properti Kategori
		kategori.setName("Snack");
		kategori.setId(11);

		// Set Properti Varian
		varian.setVarian_name("Ciki-ciki");
		varian.setCategory_id(11);
		varian.setVarian_id(2);

		// Set properti Order detail
		order_detail.setProduct_produc_id(12);
		order_detail.setOrder_order_id(12);
		order_detail.setOrder_detail_id(13);
		order_detail.setAmount(100000);

		// Set properti OrderHeader
		order_header.setTotal_item(5);
		order_header.setNo_ref("A-321");
		order_header.setOrder_id(11);

		// Memanggil dan menampilan semua properti pada kelas
		System.out.println("------------------------------------------");
		System.out.println("Nama Produk\t\t:" + produk.getName());
		System.out.println("Produk Id\t\t:" + produk.getProduct_id());
		System.out.println("Produk katogori Id\t:" + produk.getCategory_id());
		System.out.println("Stok Produk\t\t:" + produk.getStock());
		System.out.println("Harga Produk\t\t:" + produk.getPrice());
		System.out.println("------------------------------------------");
		System.out.println("Nama Kategori\t\t:" + kategori.getName());
		System.out.println("Kategori Id\t\t:" + kategori.getId());
		System.out.println("------------------------------------------");
		System.out.println("Nama Varian\t\t:" + varian.getVarian_name());
		System.out.println("Katgori Id\t\t:" + varian.getCategory_id());
		System.out.println("Varian Id\t\t:" + varian.getVarian_id());
		System.out.println("------------------------------------------");
		System.out.println("Produk Id\t\t:" + order_detail.getProduct_produc_id());
		System.out.println("Order Id\t\t:" + order_detail.getOrder_order_id());
		System.out.println("Order Detail Id\t\t:" + order_detail.getOrder_detail_id());
		System.out.println("Amount\t\t\t:" + order_detail.getAmount());
		System.out.println("------------------------------------------");
		System.out.println("Total Item\t\t:" + order_header.getTotal_item());
		System.out.println("No Referensi\t\t:" + order_header.getNo_ref());
		System.out.println("Order Id\t\t:" + order_header.getOrder_id());

	}
}
