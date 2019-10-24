/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118053.latihan61.bangunruang;

/**
 *
 * @author ACER
 */
public class Tabung implements bangunDatar {
     private int jariJari;
    private int tinggi;

    public int getJariJari() {
        return jariJari;
    }

    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        
        return Math.PI*(jariJari*jariJari)*tinggi; //To change body of generated methods, choose Tools | Templates.
    }
    
}
