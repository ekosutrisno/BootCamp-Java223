package com.bagian1;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World, Eko Sutrisno");
		
		int angka=123456,count=0;
		
		while(angka>0) {
			angka = angka/10;
			count++;
		}
		System.out.println(count);
		
		System.out.println(digit(123456));
	}
	
	private static int digit(long angka) {
		int count=0;
		while(angka>0) {
			angka = (angka-(angka%10))/10;
			count++;
		}
		return count;
	}
	
}
