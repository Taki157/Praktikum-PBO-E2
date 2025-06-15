/************************************/
/* Nama file	: Anjing.java */
/* Deskripsi	: Class Anjing */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 28-05-2025 */
/***********************************/
public class Anjing2 extends Anabul2 {
    /* ATRIBUT */
    /* METHOD */
    // KONSTRUKTOR
    public Anjing2() {
        super();
    }

    public Anjing2(String nama) {
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
