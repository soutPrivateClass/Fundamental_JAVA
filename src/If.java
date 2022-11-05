public class If {
    public static void main(String[] args) {
        //var absen = 20; //pakai ini bisa
        //var nilai = 75;

        int absen,nilai; //pakai ini juga bisa
        absen = 20;
        nilai = 75;

        if (absen >= 20 && nilai >= 75) {
            System.out.println("Anda lulus");
        } else {
            System.out.println("Maaf anda belum lulus");
        }
    }
}
