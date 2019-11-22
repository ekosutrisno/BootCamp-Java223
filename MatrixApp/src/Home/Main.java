package Home;

import Function.InputClass;
import Function.OutputClass;

public class Main {
	public static void main(String[] args) {

		InputClass inp = new InputClass();
		OutputClass out = new OutputClass();

		int[][] mA = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 } };
		int[][] mB = { { 11, 12 }, { 13, 14 }, { 15, 16 }, { 17, 18 } };

		int[][] mC = { { 1, 2 }, { 3, 4 } };
		int[][] mD = { { 5, 2 }, { 3, 1 } };

		int[] mE = { 1, 2, 3, 4 };
		int[] mF = { 1, 2, 3, 4 };

		int[][] hasilTambah = inp.jumlahMatrik2D(mA, mB);
		int[][] hasilKali = inp.perkalianMatrik2D(mC, mD);
		int[] jumlahMatrik1D = inp.jumlahMatrik1D(mE, mF);
		out.tampilMatrik2D(hasilTambah);
		out.tampilMatrik2D(hasilKali);
		out.tampilMatrik1D(mE);
		out.tampilMatrik1D(mF);
		System.out.println("---------");
		out.tampilMatrik1D(jumlahMatrik1D);
	}
}
