/************************************/
/* Nama file	: Pegawai.java */
/* Deskripsi	: program class Pegawai */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 24-04-2025 */
/***********************************/

public class Pegawai {
    // ATRIBUT
    private String nama;
    private int gajiPokok = 5000000;

    // METHOD
    // KONSTRUKTOR
    public Pegawai() {
        this.nama = "-";
    }
    public Pegawai(String nama) {
        this.nama = nama;
    }

    // GETTER & SETTER
    public String getNama() {
        return nama;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    // METHOD LAIN
    public void tampilData() {
        System.out.println("Nama Pegawai\t: " + this.nama);
        System.out.println("Gaji Pokok\t: " + this.gajiPokok);
    }
}
