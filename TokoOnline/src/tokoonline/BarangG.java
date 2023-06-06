/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokoonline;
import java.util.ArrayList;
/**
 *
 * @author dyahs
 */
public class BarangG {
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    public BarangG() {
        this.namaBarang.add("Light Stick");
        this.stok.add(15);
        this.harga.add(870000);
        this.namaBarang.add("Photo Card");
        this.stok.add(30);
        this.harga.add(50000);
        this.namaBarang.add("Song Album");
        this.stok.add(20);
        this.harga.add(260000);
    }
    
    public int getJmlBarang(){
        return this.namaBarang.size();
    }
    
    public void setNamaBarang(String namaBarang ){
        this.namaBarang.add(namaBarang);
    }

    public String getNamaBarang(int idBarang){
        return this.namaBarang.get(idBarang);
    }
    
    public void setStok(int stok ){
        this.stok.add(stok);
    }

    public int getStok(int idBarang){
        return this.stok.get(idBarang);
    }

    public void editStok(int idBarang, int stok){
        this.stok.set(idBarang, stok);
    }

    public void setHarga(int harga ){
        this.harga.add(harga);
    }

    public int getHarga(int idBarang){
        return this.harga.get(idBarang);
    }

    
}
