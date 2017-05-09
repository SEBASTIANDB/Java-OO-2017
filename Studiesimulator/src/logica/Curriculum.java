/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author Sebastiaan
 */
public class Curriculum {

    ArrayList<Fase> allefasen;//alle (3 of meerdere) fasen.

    public Curriculum(ArrayList<Fase> fasen, int aantalFasen) {
        for (int i = 0; i < aantalFasen; i++) {
            this.allefasen.add(fasen.get(i));//voegt alle fasen toe aan het curriculum
        }

    }

    public void voegFaseToe(Fase f) {
        allefasen.add(f);

    }
    public void verwijderFase(Fase f){
        allefasen.remove(f);
    }
}
