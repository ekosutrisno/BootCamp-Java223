package ArrayPackage;

import java.util.Scanner;

//Membuat Class Public

public class Array2 {

	public String str = "Ada Apa Dengan Cinta";
	private Scanner input;

	// Ambil Array integer
	public int[] ambilArray(int inp) {
		int[] hasil = new int[inp];
		for (int i = 0; i < hasil.length; i++) {
			input = new Scanner(System.in);
			hasil[i] = input.nextInt();
		}
		return hasil;
	}

	// Ambil Array String
	public String[] tulisNama(int inp) {
		String[] hasil = new String[inp];
		for (int i = 0; i < hasil.length; i++) {
			input = new Scanner(System.in);
			hasil[i] = input.nextLine();
		}
		return hasil;
	}

	// Mengurutkan Array
	public int[] bubleShort(int[] arr) {
		int cek;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					cek = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = cek;
				}
			}
		}
		return arr;
	}

	
	
} // Ending Class Array2