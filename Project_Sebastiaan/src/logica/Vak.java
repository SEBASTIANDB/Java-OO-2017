/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Sebastiaan.debaedts
 */
public class Vak implements Comparable<Vak> {
    
    private String code;
    private String naam;
    private Studiegroep stgrp;
    private String fase;
    private String semester;
    private int stdp;

    public Vak(String opocode, String naam, String fase, Studiegroep groep, String semester, int studiepunten) {
        if (opocode == null || naam == null || fase == null || groep == null || semester == null || studiepunten <= 0) {
            throw new IllegalArgumentException("fout bij aanmaken van het vak");
        }
        this.code = opocode;
        this.naam = naam;
        this.stgrp = groep;
        this.fase = fase;
        this.semester = semester;
        this.stdp = studiepunten;
    }

    public void setFase(String fase) {
        if (fase == null) {
            throw new IllegalArgumentException("setFase: fase is null");
        }
        this.fase = fase;
    }
    
    public String getCode() {
        return code;
    }

    public String getNaam() {
        return naam;
    }

    public Studiegroep getStgrp() {
        return stgrp;
    }

    public String getFase() {
        return fase;
    }

    public String getSemester() {
        return semester;
    }

    public int getStdp() {
        return stdp;
    }

    @Override
    public String toString() {
        return fase + "-" + semester + "-" + stgrp.toString() + " - " + naam + " (" + stdp + "stp)" + "\n";
    }

    @Override
    public int compareTo(Vak v) {
        if (v == null) {
            throw new IllegalArgumentException("compareTo : vak is null");
            
        }
        if(this.fase.equals(v.fase)) {
            if (this.semester.equals(v.getSemester())) {
                if (this.stgrp.equals(v.getStgrp())) {
                    return this.naam.compareTo(v.getNaam());
                    
                }
                else{
                    return this.stgrp.compareTo(v.getStgrp());
                }
                
            }
            else{
                return this.semester.compareTo(v.getSemester());
            }
            
        }
        
        else {
            return this.fase.compareTo(v.fase);
        }
    }
}
