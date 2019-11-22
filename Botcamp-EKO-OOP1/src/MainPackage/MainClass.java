package MainPackage;

import java.util.Scanner;

import ArrayPackage.Array4;
import ArrayPackage.Array1;
import ArrayPackage.Array2;
import ArrayPackage.Array3;
import ArrayPackage.ArrayMultiDimensi;

public class MainClass {

	private static Scanner scn;

	public static void main(String[] args) {
		Array1 arr = new Array1();
		Array2 arr2 = new Array2();
		Array3 arr3 = new Array3();

		Array4 arr4 = new Array4();
		int[][] myMatrik = new int[3][4];
		int[][] outMatrik = arr4.inputMatrik(myMatrik);
		arr.printArrayMD(outMatrik);

		ArrayMultiDimensi arr5 = new ArrayMultiDimensi(); // 
		System.out.println();// Barisbaru
		scn = new Scanner(System.in);
		System.out.print("Masukkan Baris: ");
		int iO = scn.nextInt();
		System.out.print("Masukkan Kolom: ");
		int oP = scn.nextInt();
		
		
		
		

		// Mengecek dan mengurutkan Array
		int[] a = arr2.ambilArray(5); // Memamsukkan angka
		int[] cek = arr2.bubleShort(a); // Mengurutkan angka
		arr.printArray(cek); // cetak angka terurut
		double median = arr3.cariMedian(cek); // Mengambil median angka terurut
		double mean = arr3.cariMean(cek); // Mengambil mean angka terurut
		double max = arr3.cariMaksimum(cek); // Mengambil mean angka terurut
		double min = arr3.cariMinimum(cek); // Mengambil mean angka terurut

		System.out.print("| Median = " + median); // Menampilakn Median
		System.out.print("| Mean = " + mean); // Menampilakn Mean
		System.out.print("| Max = " + max); // Menampilakn Max
		System.out.print("| Min = " + min); // Menampilakn Max

		System.out.println();// Baris Baru


	}

}
