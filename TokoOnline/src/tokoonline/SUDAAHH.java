/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokoonline;

/**
 *
 * @author dyahs
 */
public class SUDAAHH {
    public static void main(String[] args) {
        BarangG barang = new BarangG ();
        //KaryawanN karyawan = new KaryawanN ();
        Laporan laporan = new Laporan ();
        MemberR member = new MemberR ();
        Transaksi transaksi = new Transaksi ();
        
        laporan.laporan(barang);
        laporan.laporan(member);
        laporan.laporan(transaksi, barang);
        System.out.println("");
        transaksi.prosesTransaksi(member, transaksi, barang);
        System.out.println("");
        laporan.laporan(barang);
        laporan.laporan(member);
        laporan.laporan(transaksi, barang);
        
    }
}
