package ArrayPackage;

import java.util.Scanner;

public class Array4 {

	public static Scanner scn;

	public int[][] inputMatrik(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				scn = new Scanner(System.in);
				System.out.print("Element Matrik ke [" + i + "][" + j + "] : ");
				arr[i][j] = scn.nextInt();
			}
		}
		return arr;
	}

	private static void cetakMatrik(int[][] matrik) {
		int baris = matrik.length;
		int kolom = matrik[0].length;

		for (int a = 0; a < baris; a++) {
			System.out.print("[");
			for (int b = 0; b < kolom; b++) {
				System.out.print(matrik[a][b]);
				if (b < kolom - 1) {
					System.out.print(" ");
				} else {
					System.out.print("]");
				}
			}
			System.out.println();
		}

	}

	public int[][] jumlah(int[][] a, int[][] b) {
		int a1 = a.length;
		int a2 = a[0].length;
		int b1 = b.length;
		int b2 = a[0].length;
		int[][] hasil = new int[a1][a2];
		if (a1 == b1 && b1 == b2) {
			for (int i = 0; i < a1; i++) {
				for (int j = 0; j < a2; j++) {
					hasil[i][j] = a[i][j] + b[i][j];
				}
			}
		} else {
			System.out.println("Ordo matrik tidak sama");
		}
		return hasil;
	}

	private static int[][] kali(int[][] a, int[][] b) {
		int a1 = a.length;
		int a2 = a[0].length;
		int b1 = b.length;
		int b2 = b[0].length;
		int[][] hasil = new int[a1][b2];
		int simpan;

		for (int i = 0; i < a1; i++) {
			for (int j = 0; j < b2; j++) {
				simpan = 0;
				for (int k = 0; k < a2; k++) {
					simpan += a[i][k] * b[k][j];
				}
				hasil[i][j] = simpan;
			}
		}
		return hasil;
	}

}
