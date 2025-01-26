/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AsetDAO;

/**
 *
 * @author ACER
 */

import Aset.Aset;
import Database.Database;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AsetDAO {
    
     public static boolean tambahAset(Aset aset) {
        String query = "INSERT INTO aset (nama_aset, kategori, jumlah, kondisi, lokasi, tanggal_beli) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection con = Database.getConnection();
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, aset.getNamaAset());
            pst.setString(2, aset.getKategori());
            pst.setInt(3, aset.getJumlah());
            pst.setString(4, aset.getKondisi());
            pst.setString(5, aset.getLokasi());
            pst.setString(6, aset.getTanggalBeli());

            return pst.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Membaca Data Aset (Get All Asets)
    public static List<Aset> getAllAsets() {
        List<Aset> asetList = new ArrayList<>();
        String query = "SELECT * FROM aset";
        try (Connection con = Database.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Aset aset = new Aset(
                        rs.getInt("id"),
                        rs.getString("nama_aset"),
                        rs.getString("kategori"),
                        rs.getInt("jumlah"),
                        rs.getString("kondisi"),
                        rs.getString("lokasi"),
                        rs.getString("tanggal_beli")
                );
                asetList.add(aset);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return asetList;
    }

    // Update Aset berdasarkan ID
    public static boolean updateAset(Aset aset) {
        String query = "UPDATE aset SET nama_aset = ?, kategori = ?, jumlah = ?, kondisi = ?, lokasi = ?, tanggal_beli = ? WHERE id = ?";
        try (Connection con = Database.getConnection();
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, aset.getNamaAset());
            pst.setString(2, aset.getKategori());
            pst.setInt(3, aset.getJumlah());
            pst.setString(4, aset.getKondisi());
            pst.setString(5, aset.getLokasi());
            pst.setString(6, aset.getTanggalBeli());
            pst.setInt(7, aset.getId());

            return pst.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Menghapus Aset berdasarkan ID
    public static boolean deleteAset(int id) {
        String query = "DELETE FROM aset WHERE id = ?";
        try (Connection con = Database.getConnection();
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setInt(1, id);

            return pst.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
}
