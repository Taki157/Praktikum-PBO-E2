import java.util.ArrayList;

/************************************/
/* Program   : Mahasiswa.java */
/* Deskripsi : atribut dan method dalam class Mahasiswa */
/* NIM/Nama  : 240601230012/SYAFIQ ABIYYU TAQI*/
/* Tanggal   : 27-02-2025*/
/***********************************/
public class Mahasiswa {
    /* ATRIBUT */
    private String NIM;
    private String Nama;
    private String Prodi;
    ArrayList<MataKuliah> ListMatkul;
    private Dosen DosenWali;
    private Kendaraan kendaraan;

    /* METHOD */
    // KONSTRUKTOR
    // Konstruktor default
    public Mahasiswa() {
        this("-","-","-");
        this.ListMatkul = new ArrayList<>();
    }

    // Konstruktor custom
    public Mahasiswa(String NIM, String Nama, String Prodi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Prodi = Prodi;
        this.ListMatkul = new ArrayList<>();
    }

    // SELEKTOR
    // Selektor NIM
    public String getNIM() {
        return NIM;
    }

    // Selektor Nama
    public String getNama() {
        return Nama; 
    }

    // Selektor Prodi
    public String getProdi() {
        return Prodi;
    }


    // MUTATOR
    // Mutator NIM
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    // Mutator Nama
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    // Mutator Prodi
    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }

    // Mutator ListMatkul : Menambahkan Mata Kuliah baru ke dalam ListMatkul
    public void addMatkul(MataKuliah newMatKul) {
        ListMatkul.add(newMatKul);
    }

    // Mutator Dosen Wali
    public void setDosenWali(Dosen DosenWali) {
        this.DosenWali = DosenWali;
    }

    // Mutator Kendaraan
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // OPERASI LAIN
    // Mendapatkan jumlah SKS
    public int getJumlahSKS() {
        // Kamus Lokal
        int jumlah = 0;

        // Algoritma
        for (MataKuliah matkul : this.ListMatkul) {
            jumlah += matkul.getSKS();
        }

        return jumlah;
    }

    // Mendapatkan jumlah MatKul
    public int getJumlahMatKul() {
        return ListMatkul.size();
    }

    // Mencetak NIM, Nama, dan Prodi Mahasiswa
    public void printMhs() {
        System.out.println("NIM\t: " + NIM);
        System.out.println("Nama\t: " + Nama);
        System.out.println("Prodi\t: " + Prodi);
    }

    // Mencetak detail informasi (atribut) mahasiswa
    public void printDetailMhs() {
        // Kamus Lokal
        int i, no;

        // Algoritma
        System.out.println("NIM\t\t: " + NIM);
        System.out.println("Nama\t\t: " + Nama);
        System.out.println("Prodi\t\t: " + Prodi);
        System.out.println("Dosen Wali\t: " + DosenWali.getNama());
        System.out.println("Kendaraan\t: " + kendaraan.getJenis() + "[" + kendaraan.getNoPlat() + "]");
        System.out.println("Mata Kuliah yang diambil\t: ");
        for(i = 0; i < ListMatkul.size(); i++) {
            no = i + 1;
            System.err.println(no + ". " + ListMatkul.get(i).getNama());
        }
    }
}
