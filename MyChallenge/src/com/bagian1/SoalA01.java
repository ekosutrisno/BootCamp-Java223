package com.bagian1;

import java.util.Scanner;

public class SoalA01 {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		System.out.print("Isi keranjang 1: ");
		int keranjang1 = input1.nextInt();

		Scanner input2 = new Scanner(System.in);
		System.out.print("Isi keranjang 2: ");
		int keranjang2 = input2.nextInt();

		Scanner input3 = new Scanner(System.in);
		System.out.print("Isi keranjang 3: ");
		int keranjang3 = input3.nextInt();

		Scanner input4 = new Scanner(System.in);
		System.out.print("\nKeranjang yang dibawa (1/2/3) :");
		int bawa_pasar = input4.nextInt();

		int result = jumlahIsi(keranjang1, keranjang2, keranjang3, bawa_pasar);
		System.out.println("*Total isi keranjang : " + result +" buah.");

		input1.close();
		input2.close();
		input3.close();
		input4.close();
	}

	private static int jumlahIsi(int k1, int k2, int k3, int bawa_pasar) {
		int hasil = 0;
		if (bawa_pasar == 1) {
			hasil = k2 + k3;
		} else if (bawa_pasar == 2) {
			hasil = k1 + k3;
		} else if (bawa_pasar == 3) {
			hasil = k1 + k2;
		} else {
			System.out.println("Pilihan tidak tersedia, silahkan pilih (1/2/3)");
		}
		return hasil;
	}
}
