package com.latihan;

import java.io.IOException;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) throws IOException {

      Scanner pilihanUser = new Scanner(System.in);
      String pilihan;
      boolean ulangi = true;
      while (ulangi) {
         clearScreen();
         System.out.println("Database Perpustakaan\n");
         System.out.println("1.\tLihat seluruh Buku");
         System.out.println("2.\tCari data Buku");
         System.out.println("3.\tTambah data Buku");
         System.out.println("4.\tUbah data Buku");
         System.out.println("5.\tHapus data Buku");

         System.out.print("\nPilihan anda: ");
         pilihan = pilihanUser.next();
         switch (pilihan) {
            case "1":
               System.out.println("\n-----------------");
               System.out.println("LIST SELURUH BUKU");
               System.out.println("-----------------");
               tampilkanData();
               break;
            case "2":
               System.out.println("\n---------------");
               System.out.println("CARI DATA BUKKU");
               System.out.println("---------------");
               break;
            case "3":
               System.out.println("\n----------------");
               System.out.println("TAMBAH DATA BUKU");
               System.out.println("----------------");
               break;
            case "4":
               System.out.println("\n--------------");
               System.out.println("UBAH DATA BUKU");
               System.out.println("--------------");
               break;
            case "5":
               System.out.println("\n---------------");
               System.out.println("HAPUS DATA BUKU");
               System.out.println("---------------");
               break;
            default:
               System.err.println("\n-----------------------------");
               System.err.println("Pilihan menu tidak tersedia\nSilahkan pilih '1 - 5'");
               System.err.println("-----------------------------");
         }

         ulangi = getYesNo("Apakah anda akan melanjutkan");
      }

   }


   public static void tampilkanData() throws IOException {
      System.out.println("Disini akan menampilkan semua data buku diperpustakaan");
   }

   public static boolean getYesNo(String pesan) {
      Scanner pilihanUser = new Scanner(System.in);
      System.out.print("\n" + pesan + "(y/n)?");
      String pilihan = pilihanUser.next();
      while (!pilihan.equalsIgnoreCase("y") && !pilihan.equalsIgnoreCase("n")) {
         System.err.println("Pilihan anda bukan y atau n!");
         System.out.print("\n" + pesan + "(y/n)?");
         pilihan = pilihanUser.next();
      }
      return pilihan.equalsIgnoreCase("y");
   }


   public static void clearScreen() {
      try {
         if (System.getProperty("os.name").contains("windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
         } else {
            System.out.print("\033\143");
         }
      } catch (Exception ex) {
         System.err.println("Tidak bisa Clear Screen");
      }
   }
}
