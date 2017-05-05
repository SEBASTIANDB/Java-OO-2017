/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.Color;

/**
 *
 * @author sebastiaan.debaedts
 */
public enum Kleur {
    wit,zwart,rood,oranje,geel,groen,blauw,indigo,violet;
    
    public Color vertaalKleur() {
        switch (this) {
            case wit:
                return Color.WHITE;
            case zwart:
                return Color.BLACK;
            case rood:
                return Color.RED;
            case oranje:
                return Color.ORANGE;
            case geel:
                return Color.YELLOW;
            case groen:
                return Color.GREEN;
            case blauw:
                return Color.BLUE;
            case indigo:
                return new Color(75, 0, 130);
            case violet:
                return new Color(238, 130, 238);
            default:
                return null;
        }
}
    
}
