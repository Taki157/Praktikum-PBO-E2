/************************************/
/* Program   : MTitik.java */
/* Deskripsi : Aplikasi Class Titik */
/* NIM/Nama  : 240601230012/SYAFIQ ABIYYU TAQI*/
/* Tanggal   : 20-02-2025*/
/***********************************/

public class MTitik {
    public static void main(String[] args) {
        Titik T99 = new Titik(); //countTitik = 1
        T99.setAbsis(3);
        T99.setOrdinat(4);
        T99.printTitik();
        T99.geser(3,4);
        T99.printTitik();

        Titik T98 = new Titik(); //countTitik = 2
        T98.setAbsis(5);
        T98.setOrdinat(6);
        T98.printTitik();

        System.out.println("Jumlah titik :" + Titik.getCountTitik()); // akses countTitik melalui class
        //System.out.println("Jumlah titik :" + T99.getCountTitik()); // akses countTitik melalui objek
        //System.out.println("Jumlah titik :" + T98.getCountTitik()); // akses countTitik melalui objek
        /* tetap bisa memanggil atribut static melalui objek, tapi dapat warning
        karena atribut static adalah atribut yang dimiliki oleh class, bukan objek. 
        Sehingga disarankan memangggil atribut static langsung melalui class. */

        Titik T97 = new Titik(); // Membuat objek titik dengan nilai default (0,0)
        Titik T96 = new Titik(1,2); // Membuat objek titik dengan nilai (x,y)

        T97.printTitik();
        T96.printTitik();

        /* Test Case */
        System.out.println("\n====Test Case====");
        // Titik() default constructor
        System.out.println("Test Case 1 : Titik() default constructor");
        Titik T1 = new Titik();
        T1.printTitik();

        // Titik(double x, double y) constructor
        System.out.println("\nTest Case 2 : Titik(double x, double y) constructor");
        Titik T2 = new Titik(1,2);
        T2.printTitik();

        // GETTER
        System.out.println("\nTest Case 3 : GETTER");

        // getAbsis()
        System.out.println("Absis\t : " + T2.getAbsis());

        // getOrdinat()
        System.out.println("Ordinat\t : " + T2.getOrdinat());

        // getCountTitik()
        System.out.println("Jumlah Titik : + Titik.getCounttitik()");

        // SETTER
        System.out.println("\nTest Case 4 : SETTER");
        System.out.println("T1 (0,0) -> (10,20)");
        System.out.println("Before :");
        T1.printTitik();
        
        // setAbsis(double x)
        T1.setAbsis(10);
        
        // setOrdinat(double y)
        T1.setOrdinat(20);

        System.out.println("After :");
        T1.printTitik();

        // geser(double dx, double dy)
        System.out.println("\nTest Case 5 : geser(double dx, double dy)");
        System.out.println("T2(1,2) -> (3,4)");
        System.out.println("Before :");
        T2.printTitik();

        T2.geser(2,2);

        System.out.println("After :");
        T2.printTitik();

        // printTitik()
        System.out.println("\nTest Case 6 : printTitik()");
        System.out.println("T2(3,4)");
        T2.printTitik();

        // getKuadran()
        System.out.println("\nTest Case 7 : getKuadran()");
        System.out.println("T2(3,4)");
        System.out.println("Kuadran : " + T2.getKuadran());

        // getJarakPusat()
        System.out.println("\ntest Case 8 : getjarakPusat()");
        System.out.println("T2(3,4)");
        System.out.println("Jarak Pusat : " + T2.getJarakPusat());

        // Test Case 9 : getJarak()
        System.out.println("\nTest Case 9 : getJarak()");
        System.out.println("T1(10,20) dan T2(3,4)");
        System.out.println("Jarak : " + T1.getJarak(T2));

        // Test Case 10 : refleksiX()
        System.out.println("\nTest Case 10 : refleksiX()");
        System.out.println("T2(3,4) -> (3,-4)");
        System.out.println("Before :");
        T2.printTitik();
        System.out.println("After :");
        T2.refleksiX();

        // Test Case 11 : refleksiY()
        System.out.println("\nTest Case 11 : refleksiY()");
        System.out.println("T2(3,-4) -> (-3,-4)");
        System.out.println("Before :");
        T2.printTitik();
        System.out.println("After :");
        T2.refleksiY();

        // Test Case 12 : getRefleksiX()
        System.out.println("\nTest Case 12 : getRefleksiX()");
        System.out.println("T2(-3,-4) -> T3(3,-4)");
        System.out.println("Refleksi X : ");
        Titik T3 = T2.getRefleksiX();
        T3.printTitik();

        // Test Case 13 : getRefleksiY()
        System.out.println("\nTest Case 13 : getRefleksiY()");
        System.out.println("T2(3,-4) -> T4(-3,-4)");
        System.out.println("Refleksi Y : ");
        Titik T4 = T2.getRefleksiY();
        T4.printTitik();

        System.out.println("\n====End Test Case====");
    }
    
}