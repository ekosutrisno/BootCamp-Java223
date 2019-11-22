package LatihanSoal;

public class Soal5 {

	public static void main(String[] args) {
		tampilData(7);
	}

	public static void fibonaci_2(int angka) {
		int fn = 0;
		int fn1 = 1;
		int fn2 = 0;
		for (int i = 0; i < angka; i++) {
			fn = fn1 + fn2;
			fn1 = fn2;
			fn2 = fn;
			System.out.print(fn + " ");
		}
	}

	public static void fibonaci_3(int angka) {
		int fn = 0;
		int fn1 = 1;
		int fn2 = 0;
		int fn3 = 0;
		for (int i = 0; i < angka; i++) {
			if (i == 0 || i == 1 || i == 2) {
				fn = 1;
				fn1 = 1;
				fn2 = 1;
				fn3 = 1;
			} else {
				fn = fn1 + fn2 + fn3;
				fn1 = fn2;
				fn2 = fn3;
				fn3 = fn;
			}

			System.out.print(fn + " ");
		}
	}

	public static void bilanganPrima(int angka) {
		for (int i = 2; i < angka; i++) {
			boolean prima = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prima = false;
					break;
				}
			}
			if (prima == true) {
				System.out.print(i + " ");
			}
		}

	}

	public static void tampilData(int panjang) {
		for (int i = 1; i <= 3; i++) {
			if (i == 1) {
				fibonaci_2(panjang);
			} else if (i == 2) {
				System.out.println();
				fibonaci_3(panjang);
			} else {
				System.out.println();
				bilanganPrima(panjang + 10);
			}
		}
	}
}
