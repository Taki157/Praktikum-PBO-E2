/************************************/
/* Nama file	: labNonKomp.java */
/* Deskripsi	: class labNonKomp */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 27-03-2025 */
/***********************************/

import java.util.ArrayList;

public class labNonKomp extends ruangLab{
    /* ATRIBUT */
    private ArrayList <String> daftarMatkul;

    /* METHOD */
    // KONSTRUKTOR
    public labNonKomp() {
        super();
        this.daftarMatkul = new ArrayList<>();
    }

    public labNonKomp(String kode, int p, int l, int t, int k, String namaLab, int HargaSewa, ArrayList<String> daftarMatkul) {
        super(kode, p, l, t, k, namaLab, HargaSewa);
        this.daftarMatkul = daftarMatkul;
    }

    // GETTER
    public ArrayList<String> getDaftarMatkul() {
        return this.daftarMatkul;
    }

    // SETTER
    public void setDaftarMatkul(ArrayList<String> daftarMatkul) {
        this.daftarMatkul = daftarMatkul;
    }

    // METHOD LAIN
    public void addMatkulLab(String matkul) {
        this.daftarMatkul.add(matkul);
    }

    @Override
    public void printInfoRuang() {
        System.out.println("Kode Ruang\t\t : " + getKode());
        System.out.println("Panjang Ruang\t\t : " + getPanjang());
        System.out.println("Lebar Ruang\t\t : " + getLebar());
        System.out.println("Tinggi Ruang\t\t : " + getTinggi());
        System.out.println("Kapasitas Ruang\t\t : " + getKapasitas());
        System.out.println("Nama Lab\t\t : " + getNamaLab());
        System.out.println("Harga Sewa\t\t : " + getHargaSewa());
        System.out.println("Biaya Kebersihan\t : " + biayaKebersihan());
        System.out.println("Daftar Mata Kuliah\t : ");
        for (String matkul : this.daftarMatkul) {
            System.out.println("\t- " + matkul);
        }
    }
}
 