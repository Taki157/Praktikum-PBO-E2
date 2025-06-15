/************************************/
/* Nama file	: BangunDatarGenerik.java */
/* Deskripsi	: Class BangunDatarGenerik */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 15-06-2025 */
/***********************************/
public class BangunDatarGenerik<T extends BangunDatar3> {
    /* ATRIBUT */
    private T bangunDatar;

    /* METHOD */
    // KONSTRUKTOR
    public void set(T tipeBagunDatar) {
        bangunDatar = tipeBagunDatar;
    }

    // GETTER
    public T get() {
        return bangunDatar;
    }

    // SETTER
    
    // METHOD LAIN
    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
}
