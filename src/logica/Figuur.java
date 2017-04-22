/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Enum.Kleur;

/**
 *
 * @author sebastiaan.debaedts
 */
public abstract class Figuur {
    private Kleur kleur;
    private Kleur kleurrand;
    private int dikteRand;
    public Figuur(Kleur k1, Kleur k2, int dikte){//opvulkleur, randkleur, dikte van rand
        this.kleur = k1;
        this.kleurrand = k2;
        this.dikteRand = dikte;
        
    }

    public Kleur getKleur() {
        return kleur;
    }

    public Kleur getKleurrand() {
        return kleurrand;
    }

    public int getDikteRand() {
        return dikteRand;
    }
    public abstract double berekenOmtrek();    
    public abstract double berekenOppervlakte();

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Figuur other = (Figuur) obj;
        if (this.dikteRand != other.dikteRand) {
            return false;
        }
        if (this.kleur != other.kleur) {
            return false;
        }
        return true;
    }

    
    
    
    
}
