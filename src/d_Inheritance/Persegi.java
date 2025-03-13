/************************************/
/* Nama file	: Persegi.java */
/* Deskripsi	: membuat class Persegi yang menjadi subclass BangunDatar */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 13-03-2025 */
/***********************************/

public class Persegi extends BangunDatar {
    /* ATRIBUT */
    private double sisi;

    /* METHOD */
    // KONSTRUKTOR
    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;

        // Jika atribut superclass protected
        // this.jmlSisi = 4;
        // this.warna = warna;
        // this.border = border;

        // Jika atribut superclass private (opsuonal)
        // this.setWarna(warna);
        // this.setBorder(border);
        // this.setJmlSisi(4);
    }
    // GETTER
    public double getSisi() {
        return sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return Math.sqrt(2 * sisi);
    }

    // SETTER
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}
