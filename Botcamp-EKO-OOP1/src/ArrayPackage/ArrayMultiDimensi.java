package ArrayPackage;

import java.util.Scanner;

public class ArrayMultiDimensi {
	public static Scanner input;

	public void printArrayMD(int[][] arr) {
		for (int a = 0; a < arr.length; a++) {

			for (int b = 0; b < arr[a].length; b++) {
				System.out.print(arr[a][b]+" ");
			}
			System.out.println();
		}

	}

	public int[][] inputBarKol(int baris, int kolom) {
		int[][] hasil = new int[baris][kolom];
		for (int b = 0; b < baris; b++) {
			for (int k = 0; k < kolom; k++) {
				hasil[b][k] = input();
			}
		}
		return hasil;
	}

	public int input() {
		input = new Scanner(System.in);
		int b = input.nextInt();
		return b;
	}


	
}
