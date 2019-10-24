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
public class Kerucut implements bangunDatar {
    private double tinggi;
    private double jariJari;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    

    @Override
    public double hitungVolume() {
        return Math.PI*(jariJari*jariJari)*(tinggi/3); //To change body of generated methods, choose Tools | Templates.
    }   
}
