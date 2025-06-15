
/************************************/
/* Nama file	: Koleksi.java */
/* Deskripsi	: Class Koleksi */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 15-06-2025 */
/***********************************/

import java.util.ArrayList;

public class Koleksi {
    /* ATRIBUT */
    private ArrayList<String> wadah;
    private int nbelm;

    /* METHOD */
    // KONSTRUKTOR
    public Koleksi() {}

    public Koleksi(ArrayList<String> w) {
        this.wadah = w;
        this.nbelm = w.size();
    }

    // GETTER
    public String getIsi(int index) {
        return wadah.get(index);
    }

    public int getSize() {
        return nbelm;
    }

    // SETTER
    public void setIsi(ArrayList<String> w) {
        this.wadah = w;
        this.nbelm = w.size();
    }

    // METHOD LAIN
    public void add(String elm) {
        wadah.add(elm);
        nbelm = wadah.size();
    }

    public void delete(String elm) {
        wadah.remove(elm);
        nbelm = wadah.size();
    }

    public void showAll() {
        for (String s : wadah) {
            System.out.println(s + " ");
        }
    }
}
