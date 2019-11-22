package Function;

public class OutputClass {

	public void tampilMatrik2D(int[][] dataMatrik) {
		int baris = dataMatrik.length;
		int kolom = dataMatrik[0].length;

		for (int a = 0; a < baris; a++) {
			System.out.print("[");
			for (int b = 0; b < kolom; b++) {
				System.out.print(dataMatrik[a][b]);
				if (b < kolom - 1) {
					System.out.print(" ");
				} else {
					System.out.print("]");
				}
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}

	public void tampilMatrik1D(int[] dataMatrik) {
		int baris = dataMatrik.length;

		System.out.print("[");
		for (int a = 0; a < baris; a++) {
			System.out.print(dataMatrik[a]);
			if (a < baris - 1) {
				System.out.print(",");
			} else {
				System.out.print("]");
			}
		}
		System.out.print("\n");
	}

}
