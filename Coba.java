public class Coba {

    public static void main(String[] args) {
        System.out.println("SELAMAT DATANG DO PT.XSIS");
        System.out.println("------------------------\n");
        
	//Menghitung Luas Lingkaran
	double pi = 3.14;
        double r = 9.4;
        double luas = pi * r * r;
        System.out.println("Luas Lingkaran adalah " + luas + " cm");


        //Memanggil Fungsi "kelilingSegitiga"
	int a = 3, b = 4, c = 5; 
        int keliling = kelilingSegitiga(a,b,c);

	System.out.println();
        System.out.println("Keliling Segitiga adalah: "+ keliling + " Cm");

	//Memanggil Fungsi "energiPanas"
	double t1 = 25, t2 = 60;
        double energiPanas = energiPanas(t1,t2);

	System.out.println();
        System.out.printf("Besar Energi Panas adalah: "+ energiPanas+" Joule\n");
    }

    //Fungsi Buat Menghitung keliling segitiga
    private static int kelilingSegitiga(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }


    //Fungsi Buat Menghitung besar energi panas
    private static double energiPanas (double t1, double t2){
     	double C = 4, M = 5;
     	double Q = M * C * (t2 - t1);
     	return Q;
   }

}