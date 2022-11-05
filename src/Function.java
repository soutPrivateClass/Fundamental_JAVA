import com.sun.source.tree.ReturnTree;
public class Function {
    public static void main(String[] args) {
        System.out.println("-------------CONTOH PROSEDUR------------------");
        ucapan("ramadhan");
        System.out.println("-----------CONTOH RETURN VALUE----------------");
        System.out.println(hitung(1, "+", 1));
        System.out.println("---------CONTOH VARIABLE ARGUMENT-------------");
        nilaiRaport("Ramadhan", 10, 25, 75);
        nilaiRaport("Joko", 100, 87, 90);
        System.out.println("------------CONTOH OVERLOADING----------------");
        name("Sujud Ramadhan");
        name("Ramadhan Fakih", "Rama");
        System.out.println("------------RECURSIVE METHOD------------------");
        System.out.println(faktor(5));
    }


    /* Prosedure
        Sebuah function yang tidak mengembalikan nilai */

    public static void ucapan(String nama) {
        System.out.println("Hello " + nama);
    }

    /* Function
         Sebuah function yang mengembalikan nilai / return value */

    public static int hitung(int value1, String operasi, int value2) {
        switch (operasi) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                int hasil = 0;
                return hasil;
        }
    }

    /* Method Variable Argument
         jika kita ingin masukkan data yang tidak pasti jumlahnya kedalam parameter
         biasanya menggunakan array sebagai parameter, dan penempatan parameternya diakhir */

    public static void nilaiRaport(String name, int... nilai1) {
        var total = 0;
        for (var n : nilai1) {
            total += n;
        }
        var rataRata = total / nilai1.length;
        if (rataRata >= 75) {
            System.out.println("Hallo " + name + " selamat anda lulus dengan nilai " + rataRata);
        } else {
            System.out.println("Maaf " + name + " anda tidak lulus dengan nilai " + rataRata);
        }
    }
    /* Method overloading adalah kemampuan membuat method dengan nama yang sama lebih dari sekali
         dengan ketentuan, yaitu data parameter yang berbeda entah jumlah atau tipe data parameternya */

    public static void name(String fullName){
        System.out.println(fullName);
    }

    public static void name(String fullName, String nickName){
        System.out.println(fullName + nickName);
    }

    /* Method Recursive
         kemampuan method memanggil dirinya sendiri */

    public static int faktor(int value){
        if (value == 1){
            return 1;
        } else {
            return value * faktor( value - 1);
        }
    }
}

