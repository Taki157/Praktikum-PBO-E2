/************************************/
/* Program   : AngkaSial.java */
/* Deskripsi : contoh eksepsi dengan manual di java */
/* NIM/Nama  : 240601230012/SYAFIQ ABIYYU TAQI*/
/* Tanggal   : 11-03-2025*/
/***********************************/

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println("Angka " + angka + " bukan angka sial");
    }
    
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("Hati-hati memasukkan angka!!!");
        }
    }
    
}


/* JAWABAN PERTANYAAN PRAKTIKUM */
// 1. Baris 12 pada AngkaSia.java tidak dieksekusi karena penanganan diberikan ke AngkaSialException
//    lalu ditangkap di baris 22 oleh catch (AngkaSialException ase).
// 2. Baris 21 dieksekusi karena menangkap eksepsi AngkaSialException.
