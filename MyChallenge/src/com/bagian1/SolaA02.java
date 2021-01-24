package com.bagian1;

import java.util.Scanner;

public class SolaA02 {

	private static Scanner input1, input2, input3, input4, input5,input6;
	static int pin,kode_bank,no_rek, setor_tunai, saldo, nominal;
	 

	public static void main(String[] args) {

		boolean kond = true;
		int ulang = 0;
		
		while(kond) {
		
		input1 = new Scanner(System.in);
		System.out.println("=======================================|\n" 
						 + "=====Selamat datang di Bank Xsis=======|\n"
						 + "=======================================|\n");
		System.out.println("---------------------------------------");
		System.out.print("Masukkan Pin: ");
		pin = input1.nextInt();

		if (pin == 123456) {

			input2 = new Scanner(System.in);
			System.out.print("Masukkan jumlah Setor tunai: Rp.");
			setor_tunai = input2.nextInt();

			System.out.println("\n*Saldo anda Rp." + setor_tunai);
			System.out.println("-------Pilih Transaksi tranfer-------|");
			System.out.println("1.  Antar Rekening\n2.  Antar Bank\n");

			input3 = new Scanner(System.in);
			System.out.print("Pilih transaksi: ");
			String pilihan_transakasi = input3.next();

			switch (pilihan_transakasi) {
			
			case "1":
				System.out.println("*Transfer antar rekening");
				input4 = new Scanner(System.in);
				System.out.print("Masukkan nomor rekening Tujuan (10 Digit):");
				no_rek = input4.nextInt();

				if (no_rek == 1234567890) {
					input4 = new Scanner(System.in);
					System.out.print("Masukkan Nominal trsansfer: Rp.");
					nominal = input4.nextInt();
					System.out.print("Masukkan Pin:");
					pin = input4.nextInt();
					if(pin==123456) {
						tranfer_antar_rekening(setor_tunai, no_rek, nominal);
					}else {
						System.out.println("Pin salah");
					}	
					
				} else {
					System.out.println("*Nomor rekening tidak valid / salah.");
				}
				break;

			case "2":
				System.out.println("*Transfer antar Bank");
				input5 = new Scanner(System.in);
				System.out.print("(BRI 001 | BNI 002 | BCA 003 ) \nMasukkan kode bank:");
				no_rek = input5.nextInt();
				System.out.print("Masukkan nomor rekening Tujuan (10 Digit):");
				no_rek = input5.nextInt();

				if (no_rek == 1234567890) {
					input5 = new Scanner(System.in);
					System.out.print("Masukkan Nominal trsansfer: Rp.");
					nominal = input5.nextInt();
					System.out.print("Masukkan Pin:");
					pin = input5.nextInt();
					if(pin==123456) {
						tranfer_antar_bank(setor_tunai, no_rek, nominal);
					}else {
						System.out.println("Pin salah");
					}
					
				} else {
					System.out.println("*Nomor rekening tidak valid.");
				}
				break;

			default:
				System.out.println("*Pilihan transaksi tidak tersedia!");
			}
		} else {
			System.out.println("*Pin Salah");
		}
		
			input6 = new Scanner(System.in);
			System.out.print("Melanjutkan transaksi (y/n)? ");
			String isLanjut = input6.next();
			if (isLanjut.equalsIgnoreCase("y")) {
				kond = true;
			} else {
				System.out.println("*Aplikasi ditutup");
				kond = false;
			}
			
			ulang++;
			if(ulang==5) {
			System.out.println("*Silahkan Restart aplikasi anda");
			kond=false;
			}
		}
	}

	private static void tranfer_antar_rekening(int saldo, int no_rek, int nominal) {
		if (saldo > nominal) {
			int transfer = saldo - nominal;
			System.out.println("Transaksi berhasil, saldo anda saat ini Rp. " + transfer);
		} else {
			System.out.println("*Saldo tidak mencukupi");
		}
	}

	private static void tranfer_antar_bank(int saldo, int no_rek, int nominal) {
		int biayaAdmin = 7500;
		if (saldo > nominal) {
			int transfer = saldo - (nominal + biayaAdmin);
			System.out.println("*Transaksi berhasil, saldo anda saat ini Rp. " + transfer);
		} else {
			System.out.println("*Saldo tidak mencukupi");
		}
	}
}
