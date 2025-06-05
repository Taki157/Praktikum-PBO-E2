/************************************/
/* Nama file	: mAnabul.java */
/* Deskripsi	: Main Class Anabul */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 28-05-2025 */
/***********************************/

public class mAnabul2 {
    public static void main(String[] args) {
        /* KAMUS */
        Anabul2 meng;
        Anabul2 gukguk;
        Anabul2 bwuung;

        /* ALGORITMA */
        meng = new Kucing2("Kiko");
        gukguk = new Anjing2("Hehe");
        bwuung = new Burung2("Kakatua");

        meng.Bersuara();
        meng.Gerak();

        gukguk.Bersuara();
        gukguk.Gerak();

        bwuung.Bersuara();
        bwuung.Gerak();

    }
    
}
