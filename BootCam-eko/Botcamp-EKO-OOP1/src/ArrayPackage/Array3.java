package ArrayPackage;

public class Array3 {

	public static int[] arrayUmum;

	// Mencari nilai median dari sebuah array
	public double cariMedian(int[] median) {
		Array2 arr = new Array2();
		int[] cek = arr.bubleShort(median);
		int p = median.length;
		double me = 0.0;

		if (median.length % 2 == 1) {
			me = cek[p / 2];
		} else {
			me = ((double) (cek[p / 2] + cek[(p / 2) - 1])) / 2;
		}
		return me;
	}

	// Mencari nilai median dari sebuah array tanpa parameter
	public double cariMedian() {
		Array2 arr = new Array2();
		int[] cek = arr.bubleShort(Array3.arrayUmum);
		int p = Array3.arrayUmum.length;
		double me = 0.0;

		if (p % 2 == 1) {
			me = cek[p / 2];
		} else {
			me = ((double) (cek[p / 2] + cek[(p / 2) - 1])) / 2;
		}
		return me;
	}

	// mencari nilai mean dari sebuah array dengan parameter
	public double cariMean(int[] mean) {
		int n = mean.length;
		double mea = 0.0;
		double jumlah = 0;

		for (int i = 0; i < n; i++) {
			jumlah = jumlah + mean[i];
		}
		mea = jumlah / n;
		return mea;
	}

	public int cariMaksimum(int[] max) {
		int maksimum = max[0];
		int jumlah = max.length;
		for (int i = 0; i < jumlah; i++) {
			if (max[i] > maksimum) {
				maksimum = max[i];
			}
		}
		return maksimum;
	}

	// mencari nilai mean dari sebuah array dengan parameter
	public int cariMinimum(int[] min) {
		int minimum = min[0];
		int jumlah = min.length;
		for (int i = 0; i < jumlah; i++) {
			if (min[i] < minimum) {
				minimum = min[i];
			}
		}
		return minimum;
	}

}
