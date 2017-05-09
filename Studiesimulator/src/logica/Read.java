/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import be.odisee.ikdoeict.TextFile;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author Sebastiaan
 */
public class Read {

    private String filename;
    BufferedReader reader = null;
    private ArrayList<Vak> vakken = new ArrayList<>();
    private String code;
    private String naam;
    private int fase;
    private String stgrp;
    private int semester;
    private int stpn;
    private File file;
    private String folderPath;
    private Path path = Paths.get(folderPath, filename);
    private Charset charset = Charset.forName("UTF-8");

    public Read(String filename) {
        if (filename.equals("")) {
            throw new IllegalArgumentException("Je hebt geen geldig document opgeven");
        }
        this.filename = filename;
        File file = new File("curriculum.txt");

    }

    public void inlezen() {
        try (BufferedReader reader = Files.newBufferedReader(path, charset)) {//alle vakken toevoegen aan vakken arraylist
            String line;
            while ((line = reader.readLine()) != null) {
                //separate all csv fields into string array
                String[] Variables = line.split(";");
                if (Variables[0].charAt(0) == '#') {
                    //dan is het geen inlezing van een vak, maar een begin,
                    //of het einde van een categorie vakken(bijvoorbeeld enkel FASE 1 vakken)
                } else {
                    code = Variables[0];
                    naam = Variables[1];
                    if (Variables[2] == "Fase1") {
                        fase = 1;
                    } else if (Variables[2] == "Fase2") {
                        fase = 2;
                    }                    
                    stgrp = Variables[3];
                    if (Variables[4] == "Sem1") {
                        semester = 1;
                    } else if (Variables[4] == "Sem2") {
                        semester = 2;
                    }
                    
                    stpn = Integer.parseInt(Variables[5]);
                    vakken.add(new Vak(code, naam, fase, stgrp, semester, stpn));
                }
            }
        } catch (IOException e) {
            System.err.println(e);
        }

    }
    public ArrayList<Vak> getStudiegroepSpecifiek(ArrayList<Vak> vakken, Studiegroep s){
        ArrayList<Vak> vakkenSelectie = null;
        for (int i = 0; i < vakken.size(); i++) {
            if (vakken.get(i).getStgrp() == s) {
                vakkenSelectie.add(vakken.get(i));
                
            }
            
        }
        return vakkenSelectie;
        
        
    }
    public ArrayList<Vak> getSemester(ArrayList<Vak> vakken, int semester, int jaar){
        ArrayList<Vak> vakkenSelectie = null;
        for (int i = 0; i < vakken.size(); i++) {
            if (vakken.get(i).getSemester() == semester && vakken.get(i).getFase() == jaar) {
                vakkenSelectie.add(vakken.get(i));
                
            }
            
        }
        return vakkenSelectie;
    }

    public ArrayList<Vak> getFase1(ArrayList<Vak> vakken) {//geeft alle vakken van fase 1
        ArrayList<Vak> vakkenFase1 = null;
        for (int i = 0; i < vakken.size(); i++) {
            if (vakken.get(i).getFase() == 1) {
                vakkenFase1.add(vakken.get(i));

            }

        }
        return vakkenFase1;
    }

    public ArrayList<Vak> getFase2(ArrayList<Vak> vakken) {//geeft alle vakken van fase 2

        ArrayList<Vak> vakkenFase2 = null;
        for (int i = 0; i < vakken.size(); i++) {
            if (vakken.get(i).getFase() == 2) {
                vakkenFase2.add(vakken.get(i));

            }

        }
        return vakkenFase2;
    }

    public ArrayList<Vak> getFase3(ArrayList<Vak> vakken) {//geeft alle vakken van fase 3

        ArrayList<Vak> vakkenFase3 = null;
        for (int i = 0; i < vakken.size(); i++) {
            if (vakken.get(i).getFase() == 3) {
                vakkenFase3.add(vakken.get(i));

            }

        }
        return vakkenFase3;
    }

    public String[] toArray() {//zet arrayList om naar array zodat die als Jlist kan getoond worden op de GUI
        String[] array = new String[vakken.toArray().length];
        for (int i = 0; i < vakken.toArray().length; i++) {
            array[i] = String.valueOf(vakken.get(i).getCode()
                    + ";" + vakken.get(i).getNaam()
                    + ";" + vakken.get(i).getFase()
                    + ";" + vakken.get(i).getStgrp()
                    + ";" + vakken.get(i).getSemester()
                    + ";" + vakken.get(i).getStpn());
        }
        return array;
    }

    public String getCode() {
        return code;
    }

    public int getFase() {
        return fase;
    }

    public String getStgrp() {
        return stgrp;
    }

    public int getStpn() {
        return stpn;
    }
    

}
