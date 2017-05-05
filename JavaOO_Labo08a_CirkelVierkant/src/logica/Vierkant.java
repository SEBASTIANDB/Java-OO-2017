package logica;

public class Vierkant extends Figuur {
    private double zijde;

    public Vierkant(){
        super();
        this.zijde=50;
    }
    public Vierkant(double zijde){
        super();
        this.zijde=zijde;
        
    }
    
    public Vierkant(Punt p, double zijde){
        super(p);  
        if (zijde < 0 || p == null) {
            throw new IllegalArgumentException("p is null of straal is kleiner dan 0");
            
        }        
        this.zijde = zijde;     
        
    }
    public Vierkant(Kleur kleur,Kleur rand,int dikteRand,double zijde ){
        super(kleur, rand, dikteRand, new Punt(0,0));  
        if (zijde < 0 || kleur == null || rand == null || dikteRand <= 0) {
            throw new IllegalArgumentException("straal < 0 of rand of kleur is null of dikteRand <0");
            
        }    
        this.zijde = zijde;       
        
    }
    
    public Vierkant(Kleur kleur,Kleur rand,int dikteRand,Punt punt,double zijde ){
        super(kleur, rand, dikteRand, punt);  
        if (zijde < 0 || kleur == null || rand == null || dikteRand <= 0) {
            throw new IllegalArgumentException("straal < 0 of rand of kleur is null of dikteRand <0");
            
        }    
        this.zijde = zijde;       
        
    }
    public double getZijde() {
        return zijde;
    }    
    public double berekenOmtrek(){
       double omtrek = 2*zijde * Math.PI;
       return omtrek;
    }
    public double berekenOppervlakte(){
        double oppervlakte = Math.pow(zijde, 2) * Math.PI;
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
        final Vierkant other = (Vierkant) obj;
        if (Double.doubleToLongBits(this.zijde) != Double.doubleToLongBits(other.zijde)) {
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
        return "Cirkel{" + "straal=" + zijde + ", kleur=" + super.getKleur() + ", rand=" + super.getKleurRand() + '}';
    }    
    


}
