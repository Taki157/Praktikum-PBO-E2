/************************************/
/* Program   : Dosen.java */
/* Deskripsi : atribut dan method dalam class Dosen */
/* NIM/Nama  : 240601230012/SYAFIQ ABIYYU TAQI*/
/* Tanggal   : 27-02-2025*/
/***********************************/

public class Dosen {
    /* ATRIBUT */
    private String NIP;
    private String Nama;
    private String Prodi;

    /* METHOD */
    // KONSTRUKTOR
    // Konstruktor default
    public Dosen() {
        this("-","-","-");
    }

    // Konstruktor custom
    public Dosen(String nip, String nama, String prodi) {
        this.NIP = nip;
        this.Nama = nama;
        this.Prodi = prodi;
    }

    // SELEKTOR
    // Selektor NIP
    public String getNIP() {
        return NIP;
    }

    // Selektor Nama
    public String getNama() {
        return Nama;
    }

    // Selektor Prodi
    public String getProdi() {
        return Prodi;
    }

    // MUTATOR
    // Mutator NIP
    public void setNIP(String nip) {
        this.NIP = nip;
    }

    // Mutator Nama
    public void setNama(String nama) {
        this.Nama = nama;
    }

    // Mutator Prodi
    public void setProdi(String prodi) {
        this.Prodi = prodi;
    }

    // Mutator semua atribut
    public void setDosen(String nip, String nama, String prodi) {
        this.NIP = nip;
        this.Nama = nama;
        this.Prodi = prodi;
    }
}
