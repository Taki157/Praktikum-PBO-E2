/************************************/
/* Program   : Asersi2.java */
/* Deskripsi : contoh asersi pada java */
/* NIM/Nama  : 240601230012/SYAFIQ ABIYYU TAQI*/
/* Tanggal   : 11-03-2025*/
/***********************************/

class Lingkaran{
    /* ATRIBUT */
    private double jariJari;

    /* METHOD */
    // KONSTRUKTOR
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    // METHOD LAIN
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0) : "jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.printf("Keliling lingkaran = " + kelilingLingkaran);
    }
}

/* =====YANG KURANG TEPAT PADA PROGRAM ASERSI2===== */
// 1. Validasi harusnya bagian dari kelas Lingkaran, bukan pada main.
//    Seharusnya validasi jari-jari dilakukan pada konstruktor Lingkaran.
// 2. Seharusnya bukan pesan asersi tidak menampilkan "jari-jari tidak boleh nol!!!"
//    Namun, "Jari-jari tidak boleh nol atau negatif".
