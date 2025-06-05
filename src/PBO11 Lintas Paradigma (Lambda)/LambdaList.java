
import java.util.ArrayList;

/************************************/
/* Nama file	: LambdaList.java */
/* Deskripsi	: implementasi lambda pada list */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 05-06-2025 */
/***********************************/

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        //lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }    
}
