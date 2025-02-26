/************************************/
/* Program   : Titik.java */
/* Deskripsi : atribut dan method dalam class Titik */
/* NIM/Nama  : 240601230012/SYAFIQ ABIYYU TAQI*/
/* Tanggal   : 20-02-2025*/
/***********************************/

public class Titik {
    /* ATRIBUT */
    double absis;
    double ordinat;
    static int countTitik = 0;

    /* METHOD */
    // KONSTRUKTOR
    // Konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
        countTitik++;
    }

    // Konstruktor untuk membuat titik (x,y)
    Titik(double x, double y) {
        absis = x;
        ordinat = y;
        countTitik++;
    }

    // SELEKTOR
    // GETTER
    // Mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // Mengembalikan jumlah titik yang telah dibuat
    static int getCountTitik() {
        return countTitik;
    }

    // SETTER
    // Mengatur absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    // Mengatur ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser nilai titik sejauh dx dan dy
    void geser(double dx, double dy) {
        absis += dx;
        ordinat += dy;
    }

    // Mencetak koordinat titik
    void printTitik() {
        System.out.println("(" + absis + "," + ordinat + ")");
    }

    // Mengembalikan kuadran dari titik
    int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return  1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    // Mengembalikan jarak titik dari pusat (0,0)
    double getJarakPusat() {
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    // Mengembalikan jarak titik dengan titik yang lain
    double getJarak(Titik T){
        return Math.sqrt(Math.pow((absis - T.absis), 2) + Math.pow((ordinat - T.ordinat), 2));
    }

    // Melakukan refleksi terhadap sumbu x
    void refleksiX() {
        ordinat = -ordinat;
    }

    // Melakukan refleksi terhadap sumbu y
    void refleksiY() {
        absis = -absis;
    }

    // Mengembalikan refleksi titik terhadap sumbu x
    Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    // Mengembalikan refleksi titik terhadap sumbu y
    Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }
    
} // end class of Titik