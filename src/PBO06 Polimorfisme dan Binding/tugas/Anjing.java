/************************************/
/* Nama file	: Anjing.java */
/* Deskripsi	: Class Anjing */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 28-05-2025 */
/***********************************/
public class Anjing extends Anabul {
    /* ATRIBUT */
    /* METHOD */
    // KONSTRUKTOR
    public Anjing() {
        super();
    }

    public Anjing(String nama) {
        super(nama);
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
        System.out.println("guk.. guk.. guk..");
    }
}
