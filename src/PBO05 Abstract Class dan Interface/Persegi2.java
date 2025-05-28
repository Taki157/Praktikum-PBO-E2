/************************************/
/* Nama file	: Persegi.java */
/* Deskripsi	: membuat class Persegi yang menjadi subclass BangunDatar */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 13-03-2025 */
/***********************************/

public class Persegi2 extends BangunDatar2 implements Iresize {
    /* ATRIBUT */
    private double sisi;

    /* METHOD */
    // KONSTRUKTOR
    public Persegi2() {
        setJmlSisi(4);
    }

    public Persegi2(double sisi, String warna, String border) {
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

    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
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

    // METHOD LAIN
    @Override
    public void zoomIn() {
        sisi *= 1.1;
    }

    @Override
    public void zoomOut() {
        sisi *= 0.9;
    }

    @Override
    public void zoom(int persen) {
        sisi *= persen / 100.0;
    }
    
}
