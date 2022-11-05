import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        int nilaiUts,nilaiUas;

        System.out.print("Masukkan nilai UTS");
        Scanner uts = new Scanner(System.in);
        nilaiUts = uts.nextInt();

        System.out.println("Masukkan nilai UAS");
        Scanner uas = new Scanner(System.in);
        nilaiUas = uas.nextInt();

        if (nilaiUas >= 100 && nilaiUts >= 100){
            System.out.println("Nilai anda = A");
        } else if (nilaiUas >= 80 && nilaiUts >= 80 ) {
            System.out.println("Nilai anda = B");
        } else if (nilaiUas >= 70 && nilaiUts >= 70) {
            System.out.println("Nilai anda C");
        } else if (nilaiUas >= 60 && nilaiUts >= 60) {
            System.out.println("Nilai anda D");
        } else {
            System.out.println("Nilai anda E");
        }
    }
}
