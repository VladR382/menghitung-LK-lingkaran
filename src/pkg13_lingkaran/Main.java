package pkg13_lingkaran;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        /*
        Lingkaran
        r adalah jari-jari
        Luas = phi x r x r
        Keliling = phi x diameter
        d = 2 x r
        */
        
        final double phi = 3.14;
        double L, K, r, d;
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Luas dan Keliling Lingkaran");
        System.out.print("Masukan nilai r = ");
        r = input.nextDouble();
        d = 2 * r;
        
        L = phi * r * r;
        K = phi * d;
        
        System.out.println("Luas = phi x r x r");
        System.out.println("L = " + L);
        System.out.println("Keliling = phi x diameter");
        System.out.println("K = "+ K);
    }
    
}
