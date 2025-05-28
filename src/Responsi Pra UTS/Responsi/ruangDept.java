/************************************/
/* Nama file	: ruangDept.java */
/* Deskripsi	: class ruangDept */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 27-03-2025 */
/***********************************/

public class ruangDept extends ruang implements hitungBiayaKebersihan {
    /* ATRIBUT */
    private int jmlMeja;
    private int jmlKursi;
    private int jmlLemari;

    /* METHOD */
    // KONSTRUKTOR
    public ruangDept() {
        super();
        this.jmlMeja = 0;
        this.jmlKursi = 0;
        this.jmlLemari = 0;
    }

    public ruangDept(String kode, int p, int l, int t, int k, int jmlMeja, int jmlKursi, int jmlLemari) {
        super(kode, p, l, t, k);
        this.jmlMeja = jmlMeja;
        this.jmlKursi = jmlKursi;
        this.jmlLemari = jmlLemari;
    }

    // GETTER
    public int getJmlMeja() {
        return this.jmlMeja;
    }

    public int getJmlKursi() {
        return this.jmlKursi;
    }

    public int getJmlLemari() {
        return this.jmlLemari;
    }

    // SETTER
    public void setJmlMeja(int jmlMeja) {
        this.jmlMeja = jmlMeja;
    }

    public void setJmlKursi(int jmlKursi) {
        this.jmlKursi = jmlKursi;
    }

    public void setJmlLemari(int jmlLemari) {
        this.jmlLemari = jmlLemari;
    }

    // METHOD LAIN
    @Override
    public int biayaKebersihan() {
        return (getPanjang() * getLebar() * getTinggi() * 1000);
    }

    @Override
    public void printInfoRuang() {
        System.out.println("Kode Ruang\t\t : " + getKode());
        System.out.println("Panjang Ruang\t\t : " + getPanjang());
        System.out.println("Lebar Ruang\t\t : " + getLebar());
        System.out.println("Tinggi Ruang\t\t : " + getTinggi());
        System.out.println("Kapasitas Ruang\t\t : " + getKapasitas());
        System.out.println("Jumlah Meja\t\t : " + this.jmlMeja);
        System.out.println("Jumlah Kursi\t\t : " + this.jmlKursi);
        System.out.println("Jumlah Lemari\t\t : " + this.jmlLemari);
    }
}
