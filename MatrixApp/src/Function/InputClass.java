package Function;

public class InputClass {

	public int[][] jumlahMatrik2D(int[][] matrikA, int[][] matrikB) {

		int barisA = matrikA.length;
		int kolomA = matrikA[0].length;
		int barisB = matrikB.length;
		int kolomB = matrikB[0].length;

		int[][] jumlah = new int[barisA][kolomA];

		if (barisA == barisB && kolomA == kolomB) {
			for (int a = 0; a < barisA; a++) {
				for (int b = 0; b < kolomA; b++) {
					jumlah[a][b] = matrikA[a][b] + matrikB[a][b];
				}
			}
		} else {
			System.out.println("Ordo Matrik tidak Sama!, output '0'");
		}
		return jumlah;

	}

	public int[][] perkalianMatrik2D(int[][] matrikA, int[][] matrikB) {
		int barisA = matrikA.length;
		int kolomA = matrikA[0].length;
		int barisB = matrikB.length;
		int kolomB = matrikB[0].length;
		int[][] perkalian = new int[barisA][kolomB];
		int simpan;

		if (kolomA == barisB) {
			for (int a = 0; a < barisA; a++) {
				for (int b = 0; b < kolomB; b++) {
					simpan = 0;
					for (int c = 0; c < kolomA; c++) {
						simpan += matrikA[a][c] * matrikB[c][b];
					}
					perkalian[a][b] = simpan;
				}
			}
		} else {
			System.out.println("Jumlah Kol Matrik 1 != Jumlah Bar Matrik 2");
		}
		return perkalian;

	}

	public int[] jumlahMatrik1D(int[] matA, int[] matB) {

		int barA = matA.length;
		int kolA = matA.length;
		int barB = matB.length;
		int kolB = matB.length;

		int[] hasil = new int[barA];
		if (barA == barB && kolA == kolB) {
			for (int a = 0; a < barA; a++) {
				hasil[a] = matA[a]+matB[a];
			}

		} else {
			System.out.println("Ordo Matrik Berbeda!");
		}
		return hasil;
	}

	public int[] perkalianMatrik1D(int[] matA, int[] matB) {

		int barA = matA.length;
		int kolA = matA.length;
		int barB = matB.length;
		int kolB = matB.length;

		int[] hasil = new int[barA];
		if (barA == barB && kolA == kolB) {
			for (int a = 0; a < barA; a++) {
				for (int b = 0; b < kolA; b++) {
					hasil[a] = matA[a] * matB[b];
				}
			}

		} else {
			System.out.println("Ordo Matrik Berbeda!");
		}
		return hasil;
	}

}
