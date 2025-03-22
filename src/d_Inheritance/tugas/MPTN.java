/************************************/
/* Nama file	: MPTN.java */
/* Deskripsi	: Main program studi kasus pegawai Perguruan Tinggi */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 13-03-2025 */
/***********************************/

import java.time.LocalDate;

public class MPTN {
    public static void main(String[] args) {
        // Membuat objek pegawai
        pegawai p = new pegawai("24060123120012", "Syafiq Abiyyu Taqi", LocalDate.of(2004, 6, 8), LocalDate.of(2025, 3, 13), 500);

        // Menampilkan informasi pegawai
        p.printInfo();
    }
}