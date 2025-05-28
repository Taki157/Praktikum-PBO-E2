/************************************/
/* Nama file	: MainDAO.java */
/* Deskripsi	: Main program untuk akses DAO */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 15-05-2025 */
/***********************************/

public class MainDAO {
    public static void main(String args[]) {
        /* KAMUS */
        Person person = new Person("Taki");
        DAOManager manager = new DAOManager();

        /* ALGORITMA */
        manager.setPersonDAO(new MySQLPersonDAO());
        try {
            manager.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
