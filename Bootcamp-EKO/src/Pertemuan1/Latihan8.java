package Pertemuan1;

import java.util.Scanner;

public class Latihan8 {

	private Scanner input;

	public static void main(String[] args) {
		Latihan8 lt8 = new Latihan8();
		lt8.ambilArray(5);
		int[] a = lt8.ambilArray(5);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	public int[] ambilArray(int inp) {
		int[] hasil = new int[inp];
		for (int i = 0; i < hasil.length; i++) {
			input = new Scanner(System.in);
			System.out.print("Masukkan Panjang Array: ");
			hasil[i] = input.nextInt();
		}
		return hasil;
	}

}
