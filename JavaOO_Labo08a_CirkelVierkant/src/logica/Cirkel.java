package logica;

public class Cirkel extends Figuur {
    private double straal;

    public Cirkel(){
        super();
        this.straal=50;
    }
    public Cirkel(double straal){
        super();
        this.straal=straal;
        
    }
    
    public Cirkel(Punt p, double straal){
        super(p);  
        if (straal < 0 || p == null) {
            throw new IllegalArgumentException("p is null of straal is kleiner dan 0");
            
        }        
        this.straal = straal;     
        
    }
    public Cirkel(Kleur kleur,Kleur rand,int dikteRand,double straal ){
        super(kleur, rand, dikteRand, new Punt(0,0));  
        if (straal < 0 || kleur == null || rand == null || dikteRand <= 0) {
            throw new IllegalArgumentException("straal < 0 of rand of kleur is null of dikteRand <0");
            
        }    
        this.straal = straal;       
        
    }
    
    public Cirkel(Kleur kleur,Kleur rand,int dikteRand,Punt punt,double straal ){
        super(kleur, rand, dikteRand, punt);  
        if (straal < 0 || kleur == null || rand == null || dikteRand <= 0) {
            throw new IllegalArgumentException("straal < 0 of rand of kleur is null of dikteRand <0");
            
        }    
        this.straal = straal;       
        
    }
    public double getStraal() {
        return straal;
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
        if (super.getDikteRand() != other.getDikteRand()) {
            return false;
        }
        if (super.getKleur() != other.getKleur()) {
            return false;
        }
        if (super.getKleurRand() != other.getKleurRand()) {
            return false;
        }
        return true;
    }

    

    

    @Override
    public String toString() {
        return "Cirkel{" + "straal=" + straal + ", kleur=" + super.getKleur() + ", rand=" + super.getKleurRand() + '}';
    }    
    


}
