/************************************/
/* Nama file	: Manajer.java */
/* Deskripsi	: program class Majaner */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 24-04-2025 */
/***********************************/

public class Manajer extends Pegawai {
    // ATRIBUT
    private int tunjangan = 7000000;

    // METHOD
    // KONSTRUKTOR
    public Manajer() {
        super();
    }

    public Manajer(String nama) {
        super(nama);
    }
    
    // GETTER & SETTER
    public int getTunjangan() {
        return tunjangan;
    }

    // METHOD LAIN
    @Override
    public void tampilData() {
        super.tampilData(); // memanggil method tampilData() dari class Pegawai
        System.out.println("Tunjangan\t: " + this.tunjangan);    
    }
}
