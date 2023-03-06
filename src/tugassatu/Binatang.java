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
public abstract class Binatang {
    protected String nama, warna;
    protected int kaki;
    public abstract String jenisPemakan();


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getKaki() {
        return kaki;
    }

    public void setKaki(int kaki) {
        this.kaki = kaki;
    }
    
    public void makan(){
    }
    public void bersuara(){
    }
    public void berjalan(){
    }
      
}
