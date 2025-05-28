/************************************/
/* Nama file	: MySQLPersonDAO.java */
/* Deskripsi	: implementasi PersonDAO */
/* Pembuat		: Syafiq Abiyyu Taqi / 24060123120012 */
/* Tanggal		: 15-05-2025 */
/***********************************/
import java.sql.*;

public class MySQLPersonDAO implements PersonDAO{
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        // membuat koneksi, nama db, user, password menyesuaikan
        Class.forName("com.mysql.jdbo.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/PBO",
            "root",
            "8604biu157"
        );
        String query = "INSERT INTO person (name) VALUES ('" + name + "')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        // menutup koneksi
        con.close();
    }
}
