/************************************/
/* Nama file	: labKomp.java */
/* Deskripsi	: class labKomp */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 27-03-2025 */
/***********************************/

public class labKomp extends ruangLab {
    /* ATRIBUT */
    private int jmlKomputer;

    /* METHOD */
    // KONSTRUKTOR
    public labKomp() {
        super();
        this.jmlKomputer = 0;
    }

    public labKomp(String kode, int p, int l, int t, int k, String namaLab, int HargaSewa, int jmlKomputer) {
        super(kode, p, l, t, k, namaLab, HargaSewa);
        this.jmlKomputer = jmlKomputer;
    }

    // GETTER
    public int getJmlKomputer() {
        return this.jmlKomputer;
    }

    // SETTER
    public void setJmlKomputer(int jmlKomputer) {
        this.jmlKomputer = jmlKomputer;
    }

    // METHOD LAIN

    @Override
    public void printInfoRuang() {
        System.out.println("Kode Ruang\t\t : " + getKode());
        System.out.println("Panjang Ruang\t\t : " + getPanjang());
        System.out.println("Lebar Ruang\t\t : " + getLebar());
        System.out.println("Tinggi Ruang\t\t : " + getTinggi());
        System.out.println("Kapasitas Ruang\t\t : " + getKapasitas());
        System.out.println("Nama Lab\t\t : " + getNamaLab());
        System.out.println("Harga Sewa\t\t : " + getHargaSewa());
        System.out.println("Jumlah Komputer\t\t : " + getJmlKomputer());
        System.out.println("Biaya Kebersihan\t : " + biayaKebersihan());
    }
}
 