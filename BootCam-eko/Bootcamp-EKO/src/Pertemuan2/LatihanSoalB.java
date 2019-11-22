package Pertemuan2;

public class LatihanSoalB {

	public static void main(String[] args) {
		System.out.println("Soal Nomor 1");
		soal01();
		System.out.println("\n\nSoal Nomor 2");
		soal02();
		System.out.println("\n\nSoal Nomor 3");
		soal03(7, 3, 2);
		System.out.println("\n\nSoal Nomor 4");
		soal04(7, 5);

	}

	private static void soal01() {
		int data = 1;
		for (int a = 0; a < 7; a++) {
			System.out.print(a + " ");
		}
		System.out.println();
		for (int a = 0; a <= 7; a++) {
			if (a == 0) {
				a = 1;
				System.out.print(a + " ");
			} else {
				int b = data * 3;
				System.out.print(b + " ");
				data = b;
			}
		}
	}

	private static void soal02() {
		int data = 1;
		for (int a = 0; a < 7; a++) {
			System.out.print(a + " ");
		}
		System.out.println();
		for (int a = 1; a <= 7; a++) {
			if (a == 1) {
				System.out.print(data + " ");
			} else {
				if (a % 3 == 0) {
					System.out.print("-" + (data *= 3) + " ");
				} else {
					int b = data * 3;
					data = b;
					System.out.print(b + " ");
				}
			}
		}
	}

	private static void soal03(int n1, int n2, int n3) {
		int data = 1;
		for (int a = 0; a < n1; a++) {
			System.out.print(a + " ");
		}
		System.out.println();
		for (int a = 0; a < n1; a++) {
			if (a == 0 || a == n1 - 1) {
				System.out.print(n3 + " ");
			} else if (a == 1) {
				System.out.print((data = n2 * n3) + " ");
			} else if (a <= 3) {
				System.out.print((data *= n3) + " ");
			} else {
				System.out.print((data /= n3) + " ");
			}
		}
	}

	private static void soal04(int a, int b) {
		int data1 = 5, data2 = 1;

		for (int i = 0; i < a; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
		for (int i = 0; i < a; i++) {
			if (i % 2 == 0) {
				System.out.print((data2++) + " ");
			} else {
				System.out.print(data1 + " ");
				data1 += b;
			}
		}
	}

}
