package com.bagian1;

import java.util.Scanner;

public class SolaA03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Masukkan Kata: ");
		String kata = scn.nextLine();
		naikTurun(kata);
		scn.close();
	}

	public static void naikTurun(String kata) {

		String[] myStr = kata.split(" ");
		int naikGunung = 0;
		int turunGunung = 0;
		int cekGunung1 = 0;
		int cekGunung2 = 0;

		for (int a = 0; a < myStr.length; a++) {
			if (myStr[a].equalsIgnoreCase("N")) {
				naikGunung++;
				if (naikGunung - turunGunung == 0) {
					cekGunung2++;
				}

			} else if (myStr[a].equalsIgnoreCase("T")) {
				turunGunung++;
				if (naikGunung - turunGunung == 0) {
					cekGunung1++;
				}
			}

		}
		System.out.println("Naik:" + cekGunung1 + " dan turun " + cekGunung2);
	}
}
