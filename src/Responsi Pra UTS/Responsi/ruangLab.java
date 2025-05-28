/************************************/
/* Nama file	: ruangLab.java */
/* Deskripsi	: class abstract ruangLab */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 27-03-2025 */
/***********************************/

public abstract class ruangLab extends ruang implements hitungBiayaKebersihan {
    /* ATRIBUT */
    private String namaLab;
    private int HargaSewa;

    /* METHOD */
    // KONSTRUKTOR
    public ruangLab() {
        super();
        this.namaLab = "Lab";
        this.HargaSewa = 0;
    }

    public ruangLab(String kode, int p, int l, int t, int k, String namaLab, int HargaSewa) {
        super(kode, p, l, t, k);
        this.namaLab = namaLab;
        this.HargaSewa = HargaSewa;
    }

    // GETTER
    public String getNamaLab() {
        return this.namaLab;
    }

    public int getHargaSewa() {
        return this.HargaSewa;
    }

    // SETTER
    public void setNamaLab(String namaLab) {
        this.namaLab = namaLab;
    }

    public void setHargaSewa(int HargaSewa) {
        this.HargaSewa = HargaSewa;
    }

    // METHOD LAIN
    @Override
    public int biayaKebersihan() {
        return 100000;
    }
}
