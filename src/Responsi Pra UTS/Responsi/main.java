/************************************/
/* Nama file	: main.java */
/* Deskripsi	: driver file responsi */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 27-03-2025 */
/***********************************/

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<String> matkul = new ArrayList<>();
        matkul.add("BioMol");
        matkul.add("BioKim");
        matkul.add("BioFis");

        ArrayList<String> dosen = new ArrayList<>();
        dosen.add("Pak A");
        dosen.add("Pak B");
        dosen.add("Pak C");

        ruangKelas A1 = new ruangKelas("A1", 10, 10, 10, 100, 50, 5);
        ruangDept informatika = new ruangDept("IF", 20, 20, 20, 200, 10, 10, 10);
        labKomp D = new labKomp("D", 30, 30, 30, 300, "Lab PBO", 100000, 50);
        labNonKomp E = new labNonKomp("E", 40, 40, 40, 400, "Lab Pemweb", 100000, matkul);
        ruangDosen F = new ruangDosen("F", 50, 50, 50, 500, dosen, 10, 10);

        A1.printInfoRuang();
        System.out.println("\n");
        informatika.printInfoRuang();
        System.out.println("\n");
        D.printInfoRuang();
        System.out.println("\n");
        E.printInfoRuang();
        System.out.println("\n");
        F.printInfoRuang();
    }
}
