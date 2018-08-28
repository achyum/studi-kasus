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
class pembeli extends barang {
    private int id_pembeli;
    private String nama_pembeli, alamat, no_telp;
    
    public void setID2(int id) {
       id_pembeli = id;
   }
   public int getID2() {
       return id_pembeli;
   }
   
   public void setnama_pembeli(String nama_pemebeli) {
       nama_pembeli = nama_pembeli;
   }
   public String getnama_pembeli() {
       return nama_pembeli;
   }
   
   public void setalamat(String alamat) {
       alamat = alamat;
   }
   public String getalamat() {
       return alamat;
   }
   
   public void setno(String no) {
       no_telp = no;
   }
   public String getno() {
       return no_telp;
   }
   
   public void datapembeli(){
   Scanner p = new Scanner(System.in);
   System.out.print("ID pembeli : ");
   id_pembeli = p.nextInt();
   System.out.println("nama pembeli : ");
   nama_pembeli = p.nextLine();
   System.out.print("alamat : ");
   alamat = p.nextLine();
   System.out.print("no telepon : ");
   no_telp = p.nextLine();
   }
}
