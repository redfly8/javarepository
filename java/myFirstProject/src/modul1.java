import java.util.Scanner;
public class modul1 {

    public static void main(String[] args)  {
        System.out.println("Bitte zahl zum Verdoppeln eingeben.");

        Scanner eingabe = new Scanner(System.in);
        double zahl;
        zahl = eingabe.nextDouble();
        zahl = zahl * 2;
        System.out.println(zahl);
    }
}

