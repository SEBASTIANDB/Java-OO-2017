/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Sebastiaan
 */
public class Analyse implements Filters {

    ArrayList<Vak> vakken;
    ArrayList<String> semesters;
    ArrayList<String> fasen;
    ArrayList<Studiegroep> studiegroepen;

    public Analyse() {
        this.vakken = new ArrayList();
        this.semesters = new ArrayList();
        this.fasen = new ArrayList();
        this.studiegroepen = new ArrayList();

    }

    public void setSemesters(String semester) {//deze methode is er om na te kijken welke semesters worden gebruikt in de vakkenlijst, en ze te setten      
        if (semester != null) {
            this.semesters.add(semester);
        } else {
            throw new IllegalArgumentException("String semester is null");
        }

    }

    public void setFasen(String fase) {//deze methode is er om na te kijken welke fases worden gebruikt in de vakkenlijst, en ze te setten
        if (fase != null) {
            if (!fasen.contains(fase)) {
                this.fasen.add(fase);
            }
        } else {
            throw new IllegalArgumentException("String Fase is null");
        }

    }

    public void setStudiegroepen(Studiegroep sg) {//deze methode is er om na te kijken welke Studiegroepen worden gebruikt in de vakkenlijst, en ze te setten
        if (sg != null) {
            if (!studiegroepen.contains(sg)) {
                this.studiegroepen.add(sg);
            }
        } else {
            throw new IllegalArgumentException("Studiegroep sg is null");
        }

    }

    public void setVakkenLijst(ArrayList<Vak> vakken) {
        if (vakken != null) {

            this.vakken = vakken;
        } else {
            throw new IllegalArgumentException("vakkenlijst is null");
        }

    }

    public void removeSemesters(String semester) {//deze methode is er om semesters weg te doen   
        if (semester != null) {
            if (semesters.contains(semester)) {
                this.semesters.remove(semester);
            }
        } else {
            throw new IllegalArgumentException("String semester is null");
        }

    }

    public void removeFasen(String fase) {//deze methode is er om fasen weg te doen

        if (fase != null) {
            if (fasen.contains(fase)) {
                this.fasen.remove(fase);
            }
        } else {
            throw new IllegalArgumentException("String fase is null");
        }

    }

    public void removeStudiegroepen(Studiegroep sg) {//deze methode is er om studiegroepen weg te doen
        if (studiegroepen.contains(sg)) {
            this.studiegroepen.remove(sg);
        } else {
            throw new IllegalArgumentException("ingegeven studiegroep bestaat niet");
        }
    }

    private int getTotaalStdp() {//get totaal aantal studiepunten in de arraylist
        int sum = 0;
        for (Vak vak : vakken) {
            sum += vak.getStdp();

        }
        return sum;
    }

    private int getStdpFase(String fase) {//get aantal studiepunten van bepaalde fase

        if (fase != null) {
            int sum = 0;

            for (Vak v : vakken) {
                if (v.getFase().equals(fase)) {
                    sum += v.getStdp();

                }

            }
            return sum;
        } else {
            throw new IllegalArgumentException("String fase is null");
        }

    }

    private int getStdpRichting(Studiegroep s, String fase) {//get totaal aantal studiepunten van een bepaalde richting in een bepaalde fase
        if (s != null && fase != null) {
            int sum = 0;
            for (Vak v : vakken) {
                if (v.getFase().equals(fase) && v.getStgrp().equals(s)) {
                    sum += v.getStdp();

                }

            }
            return sum;
        } else {
            throw new IllegalArgumentException("studigroep en/of fase is null");
        }

    }

    private int getStdpRichting(Studiegroep s, String fase, String semester) {//get totaal aantal studiepunten van een bepaalde richting in een bepaalde fase in een bepaald semester
        if (s != null && fase != null && semester != null) {
            int sum = 0;
            for (Vak v : vakken) {
                if (v.getFase().equals(fase) && v.getStgrp().equals(s) && v.getSemester().equals(semester)) {
                    sum += v.getStdp();

                }

            }
            return sum;
        } else {
            throw new IllegalArgumentException("studiegroep of fase of semester is null");
        }

    }
    //tot hier was alles voor de Aantal vakken radiobutton keuze.

    private int getTotaalVakken() {//get totaal aantal vakken in analyse
        return vakken.size() - 1;

    }

    private int getAantalVakkenFase(String fase) {//get aantal vakken van bepaalde fase
        if (fase != null) {
            int sum = 0;
            for (Vak v : vakken) {
                if (v.getFase().equals(fase)) {
                    sum += 1;

                }

            }
            return sum;
        } else {
            throw new IllegalArgumentException("fase is null");
        }

    }

    private int getAantalVakkenFaseInSemester(String fase, String semester) {//get aantal vakken van bepaalde fase in een bepaald semester
        if (fase != null && semester != null) {
            int sum = 0;
            for (Vak v : vakken) {
                if (v.getFase().equals(fase) && v.getSemester().equals(semester)) {
                    sum += 1;

                }

            }
            return sum;
        } else {
            throw new IllegalArgumentException("fase of semester is null");
        }

    }

    private int getAantalVakkenRichting(Studiegroep s, String fase, String semester) {//get totaal aantal vakken van een bepaalde richting in een bepaalde fase in een bepaald semester
        if (s != null && fase != null && semester != null) {
            int sum = 0;
            for (Vak v : vakken) {
                if (v.getFase().equals(fase) && v.getStgrp().equals(s) && v.getSemester().equals(semester)) {
                    sum += 1;

                }

            }
            return sum;
        } else {
            throw new IllegalArgumentException("studiegroep of fase of semester is null");
        }

    }

    private int getAantalVakkenRichting(Studiegroep s, String fase) {//get totaal aantal vakken van een bepaalde richting in een bepaalde fase
        if (s != null && fase != null) {
            int sum = 0;
            for (Vak v : vakken) {
                if (v.getFase().equals(fase) && v.getStgrp().equals(s)) {
                    sum += 1;

                }

            }
            return sum;
        } else {
            throw new IllegalArgumentException("fase of studiegroep is null");
        }

    }

    public ArrayList<Vak> getVakkenFaseGroep(Studiegroep s, String fase) {//get vakken van specifieke fase en groep
        ArrayList<Vak> klaar = new ArrayList();
        for (Vak v : vakken) {
            if (v.getStgrp().equals(s) && v.getFase().equals(fase)) {
                klaar.add(v);
            }

        }
        return klaar;
    }

    public ArrayList<Studiegroep> filterVoorGroepenOpFase(ArrayList<Vak> arr, String fase) {//groepen krijgen van een bepaalde fase
        ArrayList<Vak> klaar = new ArrayList();
        klaar = filterFase(arr, fase);//filteren op fase
        ArrayList<Studiegroep> groepVanFase = new ArrayList();
        for (Vak v : klaar) {//arraylist vullen met juiste groepen in die fase
            if (!groepVanFase.contains(v.getStgrp())) {
                groepVanFase.add(v.getStgrp());
            }
        }
        return groepVanFase;

    }

    public String[][] printStudiepunten(ArrayList<Vak> lijst) {//als de radiobtn op aantal vakken staat
        int somSemester1 = 0;
        int somSemester2 = 0;
        String[][] gegevens = new String[16][4];
        ArrayList<Vak> vakkenFaseGroep = new ArrayList();//vakken van bepaalde fase van bepaalde groep
        String output = "";
        for (String s : semesters) {
            output += s + "\t";
        }
        output += "\n";
        output += "------------------------------------------------------------------------" + "\n";

        for (Vak v : lijst) {
            if (v.getFase().equals("Fase1")) {
                gegevens[0][0] += v.getStdp();

                if (v.getSemester().equals("Sem1")) {
                    gegevens[0][1] += v.getStdp();
                } else {
                    gegevens[0][2] += v.getStdp();
                }
            }
            if (v.getFase().equals("Fase2")) {
                gegevens[1][0] += v.getStdp();

                if (v.getSemester().equals("Sem1")) {//studiepunten in de juiste plaats steken
                    gegevens[1][1] += v.getStdp();
                } else {
                    gegevens[1][2] += v.getStdp();
                }
            }
            if (v.getFase().equals("Fase3")) {
                gegevens[2][0] += v.getStdp();

                if (v.getSemester().equals("Sem1")) {
                    gegevens[2][1] += v.getStdp();
                } else {
                    gegevens[2][2] += v.getStdp();
                }

            }

        }
        if (fasen.contains("Fase1")) {//hier wil ik de groepen toevoegen onder FASE X

            int i = 3;
            gegevens[3][0] = "Fase1";
            for (Studiegroep s : filterVoorGroepenOpFase(lijst, "Fase1")) {//namen van de groepen onder FASE 1
                vakkenFaseGroep = new ArrayList(getVakkenFaseGroep(s, "Fase1"));
                for (Vak v : vakkenFaseGroep) {//som van studiepunten van vakken in bepaalde fase in bepaalde groep
                    if (v.getSemester().equals("Sem1")) {
                        somSemester1 += v.getStdp();
                    } else {
                        somSemester2 += v.getStdp();
                    }
                }
                gegevens[3+i][0] = s.toString();
                gegevens[3+i][1] = Integer.toString(somSemester1);
                gegevens[3+i][2] = Integer.toString(somSemester2);
                i++;
            }
             i = 0;
        }

        if (fasen.contains("Fase2")) {
           int i = 3;
            gegevens[6][0] = "Fase2";
            for (Studiegroep s : filterVoorGroepenOpFase(lijst, "Fase2")) {//namen van de groepen onder FASE 1
                vakkenFaseGroep = new ArrayList(getVakkenFaseGroep(s, "Fase2"));
                for (Vak v : vakkenFaseGroep) {//som van studiepunten van vakken in bepaalde fase in bepaalde groep
                    if (v.getSemester().equals("Sem2")) {
                        somSemester1 += v.getStdp();
                    } else {
                        somSemester2 += v.getStdp();
                    }
                }
                gegevens[6+i][0] = s.toString();
                gegevens[6+i][1] = Integer.toString(somSemester1);
                gegevens[6+i][2] = Integer.toString(somSemester2);
                i++;
            }
             i = 0;
            }
            if (fasen.contains("Fase3")) {
               int i = 3;
            gegevens[9][0] = "Fase3";
            for (Studiegroep s : filterVoorGroepenOpFase(lijst, "Fase3")) {//namen van de groepen onder FASE 1
                vakkenFaseGroep = new ArrayList(getVakkenFaseGroep(s, "Fase3"));
                for (Vak v : vakkenFaseGroep) {//som van studiepunten van vakken in bepaalde fase in bepaalde groep
                    if (v.getSemester().equals("Sem3")) {
                        somSemester1 += v.getStdp();
                    } else {
                        somSemester2 += v.getStdp();
                    }
                }
                gegevens[9+i][0] = s.toString();
                gegevens[9+i][1] = Integer.toString(somSemester1);
                gegevens[9+i][2] = Integer.toString(somSemester2);
                i++;
            }
            i = 0;
            }
            return gegevens;
            
    }

    

    

    public ArrayList<Vak> maakAnalyseStudiepunten() {//als de radiobtn op aantal studiepunten staat
        return null;
    }

    @Override
    public ArrayList<Vak> filterSemester(ArrayList<Vak> lijst, String semesters) {
        ArrayList<Vak> nieuw = new ArrayList();
        for (Vak vak : lijst) {
            if (vak.getSemester().equals(semesters)) {
                nieuw.add(vak);
                //als semester gelijk is, toevoegen

            }

        }

        return nieuw;
    }

    @Override
    public ArrayList<Vak> filterFase(ArrayList<Vak> lijst, String fase) {
        ArrayList<Vak> nieuw = new ArrayList();
        for (Vak vak : lijst) {
            if (vak.getFase().equals(fase)) {
                nieuw.add(vak);
                //als fase gelijk is, toevoegen

            }

        }

        return nieuw;
    }

    @Override
    public void pasFaseToe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
