/************************************/
/* Nama file	: LambdaMap.java */
/* Deskripsi	: implementasi lambda pada map */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 05-06-2025 */
/***********************************/
import java.util.AbstractMap;
import java.util.TreeMap;

public class LambdaMap {
    public static void main(String[] args) {
        /* KAMUS */
        AbstractMap<String, String> mahasiswaMap;

        /* ALGORITMA */
        mahasiswaMap = new TreeMap<>();

        mahasiswaMap.put("01", "Sidan jomok");
        mahasiswaMap.put("02", "Filbet jomok");
        mahasiswaMap.put("03", "Taki baik");
        mahasiswaMap.put("04", "Bila gk rispek");

        mahasiswaMap.forEach((id, namaNgawi) -> System.out.println(id + " " + namaNgawi));
    }
}
