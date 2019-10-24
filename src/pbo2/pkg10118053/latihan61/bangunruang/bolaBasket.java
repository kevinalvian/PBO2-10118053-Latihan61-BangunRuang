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
public class bolaBasket implements bangunDatar {
    private int jariJari ;

    public int getJariJari() {
        return jariJari;
    }

    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }
    

    @Override
    public double hitungVolume() {
        return 4/3*3.14*jariJari*jariJari*jariJari; //To change body of generated methods, choose Tools | Templates.
    }    
}
