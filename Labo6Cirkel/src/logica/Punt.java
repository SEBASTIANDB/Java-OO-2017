package logica;

public class Punt {

    private int x, y;

    public Punt(int x, int y) {
        
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;

    }

    public int setX(int x) {
        this.x = x;
        return x;
    }

    public int getY() {
        return y;
    }

    public int setY(int y) {
        this.y = y;
        return y;
    }

    public double berekenAfstand(Punt p) {        
        double afstand = Math.sqrt(Math.pow((p.getX() - x), 2) + Math.pow((p.getY() - y), 2));
        return afstand;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Punt other = (Punt) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Punt{" + "x=" + x + ", y=" + y + '}';
    }

}
