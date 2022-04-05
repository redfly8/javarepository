import java.util.Scanner;

public class bosspuzzle {

    public static void main(String[] args){
        Scanner eingabe = new Scanner(System.in);

		char [][] brett = new char [3][3];
	    int zug_zeile, zug_spalte, zeile_leer, spalte_leer;

	    zeile_leer = 0;
	    spalte_leer = 2;
	    zug_zeile = 0;
	    zug_spalte = 0;

	    brett [0][0]= '3';
	    brett [0][1]= '4';
	    brett [0][2]= ' ';
	    brett [1][0]= '7';
	    
	    brett [1][1]= '8';
	    brett [1][2]= '5';
	    brett [2][0]= '2';
	    brett [2][1]= '1';
	    brett [2][2]= '6';

	    System.out.println(" S 1 2 3");
	    System.out.println("Z -------");

	    for (int i=0; i<3; i++){
	    	// Zeilennummern mit index i + 1
	      System.out.print(i+1+"¦ ");
	          for (int j=0; j<3; j++){
	            System.out.print(brett[i][j]+" ");
	          }
	      //Leerzeichen zwischen den Array-Werten
	          System.out.println();		
	    }

	    while(zug_zeile != 9){
	    System.out.println("Welches Feld möchten Sie verschieben?");
	    System.out.print("Zeile (9 für Abbruch): ");

	    zug_zeile = eingabe.nextInt();
	 

	    System.out.print("Spalte: ");
	    zug_spalte = eingabe.nextInt();

	    brett[zeile_leer][spalte_leer] = brett[zug_zeile-1][zug_spalte-1];
	    brett[zug_zeile-1][zug_spalte-1] = ' ';

	    zeile_leer = zug_zeile-1;
	    spalte_leer = zug_spalte-1;

	    	for (int i=0; i<3; i++){
	    		System.out.print(i+1+"¦ ");
	    			for (int j=0; j<3; j++){
	    				System.out.print(brett[i][j]+" ");
	    			}
	    		System.out.println();
	    	}
	    }
        
    }
    
}