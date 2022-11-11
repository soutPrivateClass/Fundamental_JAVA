package com.second;

import java.lang.StringBuilder;
import java.util.Scanner;

public class LearnString {
    public static void main(String[] args) {

        String Fullname = "SujudRamadhan";

        // MENGAMBIL KOMPONEN CHAR INDEX KE 0 DARI STRING FULLNAME

        System.out.println(Fullname.charAt(0));

        // MENGAMBIL KOMPONEN DENGAN RANGE MENGGUNAKAN SUBSTRING

        String NickName = Fullname.substring(5, 13);

        // MENGGABUNGKAN STRING

        String word1 = NickName + " Cakep";
        System.out.println(word1);

        // MENGGANTI ATAU MENGGUNAKAN STRING MENGGUNAKAN REPLACE

        String word2 = word1.replace("Cakep", "Ganteng");
        System.out.println(word2);

        // Perbandingan dua buah komponen pada string dengan (.equals) bukan menggunakan
        // operasi (==), karna operasi tersebut membandingkan address memory pada String
        // bukan value atau komponennya

        String a, b;
        b = "Rama";

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Inputan String = ");
        a = inputUser.nextLine();

        if (a.equals(b)) {
            System.out.println("Sama");
        } else {
            System.out.println("Tidak sama");
        }

        // COMPARE DUA BUAH STRING

        // DAN MASIH BANYAK LAGI (JANGAN MALAS UNTUK MENGULIK )

        String namaku, namamu;

        namaku = "rama";
        namamu = "jamila";

        System.out.println(namaku.compareTo(namamu));
        System.out.println();

        // HELPER CLASS STRING BUILDER (HARUS IMPORT HELPER CLASS)
        // HELPER CLASS INI LEBIH EFEKTIF KARENA MENYIMPAN PADA MEMORY YANG SAMA

        StringBuilder nama = new StringBuilder("Rama suka");

        print(nama);

        // APPEND
        // sama seperti concat untuk menambahkan nilai string

        nama.append(" belajar");
        print(nama);

        // INSERT
        // menambahkan kata pada string index tertentu

        nama.insert(4, " tidak");
        print(nama);

        // DELETE
        // menghapus data string pada index tertentu

        nama.delete(4, 10);
        print(nama);

        // setCharAt
        // merubah karakter pada index tertentu

        nama.setCharAt(0, 'r');
        print(nama);

        // REPLACE
        // mengubah data string pada index tertentu

        nama.replace(10, 17, "makan");
        print(nama);

        // CASTING MENJADI STRING

        String ubahNilai = nama.toString();
        System.out.println(ubahNilai);

        int address = System.identityHashCode(ubahNilai);
        System.out.println("Address : " + Integer.toHexString(address));

        // DAN MASIH BANYAK YANG LAIN

    }

    private static void print(StringBuilder data) {
        System.out.println(data);

        int address = System.identityHashCode(data);
        System.out.println("Address : " + Integer.toHexString(address));
    }
}
