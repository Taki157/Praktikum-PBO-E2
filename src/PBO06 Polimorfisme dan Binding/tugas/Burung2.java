/************************************/
/* Nama file	: Burung.java */
/* Deskripsi	: Class Burung */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 28-05-2025 */
/***********************************/
public class Burung2 extends Anabul2{
    /* ATRIBUT */
    /* METHOD */
    // KONSTRUKTOR
    public Burung2() {
        super();
    }

    public Burung2(String nama) {
        super(nama);
    }

    // GETTER
    // SETTER
    // METHOD LAIN
    @Override
    public void Gerak() {
        System.out.println("Terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println("oeoeoeoeoeoe...");
    }
}
