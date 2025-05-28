/************************************/
/* Nama file	: Person.java */
/* Deskripsi	: Person database model */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 15-05-2025 */
/***********************************/

public class Person {
    /* ATRIBUT */
    private int id;
    private String name;

    /* METHOD */
    public Person(String n) {
        this.name = n;
    }

    public Person(int i, String n) {
        this.id = i;
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
