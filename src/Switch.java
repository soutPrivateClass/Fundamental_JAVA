public class Switch {
    public static void main(String[] args) {
        //switch expression

        String nilai = "A";
        String ucapan;

        switch (nilai){
            case "A" :
                System.out.println("Selamat anda lulus memuaskan");
                break;
            case "B" :
                System.out.println("Selamat anda lulus dengan baik");
                break;
            case "C" :
                System.out.println("Anda lulus");
                break;
            case "D" :
                System.out.println("Anda lulus kurang memuaskan");
                break;
            default:
                System.out.println("Maaf anda tidak lulus");
        }

        // switch Lambda

        switch (nilai){
            case "A" -> System.out.println("Selamat anda lulus");
            case "B" -> System.out.println("Nilai anda Baik");
            case "C" -> System.out.println("Nilai anda Cukup");
            case "D", "E" -> System.out.println("Maaf anda tidak lulus"); // jika ingin pakai 2 case
            default -> {
                System.out.println("Maaf data yang anda inputkan salah"); //jika ingin pakai 2 output
                System.out.println("Anda harus mengulang tahun depan");
            }
        }

        // switch dengan yield atau return

        ucapan = switch (nilai){
            case "A" :
                yield "Selamat anda lulus";
            case "B" :
                yield "Nilai anda Baik";
            case "C" :
                yield "Nilai anda Cukup";
            case "D", "E" :
                yield "Maaf anda tidak lulus"; // jika ingin pakai 2 case
            default :
                yield "Maaf data yang anda inputkan salah";

        };
    }
}
