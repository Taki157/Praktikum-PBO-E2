/************************************/
/* Nama file	: Datum.java */
/* Deskripsi	: Class Datum */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 30-05-2025 */
/***********************************/
public class Datum<generik> {
    /* ATRIBUT */
    private generik isi;

    /* METHOD */
    // KONSTRUKTOR
    public Datum() {}

    public Datum(generik isi) {
        this.isi = isi;
    }

    // GETTER
    public generik getIsi() {
        return this.isi;
    }

    // SETTER
    public void setIsi(generik isi) {
        this.isi = isi;
    }

    // METHOD LAIN
    
}
