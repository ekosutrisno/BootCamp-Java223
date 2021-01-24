package com.bagian1;

import java.util.Scanner;

public class SoalA04 {

	public static void main(String[] args) {

		System.out.print("Input number of rows: ");
		Scanner in = new Scanner(System.in);
		int no_row = in.nextInt();
		trianglePascal(no_row);
		System.out.println();
		pascal(no_row);
		in.close();
	}

	private static void trianglePascal(int no_row) {
		int c = 1, blk, i, j;
		for (i = 0; i < no_row; i++) {
			for (blk = 1; blk <= no_row - i; blk++) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				if (j == 0 || i == 0)
					c = 1;
				else
					c = c * (i - j + 1) / j;
				System.out.print(" " + c);
			}
			System.out.print("\n");
		}

	}

	private static void pascal(int baris) {
		int row, angka;

		for (int a = 0; a < baris; a++) {
			angka = 1;
			row = a + 1;
			
			 for (int j = baris - a; j > 0; j--) {
			        System.out.print(" ");
			    }
			
			for (int b = 0; b <= a; b++) {
				if (b > 0) {
					angka = angka * (row - b) / b;
				}
				System.out.print(angka + " ");
			}
			System.out.println();
		}
	}

}
