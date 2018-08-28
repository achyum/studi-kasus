/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus;

/**
 *
 * @author SMK TELKOM
 */
import java.util.Scanner;

class barang {
   private int id_barang, harga_barang;
   private String nama_barang, merk_barang;
   
   public void setID(int id) {
       id_barang = id;
   }
   public int getID() {
       return id_barang;
   }
   
   public void setharga(int harga) {
       harga_barang = harga;
   }
   public int getharga() {
       return harga_barang;
   }
   
   public void setnama(String nama) {
       nama_barang = nama;
   }
   public String getnama() {
       return nama_barang;
   }
   
   public void setmerk(String merk) {
       merk_barang = merk;
   }
   public String getmerk() {
       return merk_barang;
   }
   
   public void databarang(){
       Scanner m = new Scanner(System.in);
       System.out.print("ID Barang    : ");
       id_barang = m.nextInt();
       System.out.print("nama Barang  : ");
       nama_barang = m.nextLine();
       System.out.println();
       System.out.print("merk Barang  : ");
       merk_barang = m.nextLine();
       System.out.print("harga Barang : ");
       harga_barang = m.nextInt();
   }
}
