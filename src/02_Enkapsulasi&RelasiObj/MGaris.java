

/************************************/
/* Program   : MGaris.java */
/* Deskripsi : Aplikasi Class Garis */
/* NIM/Nama  : 240601230012/SYAFIQ ABIYYU TAQI*/
/* Tanggal   : 21-02-2025*/
/***********************************/

public class MGaris {
    public static void main(String[] args) {
        /* TEST CASE */
        System.out.println("====Test Case====");

        // KONSTRUKTOR
        System.out.println("\nKONSTRUKTOR");
        // Konstruktor Default
        System.out.println("Test Case 1 : Garis() default constructor");
        Garis G1 = new Garis();
        G1.printGaris();

        // Konstruktor custom titik awal dan akhir
        System.out.println("\nTest Case 2 : Garis(double x1, double y1, double x2, double y2) constructor");
        Garis G2 = new Garis(0,0,0,2);
        G2.printGaris();

        // SELEKTOR
        System.out.println("\nSELEKTOR");
        // GETTER
        System.out.println("GETTER");

        // getTitikAwal()
        System.out.println("\nTest Case 3 : getTitikAwal()");
        Titik titikAwalG1 = G1.getTitikAwal();
        System.out.println("Titik awal\t: " + "(" + titikAwalG1.absis + "," + titikAwalG1.ordinat + ")");

        // getTitikAkhir()
        System.out.println("\nTest Case 4 : getTitikAkhir()");
        Titik titikAkhirG1 = G1.getTitikAkhir();
        System.out.println("Titik akhir\t: " + "(" + titikAkhirG1.absis + "," + titikAkhirG1.ordinat + ")");

        // getCountGaris()
        System.out.println("\nTest Case 5 : getCountGaris()");
        System.out.println("Jumlah garis\t: " + Garis.getCountGaris());

        // getPanjang()
        System.out.println("\nTest Case 6 : getPanjang()");
        System.out.println("Pajang garis\t: " + G2.getPanjang());
        
        // getGradien()
        System.out.println("\nTest Case 7 : getGradien()");
        System.out.println("Gradien garis\t: " + G2.getGradien());

        // getTitiktengah()
        System.out.println("\nTest Case 8 : getTitikTengah()");
        Titik titikTengahG1 = G1.getTitikTengah();
        System.out.println("Titik tengah\t: " + "(" + titikTengahG1.absis + "," + titikTengahG1.ordinat + ")");
        
        //PREDIKAT
        System.out.println("\nPREDIKAT");
        // isSejajar(Garis g)
        System.out.println("\nTest Case 9 : isSejajar(Garis g)");
        boolean sejajar = G1.isSejajar(G2);
        System.out.println("G1 dan G2 Sejajar\t: " + sejajar);
        
        // isTegakLurus(Garis G)
        System.out.println("\nTest Case 10 : isTegakLurus(Garis G)");
        boolean TegakLurus = G1.isTegakLurus(G2);
        System.out.println("G1 dan G2 Tegak Lurus\t: " + TegakLurus);

        // METHOD LAIN
        System.out.println("\nMETHOD LAIN");
        // printGaris()
        System.out.println("\nTest Case 11 : printGaris()");
        System.out.println("G1 :");
        G1.printGaris();
        System.out.println("G2 :");
        G2.printGaris();

        // persamaanGaris()
        System.out.println("\nTest Case 12 : persamaanGaris()");
        System.out.println("G1 :");
        G1.persamaanGaris();
        System.out.println("G2 :");
        G2.persamaanGaris();
    }
}
