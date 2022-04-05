import terminal.VT;
import terminal.VTerm;

public class Pandemie {
    // globale Matrix für das Speichern der Population
    static int[][] population = new int[21][51];
    static VTerm console = VTerm.getInstance(25, 80, "Pandemie", VT.CS_TINY);

    public static void main(String[] args) {
        int i, j; // Laufvariablen für die Schleifen
        // Die Werte im Array population werden auf 0 gesetzt
        for (i = 0; i< 21; i++) {
            for (j = 0; j< 51; j++) {
                population[i][j] = 0;
            }
        }

        // Ausgabe im Fenster von console (Typ VTerm)
        for (i = 0; i< 21; i++) {
            for (j = 0; j< 51; j++) {
                if (population[i][j] >0) {
                    console.print("" + population[i][j]);
                } else {
                    console.print(' ');
                }
            }
            console.println();
        }

        console.delay(500); // Warten für 500 Millisekunden
        // erste Person soll angesteckt werden
        population[10][15] = 1;

        for (int tage = 0; tage< 10; tage++) {
            for (i = 1; i< 20; i++) {
                for (j = 1; j< 50; j++) {
                    // Berechnung der Ansteckung
                    population[i][j] = 1;
                }
            }

            console.clearScreen(); // Löschen des Inhalts von console
            console.println("Tag " + tage);

            // Ausgabe im Fenster von console (Typ VTerm)
            for (i = 0; i< 21; i++) {
                for (j = 0; j< 51; j++) {
                    if (population[i][j] >0) {
                        console.print("" + population[i][j]);
                    } else {
                        console.print(' ');
                    }
                }
                console.println();
            }
            console.delay(500);
        }

        // schliessen der Konsole mit Enter
        console.readyToExit(true);
    }

    /* Hinzufügen der neuen Methoden */

}