/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author sebastiaan.debaedts
 */
public abstract class Figuur {

    private Kleur kleur;
    private Kleur kleurrand;
    private int dikteRand;
    private Punt middelpunt;
    public Figuur(){
        this.kleur = Kleur.wit;
        this.kleurrand = Kleur.zwart;
        this.dikteRand = 1;
        this.middelpunt = new Punt(0,0);
        setMiddelpunt(middelpunt);
        
    }
    public Figuur(Punt p){
            this.kleur = Kleur.wit;
            this.kleurrand = Kleur.zwart;
            this.dikteRand = 1;
            this.middelpunt = p;
            setMiddelpunt(p);
        
    }    
    public Figuur(Kleur k1, Kleur k2, int dikte, Punt p){//opvulkleur, randkleur, dikte van rand
        this.kleur = k1;
        this.kleurrand = k2;
        this.dikteRand = dikte;
        this.middelpunt = p;
        setMiddelpunt(p);
        
    }

    public Kleur getKleur() {
        return kleur;
    }

    public Kleur getKleurRand() {
        return kleurrand;
    }

    public int getDikteRand() {
        return dikteRand;
    }
    public Punt getMiddelpunt(){
        return middelpunt;
    }
    public void setMiddelpunt(Punt p){
        this.middelpunt = p;
    }
    
    public abstract double berekenOppervlakte();
    public double berekenAfstand(Punt p){
      double afstandHorizontaal = Math.abs(this.getMiddelpunt().getX() - p.getX());
      double afstandVerticaal = Math.abs(this.getMiddelpunt().getY() - p.getY());
      afstandHorizontaal *= afstandHorizontaal;
      afstandVerticaal *= afstandVerticaal;
      double totaalAfstand = Math.sqrt(afstandHorizontaal + afstandVerticaal);
      return totaalAfstand;
    }

    
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
