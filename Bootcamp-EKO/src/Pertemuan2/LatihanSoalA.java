package Pertemuan2;

public class LatihanSoalA {

	public static void main(String[] args) {

		soal1(13);
		System.out.println();// Enter
		soal2(14);
		System.out.println();// Enter
		soal3(19);
		System.out.println();// Enter
		soal5(17);
		System.out.println();// Enter
		soal7(80);
		System.out.println();// Enter
		soal8(1000);
		System.out.println();// Enter
		soal9(1000);
		System.out.println();// Enter
		soal10(1000);
	}

	private static void soal1(int angka) {
		for (int a = 1; a <= angka; a++) {
			if (a % 2 == 1) {
				System.out.print(a + " ");
			}
		}

	}

	private static void soal2(int angka) {
		for (int a = 1; a <= angka; a++) {
			if (a % 2 == 0) {
				System.out.print(a + " ");
			}
		}

	}

	private static void soal3(int angka) {
		int data = 0;
		for (int a = 1; a <= angka; a++) {
			if (a % 3 == 0) {
				data += 3;
				System.out.print(data + " ");
			}
		}

	}

	private static void soal5(int angka) {
		for (int a = 1; a <= angka; a++) {
			if (a % 2 == 0) {
				continue;
			} else if (a == 3) {
				continue;
			} else if (a % 7 == 0) {
				System.out.print("* ");
			} else {
				System.out.print(a + " ");
			}
		}
	}

	private static void soal7(int angka) {
		int data = 1;
		for (int a = 1; a <= angka; a++) {
			if (a % 2 == 0) {
				a = data * 2;
				System.out.print(a + " ");
				data = a;
			}

		}

	}

	private static void soal8(int angka) {
		int data = 1;
		for (int a = 1; a <= angka; a++) {
			if (a % 3 == 0) {
				a = data * 3;
				System.out.print(a + " ");
				data = a;
			}

		}

	}

	private static void soal9(int angka) {
		int data = 1;
		for (int a = 1; a <= angka; a++) {
			if (a % 4 == 0) {
				a = data * 4;
				System.out.print(a + " ");
				data = a;
				if (a == 16) {
					System.out.print("* ");
				}
			}
		}
	}

	private static void soal10(int angka) {
		int data = 1;
		for (int a = 1; a <= angka; a++) {
			if (a % 3 == 0) {
				a = data * 3;
				System.out.print(a + " ");
				data = a;
				if (a == 81) {
					System.out.print("XXX ");
				}
			}
		}

	}

}
