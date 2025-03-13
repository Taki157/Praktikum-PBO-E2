/************************************/
/* Nama file	: BangunDatar.java */
/* Deskripsi	: Membuat class BangunDatar */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 13-03-2025 */
/***********************************/

public class BangunDatar {
    /* ATRIBUT */
    private int jmlSisi;
    private String warna;
    private String border;

    // protected  int jmlSisi;
    // protected  String warna;
    // protected  String border;

    // final atribut harus diinisialisasi
    // final int jmlSisi = 1;
    // final String warna = "Merah";
    // final String border = "Hitam";

    private static int countBangunDatar = 0;

    /* METHOD */
    // KONSTRUKTOR
    public BangunDatar() {
        countBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        countBangunDatar++;
    }

    // GETTER
    public int getJmlSisi() {
        return jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public String getBorder() {
        return border;
    }

    // SETTER
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    // METHOD LAIN
    public void printInfor() {
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public static int countBangunDatar() {
        return countBangunDatar;
    }
};