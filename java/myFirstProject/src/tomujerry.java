import java.util.Scanner;
public class tomujerry {

    public static void main(String[] args)  {
        String x;
        Scanner eingabe = new Scanner(System.in);
       
        String a;
        String b;
        a = eingabe.next();  
        b = eingabe.next(); 
        System.out.println(a + " und " +b);
        String help_a;
        help_a = a;
        a = b;
        b = help_a;
        System.out.println(a + " und " +b);
        
    }
}
