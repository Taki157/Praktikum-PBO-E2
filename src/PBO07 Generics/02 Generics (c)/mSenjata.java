/************************************/
/* Nama file	: mSenjata.java */
/* Deskripsi	: main class dari Senjata */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 15-06-2025 */
/***********************************/

public class mSenjata {
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");

        System.out.println("AK47 menembak 1x: "); ak47.menembak(1);
        System.out.println("M16 menembak 2x: "); m16.menembak(2);

        System.out.println("AK47 menusuk: " + ak47.menusuk());
        ak47.pasangBayonet();
        System.out.println("AK47 menusuk: " + ak47.menusuk());
    }
}
