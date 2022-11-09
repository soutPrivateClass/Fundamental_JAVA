import  java.util.Scanner;
public class Exception {

    // Exception adalah penangkapan error yang terjadi saat runtime
    // untuk menangkap error agar supaya program tetap berjalan
    // menggunakan keywords try, catch, finally
    
    // Beberapa Exception yang sering terjadi pada java diantaranya adalah :
    // 1. Arithmetic Exception : untuk perhitungan aritmatika, misalkan sebuah angka dibagi 0
    // 2. Null Pointer Exception : bila object yang ingin diakses masih null, maka tidak bisa akses method dari object tersebut
    // 3. Number Format Exception : bila ingin melakukan casting tipe data String ke int maka akan terjadi kesalahan ini
    // 4. IO Exception : bila yang diminta adalah angka, tapi yang diinputkan adalah String
    // 5. ArrayOutOfBoundsException : bila index yang diinputkan melebihi kapasitas yang sebelumnya sudah didefinisikan
   


    public static void main(String[] args) {
        int index;
        Scanner in = new Scanner(System.in);

        int[] array = {0,1,2,3,4};
        System.out.print("Inputan index ke = " );
        index = in.nextInt();
        try {
            System.out.printf("index %d, adalah %d\n", index, array[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        } finally {
            System.out.println("program akhir");
            System.out.println("Sukses!");
        }
    }
}
