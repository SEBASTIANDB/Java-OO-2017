/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author Sebastiaan.Debaedts
 */
public interface Filters {
    public ArrayList<Vak> filterSemester(ArrayList<Vak> lijst, String semesters);
    public ArrayList<Vak> filterFase(ArrayList<Vak> lijst, String fase);
    public void pasFaseToe();

    
   
    
}
