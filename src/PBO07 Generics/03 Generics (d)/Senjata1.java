/************************************/
/* Nama file	: Senjata.java */
/* Deskripsi	: Class Senjata */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 15-06-2025 */
/***********************************/

public class Senjata1 {
    /* ATRIBUT */
    private String bunyi;
    private boolean menusuk;

    /* METHOD */
    // KONSTRUKTOR
    public Senjata1() {

    }

    public Senjata1(String bunyi) {
        this.bunyi = bunyi;
    }

    // GETTER
    public String getBunyi() {
        return this.bunyi;
    }

    // SETTER
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }

    // METHOD LAIN
    public boolean isMenusuk() {
        return this.menusuk;
    }

    public void menembak(int jumlah) {
        while(jumlah != 0) {
            System.out.println(getBunyi() + " ");
            jumlah--;
        }
    }

    public void pasangBayonet() {
        setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }

    public String menusuk() {
        if (isMenusuk()) {
            return "Jleb!";
        } else {
            return "Gagal, belum pasang bayonet";
        }
    }

}
