/************************************/
/* Nama file	: lingkaran.java */
/* Deskripsi	: membuat class Lingkaran yang menjadi subclass BangunDatar */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 13-03-2025 */
/***********************************/

public class Lingkaran2 extends BangunDatar2 implements Iresize{
    /* ATRIBUT */
    private double jari;

    /* METHOD */
    // KONSTRUKTOR
    public Lingkaran2() {
        setJmlSisi(1);
    }

    public Lingkaran2(double diameter, String warna, String border) {
        super(1, warna, border);
        this.jari = diameter / 2;
        // this.setWarna(warna);
        // this.setBorder(border);
        // this.setJmlSisi(1);
    }

    // GETTER
    public double getJari() {
        return jari;
    }

    public double getDiameter() {
        return 2 * jari;
    }

    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    @Override
    public double getKeliling() {
        return Math.PI * getDiameter();
    }
    
    // SETTER
    public void setJari(double jari) {
        this.jari = jari;
    }

    // METHOD LAIN
    @Override
    public void zoomIn() {
        jari *= 1.1;
    }

    @Override
    public void zoomOut() {
        jari *= 0.9;
    }

    @Override
    public void zoom(int persen) {
        jari *= persen / 100.0;
    }
}
