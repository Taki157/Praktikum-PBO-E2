/************************************/
/* Nama file	: MainInheritance.java */
/* Deskripsi	: placeholders */
/* Pembuat	    : Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal	    : 13-03-2025 */
/***********************************/

public class MainInheritance {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(10, "Merah", "Hitam");
        Persegi p = new Persegi(5, "Biru", "Putih");

        l.printInfor();
        System.out.println("Jari-jari: " + l.getJari());
        System.out.println("Diameter: " + l.getDiameter());
        System.out.println("Luas: " + l.getLuas());
        System.out.println("Keliling: " + l.getKeliling());

        System.out.println();

        p.printInfor();
        System.out.println("Sisi: " + p.getSisi());
        System.out.println("Luas: " + p.getLuas());
        System.out.println("Keliling: " + p.getKeliling());
        System.out.println("Diagonal: " + p.getDiagonal());
    }
}