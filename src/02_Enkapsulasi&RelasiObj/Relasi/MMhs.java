/************************************/
/* Program   : MMhs.java */
/* Deskripsi : aplikasi package Relasi */
/* NIM/Nama  : 240601230012/SYAFIQ ABIYYU TAQI*/
/* Tanggal   : 27-02-2025*/
/***********************************/
public class MMhs {
    public static void main(String[] args) {
        /* TEST CASE */
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3); // Test Case 1 : MataKuliah(String IDMatkul, String nama, int sks) [Konstruktor custom]
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3); // Test Case 2 : MataKuliah(String IDMatkul, String nama, int sks) [Konstruktor custom]
        Mahasiswa M1 = new Mahasiswa("012", "Taki", "Informatika"); // Test Case 3 : Mahasiswa(String NIM, String Nama, String Prodi) [Konstruktor custom]
        Dosen D1 = new Dosen("123", "Edy", "Informatika"); // Test Case 4 : Dosen(String nip, String nama, String prodi) [Konstruktor custom]
        Kendaraan K1 = new Kendaraan("H 000 ZI", "Motor"); // Test Case 5 : Kendaraan(String noplat, String jenis) [Konstruktor custom]

        M1.setDosenWali(D1); // Test Case 6 : void setDosenWali(Dosen DosenWali) [Mutator]
        M1.setKendaraan(K1); // Test Case 7 : void setKendaraan(Kendaraan kendaraan) [Mutator]
        M1.addMatkul(PBO); // Test Case 8 : void addMatkul(MataKuliah newMatKul) [Mutator]
        M1.addMatkul(MBD); // Test Case 9 : void addMatkul(MataKuliah newMatKul) [Mutator]

        M1.printMhs(); // Test Case 10 : void printMhs() [Operasi Lain]
        M1.printDetailMhs(); // Test Case 11 : void printDetailMhs() [Operasi Lain]

        System.out.println("Jumlah Mata Kuliah\t: " + M1.getJumlahMatKul()); // Test Case 12 : int getJumlahMatKul() [Operasi Lain]
        System.out.println("Jumlah SKS Mata Kuliah\t: " + M1.getJumlahSKS()); // Test Case 13 : int getJumlahSKS() [Operasi Lain]
    }
}
