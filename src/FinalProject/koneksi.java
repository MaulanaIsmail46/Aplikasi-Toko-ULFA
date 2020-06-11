package FinalProject;

/**
* Nama   : Maulana Ismail
* NIM    : E3119144
* Prodi  : MIF Golongan C
*/

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class koneksi {

    public static Connection con;
    public static Statement stm;

    public static void main(String[] args) throws SQLException {
        koneksi tes = new koneksi();
        System.out.println(tes);
    }

    public koneksi() throws SQLException {
        //bukaKoneksi();
    }

    public Connection bukaKoneksi() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/toko ulfa",
                    "root",
                    "");
            stm = con.createStatement();
            System.out.println("Koneksi Berhasil");
            return con;
        } catch (SQLException se) {
            System.err.println("Tidak Ada Koneksi - " + se.getMessage());
            return null;
        } catch (ClassNotFoundException ex) {
            System.err.println("Tidak Dapat Membuka Koneksi - " + ex.getMessage());
            return null;
        }
    }
}