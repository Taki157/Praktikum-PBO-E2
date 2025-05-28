/************************************/
/* Nama file	: SerializePerson.java */
/* Deskripsi	: Program untuk serialisasi objek person */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 15-05-2025 */
/***********************************/
import java.io.*;

class Person implements Serializable {
    /* ATRIBUT */
    private String name;

    /* METHOD */
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


public class SerializePerson {
    public static void main(String[] args) {
        /* KAMUS */
        Person person = new Person("Syafiq Abiyyu Taqi");
        
        /* ALGORITMA */
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
            s.close();
        } catch (IOException e) {
            System.out.println("Gagal menulis objek person");
            e.printStackTrace();
        }

        
    }
}
