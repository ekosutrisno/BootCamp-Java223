package com.bagian1;

import java.util.Scanner;

public class SoalA3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Total beli pulsa Rp. ");
		int pulsa = input.nextInt();
		System.out.println("Selamat kamu dapat "+cekPoint(pulsa)+" point dari pembelian pulsa.");

		input.close();

	}

	private static int cekPoint(int pulsa) {
		int point = 0;
		if (pulsa >= 0 && pulsa <= 10000) {
			point = 0;
		} else if (pulsa > 10000 && pulsa <= 30000) {
			pulsa = pulsa - 10000;
			point = 0 + pulsa / 1000;
		} else if (pulsa > 30000) {
			pulsa = pulsa - 30000;
			point = (pulsa / 1000) * 2;
			point = 20 + point;
		}
		return point;
	}

}
