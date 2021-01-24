package com.bagian1;

import java.util.Scanner;

public class SoalA4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Angka konversi: ");
		int konversi = input.nextInt();
		System.out.println();
		botol(konversi);
		System.out.println();
		gelas(konversi);
		System.out.println();
		cangkir(konversi);
		System.out.println();
		teko(konversi);
		input.close();
	}

	private static void botol(int botol) {
		double teko = botol;
		double gelas = botol;
		double cangkir = botol;

		double botolGelas = 2 * gelas; // ----- botol>gelas
		double botolTeko = 2 * teko / 25; // ------ botol>teko
		double botolCangkir = 2 * (2.5 * cangkir); // ------ botol>cangkir
		System.out.println(botol + " botol = " + botolGelas + " gelas");
		System.out.println(botol + " botol = " + botolTeko + " teko");
		System.out.println(botol + " botol = " + botolCangkir + " cangkir");
	}

	private static void gelas(int gelas) {
		double botol = gelas;
		double teko = gelas;
		double cangkir = gelas;

		double gelasBotol = botol / 2; // gelas>botol
		double gelasCangkir = 2.5 * cangkir; // gelas>cangkir
		double gelasTeko = teko / 10;// gelas>teko
		System.out.println(gelas + " gelas = " + gelasBotol + " botol");
		System.out.println(gelas + " gelas = " + gelasCangkir + " cangkir");
		System.out.println(gelas + " gelas = " + gelasTeko + " teko");

	}

	private static void cangkir(int cangkir) {
		double botol = cangkir;
		double teko = cangkir;
		double gelas = cangkir;

		double cangkirGelas = gelas / 2.5; // ----- cangkir>gelas
		double cangkirTeko = teko / 25; // cangkir>teko
		double cangkirBotol = botol / 5; // cangkir>botol
		System.out.println(cangkir + " cangkir = " + cangkirGelas + " gelas");
		System.out.println(cangkir + " cangkir = " + cangkirTeko + " teko");
		System.out.println(cangkir + " cangkir = " + cangkirBotol + " botol");
	}

	private static void teko(int teko) {
		double botol = teko;
		double cangkir = teko;

		double tekoCangkir = 25 * cangkir;// ----- teko>cangkir
		double tekoGelas = 25 * 2.5 * cangkir; // ----- teko>gelas
		double tekoBotol = 25 * botol / 2; // teko>botol
		System.out.println(teko + " teko = " + tekoCangkir + " cangkir");
		System.out.println(teko + " teko = " + tekoGelas + " gelas");
		System.out.println(teko + " teko = " + tekoBotol + " botol");
	}
}
