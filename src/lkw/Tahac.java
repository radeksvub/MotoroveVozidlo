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
public class Tahac extends MotoroveVozidlo {
    
    private int max_hm_navesu;

    public Tahac(int vykon_motoru, int pocet_mist_k_sezeni, int max_rychlost) {
        super(vykon_motoru, pocet_mist_k_sezeni, max_rychlost);
        this.max_hm_navesu = max_hm_navesu;
    }
    
    
    
}
