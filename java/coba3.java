

import java.util.Scanner;
public class coba3 {
    public static void main (String[]args) {
        final double PI = 3.14159;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jari-jari: ");
        double r = sc.nextDouble();
        double luas = PI *r *r;
        System.out.println("Luas lingkaran = " + luas);
    }
    
}
