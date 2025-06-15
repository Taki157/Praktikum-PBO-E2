/************************************/
/* Nama file	: KontrolSenjata.java */
/* Deskripsi	: Class KontrolSenjata */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 15-06-2025 */
/***********************************/
public class KontrolSenjata {
    /* ATRIBUT */
    private Senjata2 senjata;

    /* METHOD */
    // KONSTRUKTOR
    public KontrolSenjata() {}

    public KontrolSenjata(Senjata2 s) {
        this.senjata = s;
    }

    // GETTER
    // SETTER
    // METHOD LAIN
    public boolean isAdaPeluru() {
        return this.senjata.getPeluru() != 0;
    }

    public void isiPeluru(int jumlahPeluru) {
        this.senjata.setPeluru(jumlahPeluru);
        System.out.println("Peluru berhasil ditambah: " + jumlahPeluru);
    }

    public void menembak(int jumlah) {
        System.out.println("Siap menembak " + jumlah + " kali");
        for (int i = 0; i < jumlah; i++) {
            if (this.isAdaPeluru()) {
                this.senjata.getBunyi();
            } else {
                System.out.println("Gagal tembak, peluru habis");
            }
            this.senjata.setPeluru(this.senjata.getPeluru() - 1);
        }
    }

    public void menusuk() {
        this.senjata.menusuk();
    }

    public void pasangBayonet() {
        this.senjata.pasangBayonet();
    }
}
