package Pertemuan2;

import java.util.Scanner;

public class ArrayMultiDimensi {
	public static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Masukkan Baris: ");
		int a = input.nextInt();
		System.out.print("Masukkan Kolom: ");
		int b = input.nextInt();
		
		int[][] ad = inputBarKol(a,b);
		printArrayMD(ad);
	}

	public static void printArrayMD(int[][] arr) {
		for (int a = 0; a < arr.length; a++) {

			for (int b = 0; b < arr[a].length; b++) {
				System.out.print(arr[a][b]+ "  ");
			}
			System.out.println();
		}

	}

	public static int[][] inputBarKol(int baris,int kolom) {

		int[][] hasil = new int[baris][kolom];
		for (int b = 0; b < baris; b++) {
			for (int k = 0; k < kolom; k++) {
				hasil[b][k] = input();
			}
		}
		return hasil;
	}

	public static int input() {
		input = new Scanner(System.in);
		int b = input.nextInt();
		return b;
	}

}
