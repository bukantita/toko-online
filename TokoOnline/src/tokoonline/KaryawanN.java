/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokoonline;
import java.util.ArrayList;

public class KaryawanN implements User{
    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();
    
    public KaryawanN () {
        this.namaKaryawan.add("Yoo Karina");
        this.alamat.add("Kwangya");
        this.telepon.add("527.3214.9975");
        this.jabatan.add(0);
        
        this.namaKaryawan.add("Watanabe Haruto");
        this.alamat.add("Osaka");
        this.telepon.add("577.8870.654");
        this.jabatan.add(0);
    }
    
    public void setJabatan (int jabatan) {
        this.jabatan.add(jabatan);
    } 
    public int getJabatan(int id) {
        return this.jabatan.get(id);
    }
    public int getJmlKaryawan () {
        return this.namaKaryawan.size();
    }
    
    @Override
    public void setNama(String namaKaryawan) {
        this.namaKaryawan.add(namaKaryawan);
    }
    
    @Override
    public void setAlamat (String alamat) {
        this.namaKaryawan.add(alamat);
    }
    
    @Override
    public void setTelepon (String telepon) {
        this.namaKaryawan.add(telepon);
    }
    
    @Override
    public String getNama (int idKaryawan) {
        return this.namaKaryawan.get(idKaryawan);
    }
    
    @Override
    public String getAlamat (int idKaryawan) {
        return this.alamat.get(idKaryawan);
    }
    
    @Override
    public String getTelepon (int idKaryawan) {
        return this.telepon.get(idKaryawan);
    }
    
}
