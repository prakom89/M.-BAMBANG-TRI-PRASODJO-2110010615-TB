/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aset;

/**
 *
 * @author ACER
 */
public class Aset {
    private int id;
    private String namaAset;
    private String kategori;
    private int jumlah;
    private String kondisi;
    private String lokasi;
    private String tanggalBeli;
    
    // Konstruktor untuk inisialisasi objek Aset
    public Aset(int id, String namaAset, String kategori, int jumlah, String kondisi, String lokasi, String tanggalBeli) {
        this.id = id;
        this.namaAset = namaAset;
        this.kategori = kategori;
        this.jumlah = jumlah;
        this.kondisi = kondisi;
        this.lokasi = lokasi;
        this.tanggalBeli = tanggalBeli;
    }

    // Konstruktor tanpa id, untuk menambahkan aset baru
    public Aset(String namaAset, String kategori, int jumlah, String kondisi, String lokasi, String tanggalBeli) {
        this.namaAset = namaAset;
        this.kategori = kategori;
        this.jumlah = jumlah;
        this.kondisi = kondisi;
        this.lokasi = lokasi;
        this.tanggalBeli = tanggalBeli;
    }

    // Getter dan Setter untuk id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter dan Setter untuk namaAset
    public String getNamaAset() {
        return namaAset;
    }

    public void setNamaAset(String namaAset) {
        this.namaAset = namaAset;
    }

    // Getter dan Setter untuk kategori
    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    // Getter dan Setter untuk jumlah
    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    // Getter dan Setter untuk kondisi
    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    // Getter dan Setter untuk lokasi
    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    // Getter dan Setter untuk tanggalBeli
    public String getTanggalBeli() {
        return tanggalBeli;
    }

    public void setTanggalBeli(String tanggalBeli) {
        this.tanggalBeli = tanggalBeli;
    }

    @Override
    public String toString() {
        return "Aset{" +
                "id=" + id +
                ", namaAset='" + namaAset + '\'' +
                ", kategori='" + kategori + '\'' +
                ", jumlah=" + jumlah +
                ", kondisi='" + kondisi + '\'' +
                ", lokasi='" + lokasi + '\'' +
                ", tanggalBeli='" + tanggalBeli + '\'' +
                '}';
    }
    
}
