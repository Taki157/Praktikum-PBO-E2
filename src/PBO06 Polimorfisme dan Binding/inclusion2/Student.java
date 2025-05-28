/************************************/
/* Nama file	: Student.java */
/* Deskripsi	: class Student */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 24-04-2025 */
/***********************************/

public class Student extends Person {
    public Student() {
        super();
    }

    public Student(String name) {
        super(name);
    }

    @Override
    public boolean isAsleep(int hr) {
        return 2 < hr || 8 > hr;
    }
    
}
