/************************************/
/* Nama file	: BangunDatarGenerikTest.java */
/* Deskripsi	: Class BangunDatarGenerikTest */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 15-06-2025 */
/***********************************/
public class BangunDatarGenerikTest {
    public static void main(String[] args) {
        Lingkaran3 l = new Lingkaran3(2);
        Persegi3 p = new Persegi3(2);
        PersegiPanjang3 pp = new PersegiPanjang3(2, 3);
        Segitiga3 s = new Segitiga3(2);
        BangunDatarGenerik<BangunDatar3> bdg = new BangunDatarGenerik<>();

        bdg.set(l);
        System.out.println("Keliling lingkaran: " + bdg.hitungKeliling());
        System.out.println("tipe generik: " + bdg.get().getClass().getName());

        bdg.set(p);
        System.out.println("Keliling persegi: " + bdg.hitungKeliling());
        System.out.println("tipe generik: " + bdg.get().getClass().getName());

        bdg.set(pp);
        System.out.println("Keliling persegi panjang: " + bdg.hitungKeliling());
        System.out.println("tipe generik: " + bdg.get().getClass().getName());

        bdg.set(s);
        System.out.println("Keliling segitiga: " + bdg.hitungKeliling());
        System.out.println("tipe generik: " + bdg.get().getClass().getName());
    }
}
