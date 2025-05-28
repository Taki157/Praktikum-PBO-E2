/************************************/
/* Nama file	: MainInheritance.java */
/* Deskripsi	: placeholders */
/* Pembuat	    : Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal	    : 13-03-2025 */
/***********************************/

public class MainAbstract {
    public static void main(String[] args) {
        //BangunDatar2 B1 = new BangunDatar2(); => gabisa dipanggil soalnya abstract
        BangunDatar2 P1 = new Persegi2(10, "Merah", "Biru");
        Persegi2 P2 = new Persegi2(5, "Biru", "Putih");
        BangunDatar2 L1 = new Lingkaran2(7, "Merah", "Hitam");
        Lingkaran2 L2 = new Lingkaran2(14, "Merah", "Hitam");

        P1.printInfor();
        System.out.println("====================================");
        P2.printInfor();
        System.out.println("====================================");
        L1.printInfor();
        System.out.println("====================================");
        L2.printInfor();
        System.out.println("====================================");
        System.out.println(P1.isEqualLuas(P1));
        System.out.println(P1.isEqualKeliling(P2));
        System.out.println(L1.isEqualLuas(L2));
        System.out.println(L1.isEqualKeliling(L1));

        P2.zoomOut();
        P2.printInfor();
        System.out.println("====================================");
        L2.zoomOut();
        L2.printInfor();
        System.out.println("====================================");
        P2.zoom(200);
        P2.printInfor();
    }
}