/************************************/
/* Nama file	: mAnabul.java */
/* Deskripsi	: Main Class Anabul */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 28-05-2025 */
/***********************************/

public class mAnabul {
    public static void main(String[] args) {
        /* KAMUS */
        Anabul meng;
        Anabul gukguk;
        Anabul bwuung;

        /* ALGORITMA */
        meng = new Kucing("Kiko");
        gukguk = new Anjing("Hehe");
        bwuung = new Burung("Kakatua");

        meng.Bersuara();
        meng.Gerak();

        gukguk.Bersuara();
        gukguk.Gerak();

        bwuung.Bersuara();
        bwuung.Gerak();

    }
    
}
