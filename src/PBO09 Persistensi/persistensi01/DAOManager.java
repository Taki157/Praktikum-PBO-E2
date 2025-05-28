/************************************/
/* Nama file	: DAOManager.java */
/* Deskripsi	: pengelola DAO dalam program */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 15-05-2025 */
/***********************************/
public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        this.personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
