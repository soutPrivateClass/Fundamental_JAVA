package com.second;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStream {
    public static void main(String[] args) throws FileNotFoundException, java.io.IOException {

        // Byte Stream
        // Perkarakter akan diambil / dibaca sebagai byte

        // Membuat / membuka file file input

        FileInputStream data1 = null;
        FileOutputStream data2 = null;

        data1 = new FileInputStream("punyaku.txt");

        // Membaca file perkarakter, menggunakan perulangan

        int file1 = data1.read();

        while (file1 != -1) {
            System.out.print((char) file1);
            file1 = data1.read();
        }

        // Menutup file

        data1.close();

        // Menggunakan try finally dengan output file keaplikasi (bukan ke console)
        // Gakusah menggunakan blok catch karena sudah melemparkan trhows pada method

        try {

            // Membuka file
            data1 = new FileInputStream("punyaku.txt");
            data2 = new FileOutputStream("punyaku2.txt");

            // Membaca file
            int file2 = data1.read();
            while (file2 != -1) {
                data2.write(file2);
                file2 = data1.read();
            }

        } finally {
            if (data1 != null) {
                data1.close();
            }

            if (data2 != null) {
                data2.close();
            }
        }

        // try with resources
        // Menggunakan seperti ini juga bisa

        try (
            FileInputStream in = new FileInputStream("punyaku.txt");
            FileOutputStream out = new FileOutputStream("punyaku3.txt");
            
            ){

            int baca = in.read();
            while (baca != -1) {
                out.write((char) baca);
                baca = in.read();
            }
        }

    }
}