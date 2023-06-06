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
public class MemberR implements User{
    
    private ArrayList<String> namaMember = new ArrayList<String> ();
    private ArrayList<String> alamat = new ArrayList<String> ();
    private ArrayList<String> telepon = new ArrayList<String> ();
    private ArrayList<Integer> saldo = new ArrayList<Integer> ();
    
    public MemberR() {
        this.namaMember.add("Yang Jeong-IN");
        this.alamat.add("Busan");
        this.telepon.add("547.9988.5152");
        this.saldo.add(999999999);
        
        this.namaMember.add("Lee Hye-In");
        this.alamat.add("Incheon");
        this.telepon.add("547.3232.7887");
        this.saldo.add(987999999);
    }
    
    public void setSaldo (int saldo) {
        this.saldo.add(saldo);
    }
    
    public int getSaldo (int idMember) {
        return this.saldo.get(idMember);
    }
    
    public void editSaldo (int idMember, int saldo) {
        this.saldo.set(saldo, idMember);
    }
    
    public int getJmlMember () {
        return this.saldo.size();
    }
    
    @Override
    public void setNama(String namaMember ) {
      this.namaMember.add(namaMember);
    }
    
    @Override
    public void setAlamat(String alamat ) {
        this.alamat.add(alamat);
    }
    
    @Override
    public String getNama (int idMember) {
        return this.namaMember.get(idMember);
    }

    @Override
    public String getAlamat (int idMember ) {
        return this.alamat.get(idMember);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getTelepon(int idMember) {
        return this.telepon.get(idMember);
    }

    
    
    
    
}
