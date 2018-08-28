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
public class ayum {
    //modifier
    private String namaayah, namaibu, namasaya, namasaudara, alamat, hobi, citacita;
    private int umur;//variable
    public String getnamaayah(){//modifier type asesor
    return namaayah;
    }
    public String getnamaibu(){
    return namaibu;
    }
    public String getnamasaya(){
    return namasaya;
    }
    public String getnamasaudara(){
    return namasaudara;
    }
    public String getalamat(){
    return alamat;
    }
    public String gethobi(){
    return hobi;
    }
    public String getcitacita(){
    return citacita;
    }
    public int getumur(){
    return umur;
    }
          //method
    public void setnamaayah(String newnamaayah){//modifier type return mutator
    namaayah = newnamaayah;//statement
    }
    public void setnamaibu(String newnamaibu){//konstuktor
    namaibu = newnamaibu;
    }                       //parameter
    public void setnamasaya(String newnamasaya){
    namasaya = newnamasaya;
    }
   public void setnamasaudara(String newnamasaudara){
    namasaudara = newnamasaudara;
    }
   public void setalamat(String newalamat){
    alamat = newalamat;
    }
   public void sethobi(String newhobi){
    hobi = newhobi;
    }
   public void setcitacita(String newcitacita){
    citacita = newcitacita;
    }
   public void setumur(int newumur){
    umur = newumur;
    }//atribute
   
}
