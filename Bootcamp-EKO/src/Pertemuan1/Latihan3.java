package Pertemuan1;

import java.util.Scanner;

public class Latihan3 {

	public static void main(String[] args) {

		Scanner inputrow = new Scanner(System.in);
		Scanner inputcoloumn = new Scanner(System.in);
		int inr, inc;

		System.out.printf("========================\n");
		System.out.printf("Banyak Baris = ");
		inr = inputrow.nextInt();

		System.out.printf("========================\n");
		System.out.printf("Banyak Kolom = ");
		inc = inputrow.nextInt();

		System.out.printf("\n");

		matriks(inr, inc);
		
		inputrow.close();
		inputcoloumn.close();
	}

	public static void matriks(int m, int n) {
		int x;
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				x = i * j;
				System.out.printf("%d  ", x);
			}
			System.out.printf("\n");
		}

	}
}
