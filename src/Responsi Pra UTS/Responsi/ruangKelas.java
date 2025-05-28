/************************************/
/* Nama file	: ruangKelas.java */
/* Deskripsi	: class ruangKelas, extend dari class ruang */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 27-03-2025 */
/***********************************/

public class ruangKelas extends ruang implements hitungBiayaKebersihan {
    /* ATRIBUT */
    private int jmlKursiTersedia;
    private int jmlKursiRusak;

    /* METHOD */
    // KONSTRUKTOR
    public ruangKelas() {
        super();
        this.jmlKursiTersedia = 0;
        this.jmlKursiRusak = 0;
    }

    public ruangKelas(String kode, int p, int l, int t, int k, int jmlKursiTersedia, int jmlKursiRusak) {
        super(kode, p, l, t, k);
        this.jmlKursiTersedia = jmlKursiTersedia;
        this.jmlKursiRusak = jmlKursiRusak;
    }

    // GETTER
    public int getJmlKursiTersedia() {
        return this.jmlKursiTersedia;
    }

    public int getJmlKursiRusak() {
        return this.jmlKursiRusak;
    }

    // SETTER
    public void setJmlKursiTersedia(int jmlKursiTersedia) {
        this.jmlKursiTersedia = jmlKursiTersedia;
    }

    public void setJmlKursiRusak(int jmlKursiRusak) {
        this.jmlKursiRusak = jmlKursiRusak;
    }

    // METHOD LAIN
    @Override
    public int biayaKebersihan() {
        return (100000);
    }

    @Override
    public void printInfoRuang() {
        System.out.println("Kode Ruang\t\t : " + getKode());
        System.out.println("Panjang Ruang\t\t : " + getPanjang());
        System.out.println("Lebar Ruang\t\t : " + getLebar());
        System.out.println("Tinggi Ruang\t\t : " + getTinggi());
        System.out.println("Kapasitas Ruang\t\t : " + getKapasitas());
        System.out.println("Jumlah Kursi Tersedia\t : " + this.jmlKursiTersedia);
        System.out.println("Jumlah Kursi Rusak\t : " + this.jmlKursiRusak);
        System.out.println("Biaya Kebersihan\t : " + biayaKebersihan());
    }
}
