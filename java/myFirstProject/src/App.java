import java.util.Scanner;

public class App {
    public static void main(String[] args)  {


        Scanner input = new Scanner(System.in);
        System.out.print("Wie viele Karten wollen Sie?");
        int anzkart = input.nextInt();

        int [] karten = new int[anzkart];
        
        for (int i = 0; i < anzkart;i++) {
            int num = i + 1;
            System.out.print("geben Sie den Wert für Karte " + num + " ein.");
            karten[i] = input.nextInt();
        };

        for (int j = 0; j < anzkart; j++){
            System.out.println(karten[j]);

        }
        System.out.println("Wollen sie die Summe von allen Karten wissen? ja = 1, nein = 0");
        

        int option = input.nextInt();
        

        if(option == 1){
            int sum = 0;
            for(int f = 0; f < karten.length; f++){
                sum = sum + karten[f];

            }
            System.out.print(sum);
        }else{
            System.out.print("ok, abgebrochen");
        }


       
        

    }
}
