
/************************************/
/* Nama file	: KoleksiAnabul.java */
/* Deskripsi	: Class KoleksiAnabul */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 15-06-2025 */
/***********************************/

import java.util.ArrayList;

public class KoleksiAnabul {
    /* ATRIBUT */
    private ArrayList<Anabul3> anabulList;
    private int nbelm;

    /* METHOD */
    // KONSTRUKTOR
    public KoleksiAnabul() {
        anabulList = new ArrayList<>();
        nbelm = 0;
    }

    public KoleksiAnabul(ArrayList<Anabul3> anabulList) {
        this.anabulList = anabulList;
        this.nbelm = anabulList.size();
    }

    // GETTER
    public ArrayList<Anabul3> getAnabulList() {
        return anabulList;
    }

    public int getNbelm() {
        return nbelm;
    }

    // SETTER
    public void setAnabulList(ArrayList<Anabul3> anabulList) {
        this.anabulList = anabulList;
        this.nbelm = anabulList.size();
    }

    // METHOD LAIN
    public void addAnabul(Anabul3 anabul) {
        anabulList.add(anabul);
    }

    public void deleteAnabul(String nama) {
        anabulList.removeIf(anabul -> anabul.getNama().equals(nama));
        this.nbelm = anabulList.size();
    }

    public void showAllAnabul() {
        for (Anabul3 anabul : anabulList) {
            System.out.println(anabul.getNama());
            System.out.println("Suara: ");
            anabul.Bersuara();
            System.out.println("Gerak: ");
            anabul.Gerak();
            System.out.println("--------------------");
        }
    }
}
