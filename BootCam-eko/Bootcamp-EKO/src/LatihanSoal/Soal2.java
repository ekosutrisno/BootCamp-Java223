package LatihanSoal;

import java.util.Scanner;

public class Soal2 {

	private static Scanner inputUser;

	public static void main(String[] args) {
		// inisialisasi variabel
		double harga, min_beli;
		double jarak, maks_jarak = 5;
		min_beli = 30000;

		// Memanggil Scanner
		inputUser = new Scanner(System.in);
		System.out.print("Masukkan Jumlah pembelian: ");
		harga = inputUser.nextDouble();
		System.out.print("Masukkan Jarak Pengiriman: ");
		jarak = inputUser.nextDouble();
		System.out.println("INFORMASI PEMBAYARAN");
		System.out.println("----------------------");

		if (harga >= min_beli) {
			double diskon = harga * 50 / 100;
			double bayar_pajak = harga * 10 / 100;
			double bayar = (harga - diskon) + bayar_pajak;
			if (jarak > maks_jarak) {
				jarak = jarak - 5;
				double ongkir = 2000 * jarak;
				double bayar_jarak = bayar + ongkir;
				System.out.println("Tagihan\t: Rp." + harga);
				System.out.println("Diskon\t: Rp." + diskon);
				System.out.println("Pajak\t: Rp." + bayar_pajak);
				System.out.println("Ongkir\t: Rp." + ongkir);
				System.out.println("----------------------");
				System.out.print("Total Bayar Rp." + bayar_jarak);
			} else {
				System.out.println("Tagihan\t: Rp." + harga);
				System.out.println("Diskon\t: Rp." + diskon);
				System.out.println("Pajak\t: Rp." + bayar_pajak);
				System.out.println("Ongkir\t: Rp. 0");
				System.out.println("----------------------");
				System.out.print("Total Bayar Rp." + bayar);
			}
		} else {
			System.out.print("Harga Tagihan Kamu adalah Rp." + harga);
		}

	}

}
