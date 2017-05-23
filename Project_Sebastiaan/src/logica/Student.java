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
        if (naam == null || voornaam == null || curriculum == null) {
            throw new IllegalArgumentException("fout bij input constructor Student");
            
        }
        this.naam = naam;
        this.voornaam = voornaam;
        this.curriculum = curriculum;
        read();
        
   

    }
    public Student(Curriculum c){
        this.curriculum = c;
        this.naam ="";
        this.voornaam = "";
    }
    public void read(){
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
        if (voornaam != null) {
        this.voornaam = voornaam;    
        }else{
            throw new IllegalArgumentException("setVoornaam : String is null");
        }
        
    }

    public void setNaam(String naam) {
        if (naam != null) {
        this.naam = naam;    
        }else{
        throw new IllegalArgumentException("setNaam: String is null");
        }
        
    }

    public void setCurriculum(Curriculum curriculum) {
        if (curriculum == null) {
            throw new IllegalArgumentException("setCurriculum: curriculum is null");
            
        }else{
           this.curriculum = curriculum;
            read(); 
        }
        
        
    }
}
