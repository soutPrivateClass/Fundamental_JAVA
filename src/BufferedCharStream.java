package com.second;

import java.io.*;
import java.util.Arrays;

public class BufferedCharStream {
    public static void main(String[] args) throws Exception {

        // Buffered Character Stream adalah metode membaca & menulis file melalui memory
        // sehingga lebih efisien dan lebih cepat dibanding dengan membaca langsung dari
        // file

        // Membuka file
        FileReader fileIn = new FileReader("File.txt");
        BufferedReader buffIn = new BufferedReader(fileIn);
        buffIn.mark(200);

        // Membaca kedalam String
        String data = buffIn.readLine();
        System.out.println(data);

        
        buffIn.reset();
        // Membaca kedalam char
        char[] data2 = new char[23];
        buffIn.read(data2);
        System.out.print(Arrays.toString(data2));
        System.out.println();


        buffIn.reset();
        // Membaca baris
        String data3 = buffIn.readLine();
        System.out.println(data3);
        String data4 = buffIn.readLine();
        System.out.println(data4);

        

    
        // Menulis file
        FileWriter fileOut = new FileWriter("File2.txt");
        BufferedWriter buffOut = new BufferedWriter(fileOut);

        buffIn.reset();
        String baris1 = buffIn.readLine();
        String baris2 = buffIn.readLine();

        buffOut.write(baris1);
        buffOut.flush();

        // Menambahkan new line atau enter

        buffOut.newLine();
        buffOut.write(baris2);
        buffOut.flush();

        fileIn.close();
        buffIn.close();
        fileOut.close();
        buffOut.close();

    }
}