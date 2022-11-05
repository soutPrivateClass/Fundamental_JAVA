import java.util.Scanner;

public class Projeku {
    public static void main(String[] args) {


        int member, kartuMember, totalBelanja;
        //proses dimana sistem mengambil nilai inputan user, untuk mengetahui nilai total belanjaan
        System.out.print("Total belanja = ");
        Scanner in1 = new Scanner(System.in);
        totalBelanja = in1.nextInt();

        //proses dimana sistem mengambil nilai inputan user, untuk mengetahui apakah sudah member atau belum
        System.out.print("Apakah anda sudah member (0 = belum, 1 = sudah) ");
        Scanner in2 = new Scanner(System.in);
        member = in2.nextInt();

        //proses dimana sistem mengambil nilai inputan user, untuk mengetahui member jenis apa yang dimiliki oleh user
        System.out.print("Jenis member (0 = Tidak ada 1 = silver, 2 = gold, 3 = platinum) ");
        Scanner in3 = new Scanner(System.in);
        kartuMember = in3.nextInt();


        if (member == 1 && kartuMember == 1 && totalBelanja >= 500000) {
            System.out.println("Anda mendapatkan potongan harga sebesar Rp 20_000");
        } else if (member == 1 && kartuMember == 1 && totalBelanja >= 100000) {
            System.out.println("Anda mendapatkan potongan harga sebesar Rp 10_000");
        } else if (member == 1 && kartuMember == 2 && totalBelanja >= 500000) {
            System.out.println("Anda mendapatkan potongan harga sebesar Rp 25_000");
        } else if (member == 1 && kartuMember == 2 && totalBelanja >= 100000) {
            System.out.println("Anda mendapatkan potongan harga sebesar Rp 15_000");
        } else if (member == 1 && kartuMember == 3 && totalBelanja >= 500000) {
            System.out.println("Anda mendapatkan potongan harga sebesar Rp 35_000");
        } else if (member == 1 && kartuMember == 3 && totalBelanja >= 100000) {
            System.out.println("Anda mendapatkan potongan harga sebesar Rp 20_000");
        } else if (member == 0 && kartuMember == 0 && totalBelanja >= 100000) {
            System.out.println("Anda mendapatkan potongan harga sebesar Rp 5_000");

            //Kondisi validasi member
        } else if (member == 0 && kartuMember == 1) {
            System.out.println("Maaf anda belum terdaftar sebagai member");
        } else if (member == 0 && kartuMember == 2) {
            System.out.println("Maaf anda belum terdaftar sebagai member");
        } else if (member == 0 && kartuMember == 3) {
            System.out.println("Maaf anda belum terdaftar sebagai member");
        } else {
            System.out.println("Maaf anda belum mendapatkan diskon");
        }

    }
}
