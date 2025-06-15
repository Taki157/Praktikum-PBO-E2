/************************************/
/* Nama file	: TestSenjata.java */
/* Deskripsi	: main class e */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 15-06-2025 */
/***********************************/
public class TestSenjata {
    public static void main(String[] args) {
        Senjata2 ak47 = new Senjata2("TAR");
        Senjata2 m16 = new Senjata2("DOR");
        KontrolSenjata kontrolAK47 = new KontrolSenjata(ak47);
        KontrolSenjata kontrolM16 = new KontrolSenjata(m16);

        kontrolAK47.menembak(2);
        kontrolAK47.isiPeluru(3);
        kontrolAK47.menembak(5);

        System.out.println("================================");

        kontrolM16.menembak(1);
        kontrolM16.isiPeluru(5);
        kontrolM16.isiPeluru(2);
    }
}
