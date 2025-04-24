/************************************/
/* Nama file	: Programmer.java */
/* Deskripsi	: program class Programmer */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 24-04-2025 */
/***********************************/

public class Programmer extends Pegawai {
    // ATRIBUT
    private int bonus = 450000;

    // METHOD
    // KONSTRUKTOR
    public Programmer() {
        super();
    }
    public Programmer(String nama) {
        super(nama);
    }

    // GETTER & SETTER
    public int getBonus() {
        return bonus;
    }

    // METHOD LAIN
    @Override
    public void tampilData() {
        super.tampilData(); // memanggil method tampilData() dari class Pegawai
        System.out.println("Bonus\t\t: " + this.bonus);    
    }

}
