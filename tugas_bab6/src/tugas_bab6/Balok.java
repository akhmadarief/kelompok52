
package tugas_bab6;

public class Balok extends kelas1{
    public Balok(double p, double l, double t){
        super(p,l);
        this.t = t;
    }
    
    public double VolBalok(){
        double volBalok;
        volBalok = getluas()*t;
        return volBalok;
    }
}
