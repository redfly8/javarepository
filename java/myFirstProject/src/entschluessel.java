import java.util.Scanner;
public class entschluessel {

    public static void main(String[] args)  {
        String x;
        System.out.println("bitte geben sie einen Buchstaben ein.");
        Scanner eingabe = new Scanner(System.in);
    
       

        int chiffSchluessel; //schlüssel

        
        x = eingabe.next();  
        System.out.println("nun, geben Sie den SchlÃ¼ssel ein.");
        chiffSchluessel = eingabe.nextInt(); 
        char buchstabe = x.charAt(0); //buchstabe zum entschlüsseln
        System.out.println(buchstabe + " mit dem SchlÃ¼ssel " +chiffSchluessel); 


        
        int buchstabe_ascii = (int) buchstabe;
        int buchstabe_ascii_chiff = buchstabe_ascii + chiffSchluessel;
        char buchstabe_chiff = (char) buchstabe_ascii_chiff;
        System.out.println("resultat ist " + buchstabe_chiff);

        //resultat ist Sommer.
        
        
       
        
        
    }
}
