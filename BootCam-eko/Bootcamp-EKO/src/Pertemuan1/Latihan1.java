package Pertemuan1;

public class Latihan1 {
	public static void main(String[] args) {
		System.out.println(tambahString("XSIS", "Academy"));
		System.out.println(penjumlahan(5, 9));
		System.out.println(cekAngka(5, 9));
		System.out.println(cekAngka(9, 5));
		System.out.println(cekAngka(5, 5));
		
		System.out.println();
		for(int i=1;i<=12;i++) {
			System.out.println(cekBulan(i));
		}
		angka();
		
	}

	public static String tambahString(String a, String b) {
		return a + "......." + b;
	}

	public static int penjumlahan(int a, int b) {
		return a + b;
	}
	
	public static String cekAngka(int a, int b) {
		String hasil="";
		if(a<b) {
			hasil = "a lebih kecil dari b";
		}
		if(a>b){
			hasil = "a lebih besar dari b";
		}else {
			hasil = "a sama dengan b";
		}
		
		return hasil;
		
	}
	public static String cekBulan(int nomorBulan) {
		String bulan="";
		switch(nomorBulan) {
		case 1: bulan = "Januari"; break;
		case 2: bulan = "February"; break;
		case 3: bulan = "Maret"; break;
		case 4: bulan = "April"; break;
		case 5: bulan = "Mei"; break;
		case 6: bulan = "Juni"; break;
		case 7: bulan = "Juli"; break;
		case 8: bulan = "Agustus"; break;
		case 9: bulan = "September"; break;
		case 10: bulan = "Oktober"; break;
		case 11: bulan = "November"; break;
		case 12: bulan = "Desember"; break;
		}
		
		return bulan;
	}
	
	private static  void angka() {

		  for(int i=1; i<=5; i++)
		    {
		        for(int j=0; j<=3; j++)
		            {
		                if (i==1||i==5||j==0||j==3)
		                {
		                    System.out.print("*");
		                }
		                else
		                {
		                    System.out.print(" ");
		                }
		            }
		        System.out.println("");
		    }
	}
	
}
