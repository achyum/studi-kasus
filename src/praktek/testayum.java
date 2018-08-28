/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek;

/**
 *
 * @author SMK TELKOM
 */
public class testayum {//class
    public static void main(String[] args) {
        //object
        ayum biodata = new ayum();//object
        biodata.setnamaayah("EDY SUPRAPTO");
        biodata.setnamaibu("IVA YUSNADIAR");
        biodata.setnamasaya("NOVIA DIVAROTUL ACHYUM");
        biodata.setnamasaudara("MARTIKA PRANA VALINDA");
        biodata.setalamat("BANYUWANGI");
        biodata.sethobi("RENANG, JALAN JALAN DAN MAKAN");
        biodata.setcitacita("HACKER ADMINISTRASI NEGARA");
        biodata.setumur(16);
        
        System.out.println("NAMA AYAH    : " +biodata.getnamaayah());
        System.out.println("NAMA IBU     : " +biodata.getnamaibu());       
        System.out.println("NAMA SAUDARA : " +biodata.getnamasaudara());
        System.out.println("NAMA SAYA    : " +biodata.getnamasaya());
        System.out.println("ALAMAT       : " +biodata.getalamat());
        System.out.println("HOBI         : " +biodata.gethobi());
        System.out.println("CITA CITA    : " +biodata.getcitacita());
        System.out.println("UMUR         : " +biodata.getumur());
    }
}
