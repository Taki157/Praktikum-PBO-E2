/************************************/
/* Nama file	: PersegiPanjang3.java */
/* Deskripsi	: Class PersegiPanjang3 */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 15-06-2025 */
/***********************************/
public class PersegiPanjang3 extends BangunDatar3 {
    /* ATRIBUT */
    private double panjang;
    private double lebar;

    /* METHOD */
    // KONSTRUKTOR
    public PersegiPanjang3(double p, double l) {
        this.panjang = p;
        this.lebar = l;
    }

    // GETTER
    // SETTER
    // METHOD LAIN
    public double hitungKeliling() {
        return (2 * lebar) + (2 * panjang);
    }
}
