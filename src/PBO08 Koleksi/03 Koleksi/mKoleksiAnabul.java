/************************************/
/* Nama file	: mKoleksiAnabul.java */
/* Deskripsi	: main Class Koleksi Anabul */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 15-06-2025 */
/***********************************/

public class mKoleksiAnabul {
    public static void main(String[] args) {
        Anabul3 meng = new Kucing3("meng bintwul");
        Anabul3 wuk = new Anjing3("gukguk");
        Anabul3 wurr = new Burung3("buwung");

        KoleksiAnabul K = new KoleksiAnabul();
        K.addAnabul(meng);
        K.addAnabul(wuk);
        K.addAnabul(wurr);

        K.showAllAnabul();

        System.out.println("-----------------");

        K.deleteAnabul("buwung");
        K.showAllAnabul();
    }
}
