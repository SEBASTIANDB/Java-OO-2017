/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Sebastiaan.debaedts
 */
public class Student{

    private String voornaam;
    private String naam;
    private Curriculum curriculum;
    String file = "student.csv";
    String currentLine = "";

    public Student(String naam, String voornaam, Curriculum curriculum) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.curriculum = curriculum;
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write(curriculum.getVakkenlijst().toString());

        } catch (Exception e) {

        } finally {

            try {

                if (bw != null) {
                    bw.close();
                }

                if (fw != null) {
                    fw.close();
                }

            } catch (Exception ex) {

            }

        }

    }
    

    public Curriculum getCurriculum() {
        return curriculum;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
    }

    

    

    

}
