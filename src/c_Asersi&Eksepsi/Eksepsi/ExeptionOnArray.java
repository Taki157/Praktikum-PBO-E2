/************************************/
/* Program   : ExeptionOnArray.java */
/* Deskripsi : contoh eksepsi dengan library java */
/* NIM/Nama  : 240601230012/SYAFIQ ABIYYU TAQI*/
/* Tanggal   : 11-03-2025*/
/***********************************/

public class ExeptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 12;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("Clean up code...");
        }
    }
}
