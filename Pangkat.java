import java.util.Scanner;

public class Pangkat{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("RUMUS MENGHITUNG ENERGI");
	
	// memanggil fungsi energi
	double masa = 5;
	double energiC = energi(masa);
	System.out.println("\nEnergi yang dihasilkan dari masa "+masa+ " Kg adalah "+ energiC);
	
	//memnaggil fungsi luasPersegi
	int p = 4, l = 6;
	int hasilLuas = luasPersegi(p, l);
	System.out.println("\nLuas persegi panjang dengan Panjang "+p+" dan lebar "+ l+" adalah "+ hasilLuas);

	//memnaggil fungsi kelLingkaran
	double d = 7;
	double keliling = kelLingkaran(d);
	System.out.println("\nLuas persegi panjang dengan Diameter"+ d+" adalah "+ keliling);
	
	//memnaggil fungsi persen
	double persen = persen(25);
	System.out.println("\n24 Persen dari "+ persen);

	//memnaggil fungsi tinggi
	int i,a;
	System.out.print("Luas: ");
	i = input.nextInt();
	System.out.print("Alas: ");
	a = input.nextInt();

	int tinggi= tinggiSegitiga(i, a);
	System.out.println("\nTinggi segitiga adalah "+ tinggi);
	
	}


	private static double energi( double m){
	int C = 10;
	double erg = m * (C*C);
	return erg;
	}

	private static int luasPersegi(int panjang, int lebar){
	int luas = panjang * lebar;
	return luas;	
	}
	
	private static double kelLingkaran(double d){
	double keliling = 3.14 * d;
	return keliling;
	}

	private static double persen(double n){
	int y = 24;
	double persen = y * (n * 1 / 100);
	return persen;
	}
	
	private static int tinggiSegitiga(int luas, int a){
	return 2 * luas / a;
	}
}