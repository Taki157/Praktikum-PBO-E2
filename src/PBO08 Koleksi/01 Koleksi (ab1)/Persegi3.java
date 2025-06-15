/************************************/
/* Nama file	: Persegi3.java */
/* Deskripsi	: Class Persegi3 */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 15-06-2025 */
/***********************************/
public class Persegi3 extends BangunDatar3{
    /* ATRIBUT */
    private double sisi;

    /* METHOD */
    // KONSTRUKTOR
    public Persegi3(double s) {
        this.sisi = s;
    }

    // GETTER
    // SETTER
    // METHOD LAIN
    public double hitungKeliling() {
        return 4 * sisi;
    }
}
