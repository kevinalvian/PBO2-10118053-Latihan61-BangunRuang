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
public class PBO210118053Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         bolaBasket bb = new bolaBasket();
    bb.setJariJari(7);
    System.out.println("Volume Bola Basket : " +bb.hitungVolume()+ " Cm");
    
        
    Tabung tbg = new Tabung();
    tbg.setJariJari(10);
    tbg.setTinggi(21);
    System.out.println("Volume Tabung : " +tbg.hitungVolume()+ " Cm");
     

    Kerucut krc = new Kerucut();
    krc.setJariJari(14);
    krc.setTinggi(9);
        System.out.println("Volume Kerucut : "+krc.hitungVolume()+ " Cm");
    }
    
}
