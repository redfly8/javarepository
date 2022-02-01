import java.util.Scanner;
public class test1 {

    public static void main(String[] args)  {
        System.out.println("Bitte Radius eingeben.");

        Scanner eingabe = new Scanner(System.in);
        double radius;
        double umfang;
        double flaeche;
        double PI = 3.14156;
        radius = eingabe.nextDouble();
        umfang = 2*PI*radius;
        flaeche = radius*radius*PI;
        umfang = Math.round(umfang*100)/100.0;
        System.out.println("Fläche:");
        
        System.out.println(flaeche);
        System.out.println("Umfang:");
        
        System.out.println(umfang);
    }
}