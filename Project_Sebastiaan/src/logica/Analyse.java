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
public class Analyse {

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
    public void setSemesters(String semester){//deze methode is er om na te kijken welke semesters worden gebruikt in de vakkenlijst, en ze te setten      
            this.semesters.add(semester);        
    }
    public void setFasen(String fase){//deze methode is er om na te kijken welke fases worden gebruikt in de vakkenlijst, en ze te setten
        if (!fasen.contains(fase)) {
             this.fasen.add(fase);
        }      
    }
    public void setStudiegroepen(Studiegroep sg){//deze methode is er om na te kijken welke Studiegroepen worden gebruikt in de vakkenlijst, en ze te setten
        if (!studiegroepen.contains(sg)) {
            this.studiegroepen.add(sg);
        }    
    }
    public void setVakkenLijst(ArrayList<Vak> vakken){
       this.vakken = vakken; 
    }
    public void removeSemesters(String semester){//deze methode is er om semesters weg te doen   
        if (semesters.contains(semester)) {
             this.semesters.remove(semester);   
        }            
    }
    public void removeFasen(String fase){//deze methode is er om fasen weg te doen
        if (fasen.contains(fase)) {
             this.fasen.remove(fase);
        }      
    }
    public void removeStudiegroepen(Studiegroep sg){//deze methode is er om studiegroepen weg te doen
        if (studiegroepen.contains(sg)) {
            this.studiegroepen.remove(sg);
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
        int sum = 0;
        for (Vak v : vakken) {
            if (v.getFase().equals(fase)) {
                sum += v.getStdp();

            }

        }
        return sum;
    }
    private int getStdpRichting(Studiegroep s, String fase){//get totaal aantal studiepunten van een bepaalde richting in een bepaalde fase
        int sum = 0;
        for (Vak v : vakken) {
            if (v.getFase().equals(fase) && v.getStgrp().equals(s)) {
                sum += v.getStdp();
                
            }
            
        }
        return sum;
    }
    private int getStdpRichting(Studiegroep s, String fase, String semester){//get totaal aantal studiepunten van een bepaalde richting in een bepaalde fase in een bepaald semester
        int sum = 0;
        for (Vak v : vakken) {
            if (v.getFase().equals(fase) && v.getStgrp().equals(s) && v.getSemester().equals(semester)) {
                sum += v.getStdp();
                
            }
            
        }
        return sum;
    }
    //tot hier was alles voor de Aantal vakken radiobutton keuze.

    private int getTotaalVakken() {//get totaal aantal vakken in analyse
        return vakken.size();

    }

    private int getAantalVakkenFase(String fase) {//get aantal vakken van bepaalde fase
        int sum = 0;
        for (Vak v : vakken) {
            if (v.getFase().equals(fase)) {
                sum += 1;

            }

        }
        return sum;
    }
    private int getAantalVakkenFaseInSemester(String fase, String semester) {//get aantal vakken van bepaalde fase in een bepaald semester
        int sum = 0;
        for (Vak v : vakken) {
            if (v.getFase().equals(fase) && v.getSemester().equals(semester)) {
                sum += 1;

            }

        }
        return sum;
    }
    
    private int getAantalVakkenRichting(Studiegroep s, String fase, String semester){//get totaal aantal vakken van een bepaalde richting in een bepaalde fase in een bepaald semester
        int sum = 0;
        for (Vak v : vakken) {
            if (v.getFase().equals(fase) && v.getStgrp().equals(s) && v.getSemester().equals(semester)) {
                sum += 1;
                
            }
            
        }
        return sum;
    }   
    private int getAantalVakkenRichting(Studiegroep s, String fase){//get totaal aantal vakken van een bepaalde richting in een bepaalde fase
        int sum = 0;
        for (Vak v : vakken) {
            if (v.getFase().equals(fase) && v.getStgrp().equals(s)) {
                sum += 1;
                
            }
            
        }
        return sum;
    }   

    public ArrayList<String> maakAnalyseAantal() {//als de radiobtn op aantal vakken staat
        ArrayList<String> nieuw = new ArrayList();
        String sems="";                                                   
        for (String sem : semesters) {// Sem1    Sem2
                     sems+= sem + "\t";                                                                           
            
        }
        nieuw.add(this.getTotaalVakken() + "\t" + "AANTAL" + "\t" + sems +"\n" );//12  AANTAL     
        nieuw.add("--------------------------------------------------------------------------------");
        for (String fase : fasen) {                                                                      
            nieuw.add(fase + "\t" + this.getAantalVakkenFase(fase) +"\t");//Fase1  12 
            for (String sem : semesters) {
                nieuw.add(nieuw.size() - 1, this.getAantalVakkenFaseInSemester(fase, semesters.get(0)) + "\t" + this.getAantalVakkenFaseInSemester(fase, semesters.get(1))+"\n");// 6   6      
                
            }
            for (Studiegroep sg : studiegroepen) {
                nieuw.add(sg + "\t" + this.getAantalVakkenRichting(sg, fase)+ this.getAantalVakkenRichting(sg, fase, semesters.get(0))+"\t" + this.getAantalVakkenRichting(sg, fase, semesters.get(1))+"\n"); //ELOICT   10  5   5
                
            }
        }
                
        
        return nieuw;
    }

    public ArrayList<Vak> maakAnalyseStudiepunten() {//als de radiobtn op aantal studiepunten staat
        ArrayList<Vak> nieuw = new ArrayList();
        
        return nieuw;
    }
}

    
