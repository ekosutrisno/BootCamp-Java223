package Pertemuan2;

public class LatihanSoalD {

	public static void main(String[] args) {
		String str = "cat dog";
              
		firstHalf(str);
		System.out.println();

		lastTwo(str);
		System.out.println();

		doubleChar(str);
		System.out.println();

		System.out.println(catDog(str));
		System.out.println();

		System.out.println();

		makeOutWord("<<>>", "Pak Bowo Keren");

	}

	public static void makeOutWord(String str1, String str2) {
		int a = str1.length();
		String kata1 = str1.substring(0, a / 2);
		String kata2 = str1.substring(a / 2, a);
		System.out.println(kata1 + str2 + kata2);
	}

	public static void firstHalf(String str) {
		String data = "";
		int a = str.length();
		data = str.substring(0, a / 2);
		System.out.println(data);
	}

	public static void lastTwo(String str) {
		int panjang = str.length();
		String kata1 = str.substring(panjang - 1, panjang);
		String kata2 = str.substring(panjang - 2, panjang - 1);
		String hasil = str.substring(0, panjang - 2);
		System.out.println(hasil + kata1 + kata2);
	}

	public static void doubleChar(String str) {
		int panjang = str.length();
		for (int i = 0; i < panjang; i++) {
			System.out.print(str.charAt(i) + "" + str.charAt(i) + "");
		}
	}

	public static boolean catDog(String str) {
		String kata = str.toLowerCase();
		if (kata.contains("cat") && kata.contains("dog"))
			return true;
		else
			return false;
	}

	public static String replaceInput(String input, String separator) {
		String spl = input.replace(" ", separator);
		return spl;
	}

}
