/************************************/
/* Program   : AngkaSialException.java */
/* Deskripsi : contoh eksepsi dengan manual di java */
/* NIM/Nama  : 240601230012/SYAFIQ ABIYYU TAQI*/
/* Tanggal   : 11-03-2025*/
/***********************************/

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan masukkan angka 13 karena angka sial!!!");
    }
}
