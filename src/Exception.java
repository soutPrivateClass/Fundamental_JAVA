import  java.util.Scanner;
public class Exception {

    // Exception adalah penangkapan error yang terjadi saat runtime
    // untuk menangkap error agar supaya program tetap berjalan
    // menggunakan keywords try, catch, finally


    public static void main(String[] args) {
        int index;
        Scanner in = new Scanner(System.in);

        int[] array = {0,1,2,3,4};
        System.out.print("Inputan index ke = " );
        index = in.nextInt();
        try {
            System.out.printf("index %d, adalah %d\n", index, array[index]);
        } catch (Throwable ex){
            System.err.println(ex);
        } finally {
        }
            System.out.println("program akhir");
        System.out.println("Sukses!");

    }
}
