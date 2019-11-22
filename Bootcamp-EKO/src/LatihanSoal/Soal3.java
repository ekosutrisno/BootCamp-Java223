package LatihanSoal;

import java.util.Scanner;

public class Soal3 {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.print("Masukkan Kata dengan tanda Spasi: ");
		String kata = input.nextLine();
		System.out.println(kata);
		ududD(kata);
	}

	public static void ududD(String str) {
		String[] myStr = str.split(" ");
		int naik = 0;
		int turun = 0;
		int cek = 0;

		if (str.toLowerCase().contains("u") && str.toLowerCase().contains("d")) {

			for (int a = 0; a < myStr.length; a++) {
				if (myStr[a].equalsIgnoreCase("U")) {
					if (cek == 0) {
						cek++;
						naik++;
					} else {
						cek++;
					}
				} else if (myStr[a].equalsIgnoreCase("D")) {
					if (cek == 0) {
						cek--;
						turun++;
					} else {
						cek--;
					}
				}
			}
			System.out.println("Naik\t: " + naik + "\nTurun\t: " + turun);
		} else {
			System.out.println("Tidak ada hurup 'U' atau 'D'");
		}
	}
}
