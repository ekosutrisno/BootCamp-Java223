package Pertemuan1;

public class Latihan6 {

	public static void main(String[] args) {

		baris_Kol1(8);
		baris_Kol2(8);
		System.out.println();
		matrikKotak(5, 7);

	}

	private static void baris_Kol1(int k) {

		for (int a = 0; a <= k; a++) {

			for (int b = 0; b < a; b++) {
				if (a <= b) {
					System.out.print("");
				} else {
					System.out.print(a + "-" + b + " ");
				}
			}
			System.out.println();
		}
	}

	private static void baris_Kol2(int k) {
		int x = 0;
		for (int a = 0; a <= k; a++) {

			for (int b = 0; b < a; b++) {
				if (a <= b) {
					System.out.print(" ");
				} else {
					System.out.print(a + "-" + b + "-" + x + " ");
					x += 5;
				}
			}
			System.out.println();
		}
	}

	public static void matrikKotak(int baris, int kolom) {
		int x = 1, z = 1, k = 1;
		for (int i = 1; i <= baris; i++) {
			for (int j = 1; j <= kolom; j++) {
				if (j == 1) {
					int a = z * 2;
					System.out.print(a + "\t");
					z = a;
				} else if (i == 1 && j != 1 && j != kolom) {
					int y = x * 3;
					System.out.print(y + "\t");
					x = y;
				} else if (j == kolom) {
					System.out.print((9 * i) + "\n");
				} else if (i == baris && j != 1 && j != kolom) {
					int b = k * 5;
					System.out.print(b + "\t");
					k = b;
				} else {
					System.out.print("\t");
				}
			}
		}
	}

}
