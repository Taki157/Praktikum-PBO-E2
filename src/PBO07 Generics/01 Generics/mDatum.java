public class mDatum {
    public static void main(String[] args) {
        /* KAMUS */
        Kucing2 meng;
        Datum<Anabul2> anu;

        /* ALGORITMA */
        meng = new Kucing2("cemeng bintwul");
        anu = new Datum<>();

        anu.setIsi(meng);
        anu.getIsi().Gerak();
        anu.setIsi(new Anjing2("guguk"));
        anu.getIsi().Gerak();
        anu.setIsi(new Burung2("kwak"));
        anu.getIsi().Gerak();
    }
}
