
import java.util.ArrayList;

/************************************/
/* Nama file	: main.java */
/* Deskripsi	: Class main untuk tugas koleksi 3.5 */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 15-06-2025 */
/***********************************/
public class main {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        A.add("1");
        A.add("2");
        A.add("3");
        A.add("4");
        A.add("5");
        A.add("6");
        A.add("7");
        A.add("8");
        A.add("9");
        A.add("10");
        Koleksi K = new Koleksi(A);
        K.showAll();
        System.out.println("K nbelm: " + K.getSize());
        K.add("11");
        K.delete("1");
        K.showAll();

    }
}
