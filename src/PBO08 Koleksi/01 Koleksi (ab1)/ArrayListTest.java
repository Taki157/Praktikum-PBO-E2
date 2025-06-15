/************************************/
/* Nama file	: ArrayListTest.java */
/* Deskripsi	: Class ArrayListTest */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 15-06-2025 */
/***********************************/

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generik");

        strings.remove("praktikum");

        for(String s : strings) {
            System.out.println(s + " ");
        }
    }
    
}
