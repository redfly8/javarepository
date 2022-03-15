//modul 2 aufgabe 1

import java.util.Scanner;

public class lock {

    public static void main(String[] args) {
        System.out.println("test");
        int a, b, c;

        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Bitte geben sie den 3 stelligen Pin ein!");
        System.out.print("1. Ziffer: ");
        a = scanner.nextInt();
        System.out.print("2. Ziffer: ");
        b = scanner.nextInt();
        System.out.print("3. Ziffer: ");
        c = scanner.nextInt();*/

        /*
          if (a == 0 && b == 0 && c == 70
          ) {
          System.out.println("offen");
          } else {
          System.out.println("falscher PIN.");
         }
         */
        // obiges: Schritt 1

       /* for (int i = 3; i >0; i--) {
            System.out.println("Bitte geben sie den 3 stelligen Pin ein!");
            System.out.print("1. Ziffer: ");
            a = scanner.nextInt();
            System.out.print("2. Ziffer: ");
            b = scanner.nextInt();
            System.out.print("3. Ziffer: ");
            c = scanner.nextInt();

            if (a == 0 && b == 0 && c == 7) {
                System.out.println("offen");
                break;
            } else {
                int z = i-1;
                System.out.println("falscher PIN. Noch "+ z +" Versuch(e) übrig.");
            }

        }*/
        //Schritt 2 (FOR SCHLEIFE)
        /*boolean open = false;
        while (open == false) {
            System.out.println("Bitte geben sie den 3 stelligen Pin ein!");
            System.out.print("1. Ziffer: ");
            a = scanner.nextInt();
            System.out.print("2. Ziffer: ");
            b = scanner.nextInt();
            System.out.print("3. Ziffer: ");
            c = scanner.nextInt();

            if (a == 0 && b == 0 && c == 7) {
                System.out.println("offen");
                open = true;
            } else {
                
                System.out.println("falscher PIN.");
            }
            
        }*/
        boolean open = false;
        byte versuch = 0;
        int i = 3;

        while (open == false & i >0) {
            System.out.println("Bitte geben sie den 3 stelligen Pin ein!");
            System.out.print("1. Ziffer: ");
            a = scanner.nextInt();
            System.out.print("2. Ziffer: ");
            b = scanner.nextInt();
            System.out.print("3. Ziffer: ");
            c = scanner.nextInt();

            if (a == 0 && b == 0 && c == 7) {
                System.out.println("offen");
                break;
            } else {
                int z = i-1;
                if(z != 0){
                    System.out.println("falscher PIN. Noch "+ z +" Versuch(e) übrig.");
                }else{
                    System.out.println("zu viele Versuche.");
                }
                
                i--;
            }
            
        }
        
    }
}