package com.practice;

import java.util.Arrays;
import java.io.FileReader;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.time.Year;

public class CRUD {
    public static void main(String[] args) throws Exception {

        System.out.println();
        Scanner inputCmd = new Scanner(System.in);
        Boolean benar = true;

        while (benar) {
            // clearScreen();
            System.out.println("1. SHOW ALL THE BOOKS");
            System.out.println("2. SEARCH BOOK");
            System.out.println("3. ADD BOOK");
            System.out.println("4. CHANGED BOOK");
            System.out.println("5. DELETE BOOK\n");

            System.out.print("Make your choice = ");
            String pilihan = inputCmd.nextLine();

            switch (pilihan) {
                case "1":
                    System.out.println("\n================");
                    System.out.println("SHOW ALL THE BOOKS");
                    System.out.println("==================");
                    System.out.println();
                    read();
                    break;

                case "2":
                    System.out.println("\n=========");
                    System.out.println("SEARCH BOOK");
                    System.out.println("===========");
                    searchData();
                    break;

                case "3":
                    System.out.println("\n======");
                    System.out.println("ADD BOOK");
                    System.out.println("========");
                    add();
                    read();
                    break;

                case "4":
                    System.out.println("\n=========");
                    System.out.println("UPDATE BOOK");
                    System.out.println("===========");
                    updateData();
                    break;

                case "5":
                    System.out.println("\n=========");
                    System.out.println("DELETE BOOK");
                    System.out.println("===========");
                    delete();
                    break;

                default:
                    System.out.println("Sorry! your data is invalid!");
            }
            benar = getYesOrNo("\nDo you wanna to return ? ");
            System.out.println();
        }
    }

    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("gitbash", "/c", "clear").inheritIO().start().waitFor();
            } else {
                System.out.println("\033\143");
            }
        } catch (Exception ex) {
            System.out.println("Clear screen failed");
        }
    }

    private static boolean getYesOrNo(String word) {
        Scanner inputCmd = new Scanner(System.in);
        System.out.print(word + "(y or n) ");
        String inputUser = inputCmd.next();

        while (!inputUser.equalsIgnoreCase("y") && !inputUser.equalsIgnoreCase("n")) {
            System.err.println("Upsss! Sorry your data is invalid\nyou can only enter y or n\n");
            System.out.print(word + "(y/n) ");
            inputUser = inputCmd.next();
        }
        return inputUser.equalsIgnoreCase("y");
    }

    private static void read() throws Exception {

        FileReader fileInput;
        BufferedReader buffInput;

        try {
            fileInput = new FileReader("database.txt");
            buffInput = new BufferedReader(fileInput);

        } catch (Exception e) {
            System.err.println("Ups Data not found!\nPlease enter data first!");
            return;
        }

        String data = buffInput.readLine();

        System.out.println(
                "===========================================================================================================");
        System.out.println("| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku");
        System.out.println(
                "===========================================================================================================");

        int nomorData = 0;
        while (data != null) {
            nomorData++;

            StringTokenizer tkn = new StringTokenizer(data, ",");

            tkn.nextToken();
            System.out.printf("| %2d ", nomorData);
            System.out.printf("|\t%4s  ", tkn.nextToken());
            System.out.printf("|\t%-20s   ", tkn.nextToken());
            System.out.printf("|\t%-20s   ", tkn.nextToken());
            System.out.printf("|\t%s   ", tkn.nextToken());
            System.out.print("\n");

            data = buffInput.readLine();
        }
        System.out.println(
                "===========================================================================================================");
    }

    private static void searchData() throws Exception {
        // Membaca database ada atau tidak

        try {
            FileReader file = new FileReader("database.txt");
        } catch (Exception e) {
            System.err.println("Data not found!");
            System.err.println("Enter your data first!");
            return;
        }

        // Ambil keyword dari user

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan kata kunci untuk mencari buku: ");
        String cariString = input.nextLine();
        String[] keywords = cariString.split("\\s+");

        // kita cek keyword di database
        cekBukuDatabase(keywords,true);
    }

    private static boolean cekBukuDatabase(String[] keywords, boolean isDisplay) throws IOException {

        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        String data = bufferInput.readLine();
        boolean isExist = false;
        int nomorData = 0;

        if (isDisplay) {
            System.out.println(
                    "----------------------------------------------------------------------------------------------------------");
            System.out.println("| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku");
            System.out.println(
                    "----------------------------------------------------------------------------------------------------------");
        }

        while (data != null) {

            // cek keywords didalam baris
            isExist = true;

            for (String keyword : keywords) {
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
            }

            // jika keywordsnya cocok maka tampilkan

            if (isExist) {
                if (isDisplay) {
                    nomorData++;
                    StringTokenizer stringToken = new StringTokenizer(data, ",");

                    stringToken.nextToken();
                    System.out.printf("| %2d ", nomorData);
                    System.out.printf("|\t%4s  ", stringToken.nextToken());
                    System.out.printf("|\t%-20s   ", stringToken.nextToken());
                    System.out.printf("|\t%-20s   ", stringToken.nextToken());
                    System.out.printf("|\t%s   ", stringToken.nextToken());
                    System.out.print("\n");
                } else {
                    break;
                }
            }
            data = bufferInput.readLine();
        }
        if (isDisplay) {
            System.out.println(
                    "----------------------------------------------------------------------------------------------------------");
        }

        return isExist;
    }

    private static void add() throws Exception {
        FileWriter fileOutput = new FileWriter("database.txt", true);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        // mengambil input dari user
        Scanner terminalInput = new Scanner(System.in);
        String penulis, judul, penerbit, tahun;

        System.out.print("masukan nama penulis: ");
        penulis = terminalInput.nextLine();
        System.out.print("masukan judul buku: ");
        judul = terminalInput.nextLine();
        System.out.print("masukan nama penerbit: ");
        penerbit = terminalInput.nextLine();
        System.out.print("masukan tahun terbit, format=(YYYY): ");
        tahun = ambilTahun();

        // cek buku di database

        String[] keywords = { tahun + "," + penulis + "," + penerbit + "," + judul };
        System.out.println(Arrays.toString(keywords));

        boolean isExist = cekBukuDatabase(keywords, false);

        // menulis buku di databse
        if (!isExist) {
            // fiersabesari_2012_1,2012,fiersa besari,media kita,jejak langkah
            System.out.println(ambilEntryPerTahun(penulis, tahun));
            long nomorEntry = ambilEntryPerTahun(penulis, tahun) + 1;

            String punulisTanpaSpasi = penulis.replaceAll("\\s+", "");
            String primaryKey = punulisTanpaSpasi + "_" + tahun + "_" + nomorEntry;
            System.out.println("\nData yang akan anda masukan adalah");
            System.out.println("----------------------------------------");
            System.out.println("primary key  : " + primaryKey);
            System.out.println("tahun terbit : " + tahun);
            System.out.println("penulis      : " + penulis);
            System.out.println("judul        : " + judul);
            System.out.println("penerbit     : " + penerbit);

            boolean isTambah = getYesOrNo("Apakah akan ingin menambah data tersebut? ");

            if (isTambah) {
                bufferOutput.write(primaryKey + "," + tahun + "," + penulis + "," + penerbit + "," + judul);
                bufferOutput.newLine();
                bufferOutput.flush();
            }

        } else {
            System.out.println("buku yang anda akan masukan sudah tersedia di database dengan data berikut:");
            cekBukuDatabase(keywords, true);
        }

        bufferOutput.close();
    }

    private static String ambilTahun() throws Exception{
        boolean tahunValid = false;
        Scanner terminalInput = new Scanner(System.in);
        String tahunInput = terminalInput.nextLine();
        while(!tahunValid) {
            try {
                Year.parse(tahunInput);
                tahunValid = true;
            } catch (Exception e) {
                System.out.println("Format tahun yang anda masukan salah, format=(YYYY)");
                System.out.print("silahkan masukan tahun terbit lagi: ");
                tahunValid = false;
                tahunInput = terminalInput.nextLine();
            }
        }

        return tahunInput;
    }

    private static long ambilEntryPerTahun(String penulis, String tahun) throws IOException {
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        long entry = 0;
        String data = bufferInput.readLine();
        Scanner dataScanner;
        String primaryKey;

        while(data != null){
            dataScanner = new Scanner(data);
            dataScanner.useDelimiter(",");
            primaryKey = dataScanner.next();
            dataScanner = new Scanner(primaryKey);
            dataScanner.useDelimiter("_");

            penulis = penulis.replaceAll("\\s+","");

            if (penulis.equalsIgnoreCase(dataScanner.next()) && tahun.equalsIgnoreCase(dataScanner.next()) ) {
                entry = dataScanner.nextInt();
            }

            data = bufferInput.readLine();
        }

        return entry;
    }

    private static void delete() throws  Exception{
        // kita ambil database original
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        // kita buat database sementara
        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        // tampilkan data
        System.out.println("List Buku");
        read();

        // kita ambil user input untuk mendelete data
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\nMasukan nomor buku yang akan dihapus: ");
        int deleteNum = terminalInput.nextInt();

        // looping untuk membaca tiap data baris dan skip data yang akan didelete

        boolean isFound = false;
        int entryCounts = 0;

        String data = bufferedInput.readLine();

        while (data != null){
            entryCounts++;
            boolean isDelete = false;

            StringTokenizer st = new StringTokenizer(data,",");

            // tampilkan data yang ingin di hapus
            if (deleteNum == entryCounts){
                System.out.println("\nData yang ingin anda hapus adalah:");
                System.out.println("-----------------------------------");
                System.out.println("Referensi       : " + st.nextToken());
                System.out.println("Tahun           : " + st.nextToken());
                System.out.println("Penulis         : " + st.nextToken());
                System.out.println("Penerbit        : " + st.nextToken());
                System.out.println("Judul           : " + st.nextToken());

                isDelete = getYesOrNo("Apakah anda yakin akan menghapus?");
                isFound = true;
            }

            if(isDelete){
                //skip pindahkan data dari original ke sementara
                System.out.println("Data berhasil dihapus");
            } else {
                // kita pindahkan data dari original ke sementara
                bufferedOutput.write(data);
                bufferedOutput.newLine();
            }
            data = bufferedInput.readLine();
        }

        if(!isFound){
            System.err.println("Buku tidak ditemukan");
        }

        // menulis data ke file
        bufferedOutput.flush();
        // delete original file
        database.delete();
        // rename file sementara ke database
        tempDB.renameTo(database);

    }


    private static void updateData() throws IOException, Exception{
        // kita ambil database original
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        // kita buat database sementara
        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        // tampilkan data
        System.out.println("List Buku");
        read();

        // ambil user input / pilihan data
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\nMasukan nomor buku yang akan diupdate: ");
        int updateNum = terminalInput.nextInt();

        // tampilkan data yang ingin diupdate

        String data = bufferedInput.readLine();
        int entryCounts = 0;

        while (data != null){
            entryCounts++;

            StringTokenizer st = new StringTokenizer(data,",");

            // tampilkan entrycounts == updateNum
            if (updateNum == entryCounts){
                System.out.println("\nData yang ingin anda update adalah:");
                System.out.println("---------------------------------------");
                System.out.println("Referensi           : " + st.nextToken());
                System.out.println("Tahun               : " + st.nextToken());
                System.out.println("Penulis             : " + st.nextToken());
                System.out.println("Penerbit            : " + st.nextToken());
                System.out.println("Judul               : " + st.nextToken());

                // update data

                // mengambil input dari user

                String[] fieldData = {"tahun","penulis","penerbit","judul"};
                String[] tempData = new String[4];

                st = new StringTokenizer(data,",");
                String originalData = st.nextToken();

                for(int i=0; i < fieldData.length ; i++) {
                    boolean isUpdate = getYesOrNo("apakah anda ingin merubah " + fieldData[i]);
                    originalData = st.nextToken();
                    if (isUpdate){
                        //user input

                        if (fieldData[i].equalsIgnoreCase("tahun")){
                            System.out.print("masukan tahun terbit, format=(YYYY): ");
                            tempData[i] = ambilTahun();
                        } else {
                            terminalInput = new Scanner(System.in);
                            System.out.print("\nMasukan " + fieldData[i] + " baru: ");
                            tempData[i] = terminalInput.nextLine();
                        }

                    } else {
                        tempData[i] = originalData;
                    }
                }

                // tampilkan data baru ke layar
                st = new StringTokenizer(data,",");
                st.nextToken();
                System.out.println("\nData baru anda adalah ");
                System.out.println("---------------------------------------");
                System.out.println("Tahun               : " + st.nextToken() + " --> " + tempData[0]);
                System.out.println("Penulis             : " + st.nextToken() + " --> " + tempData[1]);
                System.out.println("Penerbit            : " + st.nextToken() + " --> " + tempData[2]);
                System.out.println("Judul               : " + st.nextToken() + " --> " + tempData[3]);


                boolean isUpdate = getYesOrNo("apakah anda yakin ingin mengupdate data tersebut");

                if (isUpdate){

                    // cek data baru di database
                    boolean isExist = cekBukuDatabase(tempData,false);

                    if(isExist){
                        System.err.println("data buku sudah ada di database, proses update dibatalkan, \nsilahkan delete data yang bersangkutan");
                        // copy data
                        bufferedOutput.write(data);

                    } else {

                        // format data baru kedalam database
                        String tahun = tempData[0];
                        String penulis = tempData[1];
                        String penerbit = tempData[2];
                        String judul = tempData[3];

                        // kita bikin primary key
                        long nomorEntry = ambilEntryPerTahun(penulis, tahun) + 1;

                        String punulisTanpaSpasi = penulis.replaceAll("\\s+","");
                        String primaryKey = punulisTanpaSpasi+"_"+tahun+"_"+nomorEntry;

                        // tulis data ke database
                        bufferedOutput.write(primaryKey + "," + tahun + ","+ penulis +"," + penerbit + ","+judul);
                    }
                } else {
                    // copy data
                    bufferedOutput.write(data);
                }
            } else {
                // copy data
                bufferedOutput.write(data);
            }
            bufferedOutput.newLine();

            data = bufferedInput.readLine();
        }

        // menulis data ke file
        bufferedOutput.flush();

        // delete original database
        database.delete();
        // rename file tempDB menjadi database
        tempDB.renameTo(database);
    }
}
