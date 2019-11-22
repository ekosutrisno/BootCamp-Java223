package Pertemuan2;

public class DebuggingClass {

	public static void main(String[] args) {

		int[] array = new int[5];
		try {
			array[3] = 9;
			array[5] = 13;
			System.out.print(array[3] + " " + array[5]);
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Panjang array salah");
			array[3] = 9;
			array[5] = 13;
			System.out.print(array[3] + " " + array[5]);
		} finally {
			array[2] = array[3] + array[4];
			System.out.println(array[2]);
		}
	}

}
