/************************************/
/* Nama file	: DiskonLambda.java */
/* Deskripsi	: lambda si anonymous class */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 05-06-2025 */
/***********************************/
interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        // tanpa pambda
        IDiskon diskonMerdeka = new IDiskon() {
            @Override
            public double hitungDiskon(int harga) {
                return harga - (harga *0.3);
            }
        };

        // dengan lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.3);

        // dengan lambda blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.3);
        };

        System.out.println("Diskon Merdeka\t: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran\t: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa\t: " + diskonBiasa.hitungDiskon(45000));
    }
}