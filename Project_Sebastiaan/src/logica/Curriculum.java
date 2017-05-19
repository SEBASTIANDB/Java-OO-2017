/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Sebastiaan De Baedts
 */
public class Curriculum{

    private ArrayList<Vak> vakkenlijst = new ArrayList();
    
    public void setCurriculum(ArrayList<Vak> vakkenlijst) {
        this.vakkenlijst = vakkenlijst;
    }
    public void voegVakkenToe(ArrayList<Vak> lijst){
        this.vakkenlijst.addAll(lijst);
        
    }

    public Curriculum() {

       
        String file = "curriculum.csv";
        String currentLine = "";        
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file));

            // enkel gevulde lijnen
            while ((currentLine = br.readLine()) != null) {//als currentline en de gelezen lijn niet null zijn
                if (!(currentLine.contains("#"))) {//niet als er # staat
                    String[] vakInfo = currentLine.split(";");
                    this.vakkenlijst.add(
                            new Vak(
                                    vakInfo[0],
                                    vakInfo[1],
                                    vakInfo[2],
                                    Studiegroep.valueOf(vakInfo[3]),
                                    vakInfo[4],
                                    Integer.parseInt(vakInfo[5])
                            )
                    );
                }
            }
        } 
        
        // Catch any exceptions that may occur
        catch (Exception e) {
            System.err.print(e.getMessage());
        } 
        
        // Close the BufferedReader (only if not null)
        finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
        }

    }

    public ArrayList<Vak> getVakkenlijst() {
        return vakkenlijst;
    }
    public ArrayList<Vak> toonVakkenELOICT(ArrayList<Vak> vakken) {       
        ArrayList<Vak> selectie = new ArrayList();
        for (Vak vak : this.getVakkenlijst()) {//Vak vak : curriculum.getVakkenlijst()
            if (vak.getStgrp() == Studiegroep.ELOICT) {
                selectie.add(vak);
            }
        }

        return selectie;
    }
    
    public ArrayList<Vak> toonVakkenElo(ArrayList<Vak> vakken) {//alle vakken van ELO

        ArrayList<Vak> selectie = new ArrayList();
        for (Vak vak : this.getVakkenlijst()) {//Vak vak : curriculum.getVakkenlijst()
            if (vak.getStgrp() == Studiegroep.ELO || vak.getStgrp() == Studiegroep.ELOICT) {
                selectie.add(vak);
            }
        }

        return selectie;
    }

    
    public ArrayList<Vak> toonVakkenIct(ArrayList<Vak> vakken) {//alle vakken van ICT

        ArrayList<Vak> selectie = new ArrayList();

        for (Vak vak : this.getVakkenlijst()) {
            if (vak.getStgrp() == Studiegroep.ICT || vak.getStgrp() == Studiegroep.ELOICT ) {
                selectie.add(vak);
            }
        }

        return selectie;
    }

    
    public ArrayList<Vak> toonVakkenInfrastructuur(ArrayList<Vak> vakken) {

        ArrayList<Vak> selectie = new ArrayList();

        for (Vak vak : this.getVakkenlijst()) {
            if (vak.getStgrp() == Studiegroep.ICT || vak.getStgrp() == Studiegroep.ELOICT || vak.getStgrp() == Studiegroep.ICT_NET) {//alles van ICT + NET
                selectie.add(vak);
            }
        }

        return selectie;
    }

    
    public ArrayList<Vak> toonVakkenWeb(ArrayList<Vak> vakken) {
        
        ArrayList<Vak> selectie = new ArrayList();

        for (Vak vak : this.getVakkenlijst()) {
            if (vak.getStgrp() == Studiegroep.ICT || vak.getStgrp() == Studiegroep.ELOICT || vak.getStgrp() == Studiegroep.ICT_WEB) {//alles van ICT + WEB
                selectie.add(vak);
            }
        }

        return selectie;
    }

    
}
