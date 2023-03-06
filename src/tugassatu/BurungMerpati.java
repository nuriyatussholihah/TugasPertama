/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugassatu;

/**
 *
 * @author lenovo
 */
public class BurungMerpati extends Binatang implements Herbivora {

    double harga;
    int jumlah;
    
    @Override
    public void makan() {
        super.makan(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(nama + " berwarna " + warna);
    }

    @Override
    public void bersuara() {
        super.bersuara(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Suara " + nama + " adalah bekur bekur");
    }

    @Override
    public void berjalan() {
        super.berjalan(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(nama + " mempunyai " + kaki + " kaki");
    }

    @Override
    public String jenisPemakan() {
       return null;
    }
    
}
