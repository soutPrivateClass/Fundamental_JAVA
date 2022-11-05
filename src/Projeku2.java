import java.util.Scanner;

public class Projeku2 {
    public static void main(String[] args) {

        int member;

        System.out.print("Pilihan : \n 0. Member silver dengan minimal belanja Rp 100_000 \n 1. Member silver dengan minimal belanja Rp 500_000 \n 2. Member gold dengan minimal belanja Rp 100_000 \n 3. Member gold dengan minimal belanja Rp 500_000 \n 4. Member platinum dengan minimal belanja Rp 100_000 \n 5. Member platinum dengan minimal belanja Rp 500_000 \n 6. non member dengan minimal belanja Rp 100_000 " );
        Scanner in2 = new Scanner(System.in);
        member = in2.nextInt();

        switch (member) {
            case 0 -> System.out.println("Anda mendapatkan diskon sebesar Rp 10_000"); //silver
            case 1 -> System.out.println("Anda mendapatkan diskon sebesar Rp 20_000"); //silver
            case 2 -> System.out.println("Anda mendapatkan diskon sebesar Rp 15_000"); //gold
            case 3 -> System.out.println("Anda mendapatkan diskon sebesar Rp 25_000"); //gold
            case 4 -> System.out.println("Anda mendapatkan diskon sebesar Rp 20_000"); //platinum
            case 5 -> System.out.println("Anda mendapatkan diskon sebesar Rp 35_000"); //platinum
            case 6 -> System.out.println("Anda Mendapatkan diskon sebesar Rp 5_000"); //nonMember
            default -> {
                System.out.println("Kode tidak valid");
            }
        }
    }
}
