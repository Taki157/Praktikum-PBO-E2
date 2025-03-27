/************************************/
/* Nama file	: ruang.java */
/* Deskripsi	: class ruang */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 27-03-2025 */
/***********************************/

public abstract class ruang {
    /* ATRIBUT */
    private String kode;
    private int panjang;
    private int lebar;
    private int tinggi;
    private int kapasitas;

    /* METHOD */
    // KONSTRUKTOR
    public ruang() {
        this.kode = "000";
        this.panjang = 0;
        this.lebar = 0;
        this.tinggi = 0;
        this.kapasitas = 0;
    }

    public ruang(String kode, int p, int l, int t, int k) {
        this.kode = kode;
        this.panjang = p;
        this.lebar = l;
        this.tinggi = t;
        this.kapasitas = k;
    }

    // GETTER
    public String getKode() {
        return this.kode;
    }

    public int getPanjang() {
        return this.panjang;
    }

    public int getLebar() {
        return this.lebar;
    }

    public int getTinggi() {
        return this.tinggi;
    }

    public int getKapasitas() {
        return this.kapasitas;
    }

    // SETTER
    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setPanjang(int p) {
        this.panjang = p;
    }

    public void setLebar(int l) {
        this.lebar = l;
    }

    public void setTinggi(int t) {
        this.tinggi = t;
    }

    public void setKapasitas(int k) {
        this.kapasitas = k;
    }

    // METHOD LAIN
    public int hitungLuas() {
        return this.panjang * this.lebar;
    }

    public abstract void printInfoRuang();
}
