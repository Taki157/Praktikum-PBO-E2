/************************************/
/* Nama file	: MapTest.java */
/* Deskripsi	: Class MapTest */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 15-06-2025 */
/***********************************/

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        
        map.put(1, "satu");
        map.put(2, "dua");

        System.out.println(map.get(1));

        Set<Integer> key = map.keySet();
    }
}
