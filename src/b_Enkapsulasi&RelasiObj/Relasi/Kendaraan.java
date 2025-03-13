/************************************/
/* Program   : Kendaraan.java */
/* Deskripsi : atribut dan method dalam class Kendaraan */
/* NIM/Nama  : 240601230012/SYAFIQ ABIYYU TAQI*/
/* Tanggal   : 27-02-2025*/
/***********************************/
public class Kendaraan {
    /* ATRIBUT */
    private String NoPlat;
    private String Jenis;

    /* METHOD */
    // KONSTRUKTOR
    // Konstruktor default
    public Kendaraan() {
        this("-","-");
    }

    // Konstruktor custom
    public Kendaraan(String noplat, String jenis) {
        this.NoPlat = noplat;
        this.Jenis = jenis;
    }

    // SELEKTOR
    // Selektor NoPlat
    public String getNoPlat() {
        return NoPlat;
    }

    // Selektor Jenis
    public String getJenis() {
        return Jenis;
    }

    // MUTATOR
    // Mutator NoPlat
    public void setNoPlat(String noplat) {
        this.NoPlat = noplat;
    }

    // Mutator Jenis
    public void setJenis(String jenis) {
        if (Jenis.equalsIgnoreCase("motor") || Jenis.equalsIgnoreCase("mobil")) {
            this.Jenis = jenis;
        } else {
            System.out.println("[Input tidak valid]");
        }
    }

    // Mutator semua atribut
    public void setKendaraan(String noplat,String jenis) {
        this.NoPlat = noplat;
        if (Jenis.equalsIgnoreCase("motor") || Jenis.equalsIgnoreCase("mobil")) {
            this.Jenis = jenis;
        } else {
            System.out.println("[Input tidak valid]");
        }
    }
}
