/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Objects;

/**
 *
 * @author Sebastiaan
 * @version Project Java oo 2017
 *
 */
//alle vakken met getters.Uit een bestand gelezen curriculum.txt
public class Vak {

    private String code;
    private String naam;
    private int fase;
    private Studiegroep stgrp;  //studiegroep moet nog omgezet worden van String naar Studiegroep. maak er in Read een methode voor.   
    private String studiegrp;
    private int semester;   //semester moet nog van String naar int omgezet worden. Maak er in Read een methode voor.
    private int stpn;

    public Vak(String code, String naam, int fase, String stgrp, int semester, int stpn) {
        if (code.length() != 6 || (fase < 1 || fase > 2)   || !contains(studiegrp) || (semester > 2 || semester < 1)) {
            throw new IllegalArgumentException("fout bij constructor in klasse Vak");
        }
            this.code = code;
            this.naam = naam;
            this.fase = fase;
            this.studiegrp = studiegrp;
            this.stgrp = Studiegroep.valueOf(studiegrp);
            this.semester = semester;
            this.stpn = stpn;

        
    }

    public static boolean contains(String test) {

        for (Studiegroep c : Studiegroep.values()) {
            if (c.name().equals(test)) {
                return true;
            }
        }

        return false;
    }

    public String getCode() {
        return code;
    }

    public String getNaam() {
        return naam;
    }

    public int getFase() {
        return fase;
    }

    public Studiegroep getStgrp() {
        return stgrp;
    }

    public int getSemester() {
        return semester;
    }

    public int getStpn() {
        return stpn;
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
        final Vak other = (Vak) obj;
        if (this.semester != other.semester) {
            return false;
        }
        if (this.stpn != other.stpn) {
            return false;
        }
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
        if (!Objects.equals(this.naam, other.naam)) {
            return false;
        }
        if (!Objects.equals(this.fase, other.fase)) {
            return false;
        }
        if (this.stgrp != other.stgrp) {
            return false;
        }
        return true;
    }

}
