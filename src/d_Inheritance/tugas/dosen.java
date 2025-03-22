/************************************/
/* Nama file	: dosen.java */
/* Deskripsi	: file class dosen */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 18-03-2025 */
/***********************************/

import java.time.LocalDate;

public class dosen extends pegawai {
    /* ATRIBUT */
    private String fakultas;

    /* METHOD */
    // KONSTUKTOR
    public dosen() {
        super();
        this.fakultas = "-";
    }

    public dosen(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }

    // GETTER
    public String getFakultas() {
        return fakultas;
    }

    // SETTER
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    // METHOD LAIN
    @Override
    public void printInfo() {
        super.printInfo();

        System.out.println("Fakultas\t: " + fakultas);
    }
}
