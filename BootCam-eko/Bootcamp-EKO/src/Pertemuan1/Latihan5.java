package Pertemuan1;

public class Latihan5 {

	public static void main(String[] args) {
		matriks(5, 6);
		// Memanggil fungsi array dengan kelas yang berbeda
		Latihan8 lt8 = new Latihan8();
		int[] a = lt8.ambilArray(5);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}

	}

	public static void matriks(int bar, int kol) {
		for (int a = 0; a <= bar; a++) {
			for (int b = 0; b <= kol; b++) {
				if (a == 0 && b == 0) {
					System.out.print(b + "\t");
				} else if (a == 0 && b != 0) {
					System.out.print(b + "\t");
				} else if (a != 0 && b == 0) {
					System.out.print(a + "\t");
				} else {
					int x = a * b;
					System.out.print(x + "\t");
				}
			}
			System.out.println();
		}
	}
}
