/************************************/
/* Nama file	: Kucing.java */
/* Deskripsi	: Class Kusing */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 28-05-2025 */
/***********************************/
public class Kucing3 extends Anabul3{
    /* ATRIBUT */
    /* METHOD */
    // KONSTRUKTOR
    public Kucing3() {
        super();
    }

    public Kucing3(String name) {
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
