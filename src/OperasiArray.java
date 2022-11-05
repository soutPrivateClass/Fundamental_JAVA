import java.util.Arrays;
public class OperasiArray {
    public static void main(String[] args) {

        // mengcopy array

        int angka1 [] = {1,2,3,4,5};
        printArray(angka1);

        int angka2 [] = new int[5];
        printArray(angka2 = angka1);

        //==============================================================================

        // mengcopy array menggunakan looping
        System.out.println("Mengcopy array menggunakan looping");

        int angka3 [] = new int[5];
        for ( int i = 0 ; i < angka1.length ; i++){
            angka3[i] = angka1[i];
        }
        printArray(angka1);
        printArray(angka3);

        //==============================================================================

        // mengcopy array menggunakan copyOf
        System.out.println("Mengcopy array menggunakan copyOf");

        int angka4 [] = Arrays.copyOf(angka1, 5);
        printArray(angka1);
        printArray(angka4);

        //==============================================================================

        // mengcopy array menggunakan copyOfRange
        System.out.println("Mengcopy array menggunakan copyOfRange");

        int angka5 [] = Arrays.copyOfRange(angka1,0,5);
        printArray(angka1);
        printArray(angka5);

        //==============================================================================

        // Fill array
        System.out.println("Fill array");

        int angka6 [] = new int[10];
        Arrays.fill(angka6, 30);
        printArray(angka6);
        Arrays.fill(angka6, 30);
        printArray(angka6);

        //==============================================================================

        // komparasi dalam array
        System.out.println("Logika / komparasi array");

        int angka7 [] = {1,2,3,4,5};
        int angka8 [] = {1,2,3,4,5};

        //==============================================================================

        // menggunakan class helper equals untuk logika
        if (Arrays.equals(angka7, angka8)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        //==============================================================================

        // menggunakan class helper compare untuk membandingkan yang lebih besar
        System.out.println("Komparasi array");

        System.out.println(Arrays.compare(angka7,angka8)); // ketika yang lebih besar angka7 akan return 1, sebaliknya akan (-1)

        //==============================================================================

        // menggunakan class helper mismatch untuk membandingkan yang berbeda
        System.out.println("Mis match array");

        System.out.println(Arrays.mismatch(angka7, angka8)); // untuk check index mana yang berbeda

        //==============================================================================

        // menggunakan class helper sort untuk mengurutkan dari yang terkecil sebelum dilakukan search
        System.out.println("Sorting");

        int angka9 [] = {12,3,4,12,2,34,44,1,2};
        printArray(angka9);
        Arrays.sort(angka9);
        printArray(angka9);

        // menggunakan class helper search untuk mencari nilai sesudah dilakukan sort
        System.out.println("Search");

        printArray(angka9);
        int nilai = 44;
        int index = Arrays.binarySearch(angka9, nilai);
        System.out.println("Angka " + nilai + " ada di index ke : " + index );
    }

    private static void printArray (int dataArray[]){
        System.out.println(Arrays.toString(dataArray));
    }
}
