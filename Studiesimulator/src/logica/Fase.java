/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.Objects;

/**
 * hier voor elke fase 5 + 1 vakkentoevoegen in een arraylist.gebruik voor
 * initialisatie in de constructor de getters van de klasse Read. Gebruik dan in
 * de klasse Curriculum 3 fases om een curriculum te maken. Gebruik dan het
 * curriculum en display het dmv een Jlist op de gui.
 *
 * @author Sebastiaan
 */
public class Fase {

    private ArrayList<Vak> faseVakken;//geen size fixed zetten, want als er later een word verplaatst(ISP) dan zitten we vast.

    public Fase(ArrayList<Vak> gemeenschappelijk, ArrayList<Vak> uniek) {

        for (int i = 0; i < gemeenschappelijk.size(); i++) {
            this.faseVakken.add(gemeenschappelijk.get(i));

        }
        for (int i = 0; i < uniek.size(); i++) {
            this.faseVakken.add(uniek.get(i));

        }

    }

    public ArrayList<Vak> getFaseVakken() {
        return faseVakken;
    }
    public int getStudiePunten(){
       int totaalSTPN = 0;
        for (int i = 0; i < faseVakken.size(); i++) {
            totaalSTPN += faseVakken.get(i).getStpn();
            
        }
        return totaalSTPN;
        
    }

    public void VoegVakToe(Vak v) {
        faseVakken.add(v);

    }

    public void verwijderVak(Vak v) {
        faseVakken.remove(v);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
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
        final Fase other = (Fase) obj;
        if (!Objects.equals(this.faseVakken, other.faseVakken)) {
            return false;
        }
        return true;
    }

}
