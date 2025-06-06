/************************************/
/* Program   : Garis.java */
/* Deskripsi : atribut dan method dalam class Garis */
/* NIM/Nama  : 240601230012/SYAFIQ ABIYYU TAQI*/
/* Tanggal   : 20-02-2025*/
/***********************************/

public class Garis {
    /* ATRIBUT */
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int countGaris = 0;

    /* METHOD */
    // KONSTRUKTOR
    // Konstruktor default (titikAwal (0,0) dan titikAkhir (1,1))
    public Garis() {
        titikAwal = new Titik();
        titikAkhir = new Titik(1,1);
        countGaris++;
    }

    // Konstruktor untuk membuat garis dengan titik awal (x1,y1) dan titik akhir (x2,y2)
    public Garis(double x1, double y1, double x2, double y2) {
        titikAwal = new Titik(x1,y1);
        titikAkhir = new Titik(x2,y2);
        countGaris++;
    }

    // SELEKTOR
    // GETTER
    // Mengembalikan titik awal
    public Titik getTitikAwal() {
        return titikAwal;
    }

    // Mengembalikan titik akhir
    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    // Mengembalikan jumlah garis yang telah dibuat
    public static int getCountGaris() {
        return countGaris;
    }

    // Mengembalikan panjang garis
    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    // Mengembalikan nilai gradien garis
    public double getGradien() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // Mengembalikan titik tengah garis
    public Titik getTitikTengah() {
        return new Titik((titikAkhir.getAbsis() - titikAwal.getAbsis())/2, (titikAkhir.getOrdinat() - titikAwal.getOrdinat())/2);
    }

    // Mengembalikan apakah garis sejajar dengan garis lain
    public boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }

    // Mengembalikan apakah garis tegak lurus dengan garis lain
    public boolean isTegakLurus(Garis g) {
        return this.getGradien() == -1/g.getGradien();
    }

    // Mencetak titik awal dan akhir garis
    public void printGaris() {
        System.out.println("Titik Awal\t: " + "(" + titikAwal.getAbsis() + "," + titikAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir\t: " + "(" + titikAkhir.getAbsis() + "," + titikAkhir.getOrdinat() + ")");
    }

    // Mencetak persamaan garis
    public void persamaanGaris() {
        double c = titikAwal.getOrdinat() - (this.getGradien() * titikAwal.getAbsis());
        System.out.println("Persamaan garis\t : y = " + this.getGradien() + "x + " + c);
    }

}