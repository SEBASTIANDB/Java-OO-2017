package logica;

public class Cirkel extends Punt {
    private double straal;
    private Kleur kleur;
    private Kleur rand;
    private int dikteRand;
    
    
    public Cirkel(Punt p, double straal){
        super(p.getX(), p.getY());  
        if (straal < 0 || p == null) {
            throw new IllegalArgumentException("p is null of straal is kleiner dan 0");
            
        }
        this.straal = straal;
        this.kleur = Kleur.wit;
        this.rand = Kleur.zwart;
        this.dikteRand = 1;
        
        
    }
    public Cirkel(Kleur kleur,Kleur rand,int dikteRand,Punt punt,double straal ){
        super(punt.getX(), punt.getY());  
        if (straal < 0 || kleur == null || rand == null || dikteRand <= 0) {
            throw new IllegalArgumentException("straal < 0 of rand of kleur is null of dikteRand <0");
            
        }
        this.dikteRand = dikteRand;
        this.kleur = kleur;
        this.rand = rand;
        this.straal = straal;
        
        
    }
    public double getStraal() {
        return straal;
    }    

    public Kleur getKleur() {
        return kleur;
    }

    public Kleur getKleurRand() {
        return rand;
    }

    public int getDikteRand() {
        return dikteRand;
    }
    
    public double berekenOmtrek(){
       double omtrek = 2*straal * Math.PI;
       return omtrek;
    }
    public double berekenOppervlakte(){
        double oppervlakte = Math.pow(straal, 2) * Math.PI;
        return oppervlakte;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
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
        final Cirkel other = (Cirkel) obj;
        if (Double.doubleToLongBits(this.straal) != Double.doubleToLongBits(other.straal)) {
            return false;
        }
        if (this.dikteRand != other.dikteRand) {
            return false;
        }
        if (this.kleur != other.kleur) {
            return false;
        }
        if (this.rand != other.rand) {
            return false;
        }
        return true;
    }

    

    

    @Override
    public String toString() {
        return "Cirkel{" + "straal=" + straal + ", kleur=" + kleur + ", rand=" + rand + '}';
    }    
    


}
