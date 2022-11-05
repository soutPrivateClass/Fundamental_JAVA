import java.util.Arrays; // ini adalah helper class
public class Array {
    public static void main(String[] args) {

        // Array adalah kumpulan data primitif

        // 1. Array Assignment satu dimensi

        String arrayAssignment [] = {"Sujud", "Ramadhan"};
        for ( int i = 0 ; i < 2 ; i++){
            System.out.print(arrayAssignment[i]);
            System.out.print(" ");
        }
        System.out.println();

        // 2. Array Deklarasi satu dimensi

        int arrayDeklarasi [] = new int[3];

        arrayDeklarasi[0] = 1;
        arrayDeklarasi[1] = 2;
        arrayDeklarasi[2] = 3;

        System.out.println();
        printArray(arrayDeklarasi);
        System.out.println();


        String dataMahasiswa[][] = {
                {" 1.", "Joko  ", "12191601", "Laki - laki", "Majalengka "},
                {" 2.", "Nani  ", "12191802", "Perempuan  ", "Blitar     "},
                {" 3.", "Rey   ", "12191603", "Laki - laki", "Malang     "},
                {" 4.", "Riri  ", "12191604", "Perempuan  ", "Surabaya   "},
                {" 5.", "Joni  ", "12191705", "Laki - laki", "Sidoarjo   "},
                {" 6.", "Reza  ", "12191606", "Laki - laki", "Banyuwangi "},
                {" 7.", "Hari  ", "12191607", "Laki - laki", "Sumatera   "},
                {" 8.", "Putri ", "12191608", "Perempuan  ", "Jombang    "},
                {" 9.", "Hasan ", "12191609", "Laki - laki", "Kalteng    "},
                {"10.", "Jack  ", "12191610", "Laki - laki", "New York   "}
        };
        project(dataMahasiswa);
    }

    private static void project(String recordMahasiswa[][]){
        var word1 = "No";
        var word2 = "Nama";
        var word3 = "NIM";
        var word4 = "Jenis kelamin";
        var word5 = "Kota asal";

        System.out.println("-----------------------------------------------------------");
        System.out.format("|  %s  |  %s   |   %s    | %s |  %s  | \n", word1, word2, word3, word4, word5);
        System.out.println("-----------------------------------------------------------");
        for (String baris [] : recordMahasiswa) {
            for (String kolom : baris) {
                System.out.format("| %s |", kolom);
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------");
    }

    private static void printArray (int cetak []){
        for ( int n = 0 ; n < cetak.length ; n++ ){
            System.out.print(cetak[n]);
        }
    }
}
