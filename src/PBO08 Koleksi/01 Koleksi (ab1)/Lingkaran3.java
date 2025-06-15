/************************************/
/* Nama file	: Lingkaran3.java */
/* Deskripsi	: Class Lingkaran3 */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 15-06-2025 */
/***********************************/
public class Lingkaran3 extends BangunDatar3{
    /* ATRIBUT */
    private double jari;

    /* METHOD */
    // KONSTRUKTOR
    public Lingkaran3(double j) {
        this.jari = j;
    }

    // GETTER
    // SETTER
    // METHOD LAIN
    public double hitungKeliling() {
        return 2 * jari * 3.14;
    }
    
}
