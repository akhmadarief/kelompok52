package tugas_bab6;

public class kelas1 {
    
    double p,l,t;

    public kelas1(double p, double l){
        this.p = p;
        this.l = l;
    }
    
    public double getPerm(){
        double perm;
        perm = ((p*l)+(p*t)+(l*t)+(p*l)+(p*t)+(l*t));
        return perm;
    }
    
    public double getluas(){
        double luas;
        luas = p*l;
        return luas;
    }
}
