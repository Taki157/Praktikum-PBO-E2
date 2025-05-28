/************************************/
/* Nama file	: ruangDosen.java */
/* Deskripsi	: class ruangDosen */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 27-03-2025 */
/***********************************/

import java.util.ArrayList;

public class ruangDosen extends ruang implements hitungBiayaKebersihan {
    /* ATRIBUT */
    private ArrayList <String> listDosen;
    private int jmlKursi;
    private int jmlMeja;

    /* METHOD */
    // KONSTRUKTOR
    public ruangDosen() {
        super();
        this.listDosen = new ArrayList<>();
        this.jmlKursi = 0;
        this.jmlMeja = 0;
    }

    public ruangDosen(String kode, int p, int l, int t, int k, ArrayList <String> listDosen, int jmlKursi, int jmlMeja) {
        super(kode, p, l, t, k);
        this.listDosen = listDosen;
        this.jmlKursi = jmlKursi;
        this.jmlMeja = jmlMeja;
    }

    // GETTER
    public ArrayList<String> getListDosen() {
        return this.listDosen;
    }

    public int getJmlKursi() {
        return this.jmlKursi;
    }

    public int getJmlMeja() {
        return this.jmlMeja;
    }

    // SETTER
    public void setListDosen(ArrayList<String> listDosen) {
        this.listDosen = listDosen;
    }

    public void setJmlKursi(int jmlKursi) {
        this.jmlKursi = jmlKursi;
    }

    public void setJmlMeja(int jmlMeja) {
        this.jmlMeja = jmlMeja;
    }

    // METHOD LAIN
    public void addDosen(String dosen) {
        this.listDosen.add(dosen);
    }

    @Override
    public int biayaKebersihan() {
        return (getPanjang() * getLebar() * getTinggi() * 1000);
    }

    @Override
    public void printInfoRuang() {
        System.out.println("Kode Ruang\t\t : " + getKode());
        System.out.println("Panjang Ruang\t\t : " + getPanjang());
        System.out.println("Lebar Ruang\t\t : " + getLebar());
        System.out.println("Tinggi Ruang\t\t : " + getTinggi());
        System.out.println("Jumlah Kursi\t\t : " + getJmlKursi());
        System.out.println("Jumlah Meja\t\t : " + getJmlMeja());
        System.out.println("Biaya Kebersihan\t : " + biayaKebersihan());
        System.out.println("Daftar Dosen\t\t : ");
        for (String dosen : this.listDosen) {
            System.out.println("\t- " + dosen);
        }
    }

}
