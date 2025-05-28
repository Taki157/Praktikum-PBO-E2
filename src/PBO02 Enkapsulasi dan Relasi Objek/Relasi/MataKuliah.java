
/************************************/
/* Program   : MataKuliah.java */
/* Deskripsi : atribut dan method dalam class MataKuliah */
/* NIM/Nama  : 240601230012/SYAFIQ ABIYYU TAQI*/
/* Tanggal   : 27-02-2025*/
/***********************************/
public class MataKuliah {
    /* ATRIBUT */
    private String IDMatkul;
    private String Nama;
    private int SKS;

    /* METHOD */
    // KONSTRUKTOR
    // Konstruktor default
    public MataKuliah() {
        this("-","-",0);
    }

    // Konstruktor custom
    public MataKuliah(String IDMatkul, String nama, int sks) {
        this.IDMatkul = IDMatkul;
        this.Nama = nama;
        this.SKS = sks;
    }

    // SELEKTOR
    // Selektor IDMatkul
    public String getIDMatkul() {
        return IDMatkul;
    }

    // Selektor Nama
    public String getNama() {
        return Nama;
    }

    // Selektor SKS
    public int getSKS() {
        return SKS;
    }

    // MUTATOR
    // Mutator IDMatkul
    public void setIDMatkul(String IDMatkul) {
        this.IDMatkul = IDMatkul;
    }

    // Mutator Nama
    public void setNama(String nama) {
        this.Nama = nama;
    }

    // Mutator SKS
    public void setSKS(int sks) {
        this.SKS = sks;
    }

    // Mutator semua atribut
    public void setMataKuliah(String IDMatkul, String nama, int sks) {
        this.IDMatkul = IDMatkul;
        this.Nama = nama;
        this.SKS = sks;
    }
}
