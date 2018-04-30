package tugas_bab6;
import java.util.Scanner;
public class Tugas_bab6 {
    
    public static void main(String[] args) {
        double p,l,t,luas,kll;
        Scanner persegi = new Scanner (System.in);
        System.out.println("Program Perhitungan Volume dan Luas Permukaan Balok");
        System.out.println("Kelompok 52");
        System.out.print("Panjang: ");
        p = persegi.nextInt();
        System.out.print("Lebar: ");
        l = persegi.nextInt();
        System.out.print("Tinggi: ");
        t = persegi.nextInt();
        
        kelas1 PP = new kelas1(p,l);
        Balok B = new Balok(p,l,t);
        
        System.out.println("\nLuas Permukaan: "+PP.getPerm());
        System.out.println("Volume: "+B.VolBalok());
        System.ou.println("terimakasih muahhh");
    }
    
}
