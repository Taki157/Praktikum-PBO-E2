/************************************/
/* Nama file	: Kucing.java */
/* Deskripsi	: Class Kusing */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 28-05-2025 */
/***********************************/
public class Kucing2 extends Anabul2{
    /* ATRIBUT */
    /* METHOD */
    // KONSTRUKTOR
    public Kucing2() {
        super();
    }

    public Kucing2(String name) {
        super(name);
    }

    // GETTER
    // SETTER
    // METHOD LAIN
    @Override
    public void Gerak() {
        System.out.println("Berjalan");
    }

    @Override
    public void Bersuara() {
        System.out.println("Meowww...");
    }
}
