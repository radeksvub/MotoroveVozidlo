/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lkw;

/**
 *
 * @author Student
 */
public class OsobniAuto extends MotoroveVozidlo {
    
    private int velikost_kufru;
    
    public OsobniAuto(int vykon_motoru, int pocet_mist_k_sezeni, int max_rychlost, int velikost_kufru){
        super(vykon_motoru, pocet_mist_k_sezeni, max_rychlost);
        this.velikost_kufru = velikost_kufru;
    }
    
}
