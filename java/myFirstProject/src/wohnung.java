import java.util.Scanner;
public class wohnung {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("wie viele wohnungen wollen Sie pro Stockwerk?");
        int wohnung = input.nextInt();
        System.out.println("wie viele Stockwerke wollen Sie?");
        int stock = input.nextInt();
        for (int f = 0;f < stock; f++) {
            for (int j = 0;j<wohnung; j++) {
                System.out.print("#");
                
            }
            System.out.println();
            
        }

    }
    
}
