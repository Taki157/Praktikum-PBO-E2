/************************************/
/* Nama file	: Segitiga3.java */
/* Deskripsi	: Class Segitiga3 */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 15-06-2025 */
/***********************************/
public class Segitiga3 extends BangunDatar3 {
    /* ATRIBUT */
    private double sisi;

    /* METHOD */
    // KONSTRUKTOR
    public Segitiga3(double s) {
        this.sisi = s;
    }

    // GETTER
    // SETTER
    // METHOD LAIN
    public double hitungKeliling() {
        return 3 * sisi;
    }
}
