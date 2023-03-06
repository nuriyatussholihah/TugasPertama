/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugassatu;

import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[] args){
      
        Sapi s1 = new Sapi();
        s1.setNama("Sapi");
        s1.setWarna("Putih");
        s1.setKaki(4);
        s1.makan();
        s1.berjalan();
        s1.bersuara();
        s1.jenisPemakan();
        
        BurungMerpati m1 = new BurungMerpati();
        m1.setNama("Burung Merpati");
        m1.setWarna("Putih");
        m1.setKaki(2);
        m1.makan();
        m1.berjalan();
        m1.bersuara();
        m1.jenisPemakan();
        
        
        Kambing k1 = new Kambing();
        k1.setNama("Kambing");
        k1.setWarna("Putih");
        k1.setKaki(4);
        k1.makan();
        k1.berjalan();
        k1.bersuara();
        k1.jenisPemakan();
        
        
       Scanner scn = new  Scanner(System.in);
        
        try{
            System.out.print("Masukkan jumlah Sapi : ");
            s1.jumlah = scn.nextInt(); 
        }catch(Exception error){
            System.out.println("Errornya " + error.getMessage());
        }finally{
            System.out.println("Jumlahnya adalah " + s1.jumlah);
        }
        
         try{
            System.out.print("Masukkan jumlah Kambing : ");
            k1.jumlah = scn.nextInt(); 
        }catch(Exception error){
            System.out.println("Errornya " + error.getMessage());
        }finally{
            System.out.println("Jumlahnya adalah " + k1.jumlah);
        }
         
          try{
            System.out.print("Masukkan jumlah Burung Merpati : ");
            m1.jumlah = scn.nextInt(); 
        }catch(Exception error){
            System.out.println("Errornya " + error.getMessage());
        }finally{
            System.out.println("Jumlahnya adalah " + m1.jumlah);
        }
    }
}
