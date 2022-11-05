import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        // FOR LOOP
        // looping yang terdiri dari { init steatment ; kondisi ; post steatment }

        // contoh syntax :

        for ( int i = 5 ; i >= 1 ; i--  ){
            System.out.println("Looping ke " + i);
        }

        // contoh kasus for :

//        Scanner inputUser = new Scanner(System.in);
//        int nilaiAwal,nilaiAkhir;
//
//        System.out.print("Masukkan nilai awal = " );
//        nilaiAwal = inputUser.nextInt();
//        System.out.print("Masukkan nilai akhir = " );
//        nilaiAkhir = inputUser.nextInt();
//
//        for ( int total = 0 ; nilaiAwal <= nilaiAkhir ; nilaiAwal++){
//            total += nilaiAwal;
//            System.out.printf("Nilai sekarang %d menjadi %d\n", nilaiAwal, total);
//        }

        // WHILE LOOP
        // looping yang hanya terdiri dari kondisi saja

        // contoh syntax :

        var n = 50;
        while ( n >= 1 ){
            System.out.println("Looping ke " + n);
            n--;
        }

        // contoh kasus while :

        //Scanner inputUser = new Scanner(System.in);
//        int nilaiAwal,nilaiAkhir,total;
//
//        System.out.print("Masukkan angka awal = " );
//        nilaiAwal = inputUser.nextInt();
//        System.out.print("Masukkan angka akhir = " );
//        nilaiAkhir = inputUser.nextInt();
//
//        total = 0;
//        while (nilaiAwal <= nilaiAkhir){
//            total += nilaiAwal;
//            nilaiAwal++;
//            System.out.printf("nilai sekarang %d menjadi %d, ", nilaiAwal, total);
//        }

        // DO WHILE LOOP
        // Dilakukan perulangan dulu lalu di cek kondisinya / kebalikan dari while

        // contoh syntax do while :

        var j = 50;
        do {
            System.out.println("Looping ke " + j);
            j--;
        } while ( j >= 1 );

        // contoh kasus do while :

        // Scanner inputUser = new Scanner(System.in);
//        int nilaiAwal,nilaiAkhir,total;
//        total = 0;
//
//        System.out.print("Masukkan nilai awal = " );
//        nilaiAwal = inputUser.nextInt();
//        System.out.print("Masukkan nilai akhir = " );
//        nilaiAkhir = inputUser.nextInt();
//
//        do {
//            System.out.printf("Nilai sekarang %d menjadi %d, ", nilaiAwal, total);
//            nilaiAwal++;
//            total += nilaiAwal;
//        } while (nilaiAwal <= nilaiAkhir);
    }
}
