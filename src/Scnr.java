package com.second;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Scnr {
    public static void main(String[] args) throws Exception {
        FileReader in = new FileReader("File.txt");
        BufferedReader bfr = new BufferedReader(in);
        bfr.mark(200);

        // Digunakan untuk membaca file setiap kata :

        Scanner scnr = new Scanner(bfr);
        System.out.println(scnr.next());

        scnr.close();
        System.out.println();

        bfr.reset();
        // Digunakan untuk membaca file setiap baris :

        FileReader in2 = new FileReader("File.txt");
        BufferedReader bfr2 = new BufferedReader(in2);

        scnr = new Scanner(bfr2);
        System.out.println(scnr.nextLine());

        scnr.close();
        System.out.println();

        bfr.reset();
        // Digunakan untuk membaca pada semua isi file :

        FileReader in3 = new FileReader("File.txt");
        BufferedReader bfr3 = new BufferedReader(in3);

        scnr = new Scanner(bfr3);

        while (scnr.hasNext()) {
            System.out.println(scnr.next());
        }

        scnr.close();
        System.out.println();

        

        bfr.reset();
        // Bisa juga menggunakan String Tokenizer untuk membaca setiap baris

        String data = bfr.readLine();

        StringTokenizer tkn = new StringTokenizer(data);

        while (tkn.hasMoreTokens()) {
            System.out.println(tkn.nextToken());
        }
    }
}