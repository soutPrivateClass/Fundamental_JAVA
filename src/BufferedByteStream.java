package com.second;

import java.io.*;

public class BufferedByteStream {
    public static void main(String[] args) throws Exception {

        // Buffered Byte Stream adalah metode membaca & menulis file melalui memory
        // sehingga lebih efisien dan lebih cepat dibanding dengan membaca langsung dari
        // file

        // Contoh :
        FileInputStream byteIn = new FileInputStream("punyaku.txt");
        BufferedInputStream bufferIn = new BufferedInputStream(byteIn);

        byte[] arrayku = bufferIn.readAllBytes();
        String dataArrayku = new String(arrayku);
        System.out.println(dataArrayku);

        byteIn.close();
        bufferIn.close();

        // Menulis dengan buffered output

        // Contoh :
        FileOutputStream byteOut = new FileOutputStream("File_Buffer.txt");
        BufferedOutputStream bufferOut = new BufferedOutputStream(byteOut);

        // Menulis data berupa byte (bukan string)
        // tambah parameter index jika diperlukan dibelakang array
        // dan masih disimpan dalam aplikasi (belum di flush)
        bufferOut.write(arrayku, 0, arrayku.length);
        // flush untuk menampilkan kedalam output
        bufferOut.flush();

        byteOut.close();
        bufferOut.close();

    }
}