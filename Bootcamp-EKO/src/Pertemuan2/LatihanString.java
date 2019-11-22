package Pertemuan2;

import java.util.Scanner;

public class LatihanString {

	public static void main(String[] args) {

		String a = "Xsis";
		String b = "Academy";
		System.out.println(tampilString(a, b));
		System.out.println(tampilKata(a));
		System.out.println(ganti(tampilString(a, b), " 0000 "));

		System.out.println(palindrom("makam"));

		// Membandingkan
		Scanner scn = new Scanner(System.in);
		System.out.print("Masukkan Kalimat: ");
		// String kalimat = scn.nextLine();

		System.out.print("Masukkan Kalimat: ");
		// char hurup = scn.next();
		System.out.println();
		banyakKata(b, 'a');

		scn.close();
	}

	public static String tampilString(String a, String b) {
		String A = a.substring(0, 1);
		String B = b.substring(b.length() - 1);
		return A + A + a + " " + b + B + B;
	}

	public static String tampilKata(String input) {
		String A = input.substring(0, 1);
		String B = input.substring(input.length() - 1);
		return A + A + input + B + B;
	}

	public static String replaceInput(String input, String separator) {
		String spl = input.replace(" ", separator);
		return spl;
	}

	public static String replacePertama(String input, String pengganti) {
		String spl = input.replaceFirst(" ", pengganti);
		return spl;
	}

	public static String replaceSplit(String input, String pengganti) {
		String str[] = input.split(" ");
		String hasil = "";

		for (int i = 0; i < str.length; i++) {
			if (i < str.length - 1) {
				hasil = hasil + str[i] + pengganti;
			} else {
				hasil = hasil + str[i];
			}
		}
		return hasil;
	}

	public static String ganti(String masuk, String ganti) {
		String[] mystr = masuk.split(" ");
		String output = "";
		for (int a = 0; a < mystr.length; a++) {
			if (a < mystr.length - 1) {
				output = output + mystr[a] + ganti;
			} else {
				output = output + mystr[a];
			}
		}
		return output;
	}

	public static boolean palindrom(String input) {
		String kata = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			kata += input.charAt(i);
		}
		System.out.println(kata);
		if (kata.equalsIgnoreCase(input))
			return true;
		else
			return false;
	}

	public static int banyakKata(String kata, char a) {
		int jumlah = 0;
		for (int i = 0; i < kata.length(); i++) {
			if (kata.charAt(i) == a) {
				jumlah++;
			}
		}
		System.out.print("Banyak Hurup " + a + " adalah " + jumlah);
		return jumlah;
	}
	
	public static void anagram(String kata_1, String kata_2) {
		String k1 = kata_1.toLowerCase().replace(" ", "");
		String k2 = kata_2.toLowerCase().replace(" ", "");
	
		int pjg;
		int pjg1 = kata_1.length();
		int pjg2 = kata_2.length();
		int ada = 0, tidak = 0;
		if (pjg1 == pjg2) {
			pjg = pjg1;

			for (int i = 0; i < pjg; i++) {
				ada = 0;
				for (int j = 0; j < pjg; j++) {
					if (k1.charAt(i) == k2.charAt(j)) {
						ada = 1;
						break;
					}
				}
				if (ada == 0) {
					tidak = 1;
					break;
				}
			}
			if (tidak == 1) {
				System.out.println("Bukan Anagram!");

			} else {
				System.out.println("Anagram");
			}
		} else {
			System.out.println("Panjang Kata Tidak Sama!");
		}
	}
}
