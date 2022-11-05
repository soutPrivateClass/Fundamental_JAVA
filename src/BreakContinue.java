public class BreakContinue {
    public static void main(String[] args) {

        //Break pada looping akan menghentikan proses perulangan

        var i = 10;

        while (true){
            System.out.println(i);
            i--;

            if ( i <= 0 ){
                break;
            }
        }

        // Continue pada looping akan menghentikan perulangan saat ini dan melanjutkan ke loop selanjutnya

        for (var n = 50; n >= 1 ; n-- ){
            if ( n % 2 == 0 ){
                continue;
            }
            System.out.println("bilangan " + n);
        }
    }
}
