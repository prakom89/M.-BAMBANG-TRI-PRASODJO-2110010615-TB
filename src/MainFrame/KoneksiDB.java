package MainFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDB {
    public static Connection getKoneksi() {
        Connection koneksi = null;
        try {
            // URL koneksi ke MySQL
            String url = "jdbc:mysql://localhost:3306/inventaris_aset";  // Ganti dengan nama database kamu
            String user = "root";  // Ganti dengan username MySQL kamu
            String password = "";  // Ganti dengan password MySQL kamu

            // Membuat koneksi
            koneksi = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Koneksi Gagal: " + e.getMessage());
        }
        return koneksi;
    }
}
