/************************************/
/* Nama file	: Senjata2.java */
/* Deskripsi	: Class Senjata2 */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 15-06-2025 */
/***********************************/
public class Senjata2 extends Senjata1{
    /* ATRIBUT */
    private String bunyi;
    private int peluru;

    /* METHOD */
    // KONSTRUKTOR
    public Senjata2() {

    }

    public Senjata2(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }

    // GETTER
    public int getPeluru() {
        return this.peluru;
    }

    // SETTER
    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

    // METHOD LAIN
     public void menembak() {
        System.out.println(getBunyi());
        setPeluru(getPeluru() - 1);

        System.out.println("Sisa peluru: " + getPeluru());
     }
}
