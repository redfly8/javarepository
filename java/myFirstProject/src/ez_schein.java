public class ez_schein {
    public static void main(String[] args) {
        

           
            
                System.out.println("Lieferschein");
                line(10, '.');
                System.out.println("Artikel 1		          15.90");
                System.out.println("Artikel 2		          21.90");
                System.out.println("Artikel 3		          32.50");
                line(10, '.');
                System.out.println("Preis total		          " + summe(15.90, 21.90, 32.50));
                line(10, '=');
            
        
        
        
    }
    public static void line (int length, char zeichen) {
        for(int i = 0 ; i < length; i ++){
            System.out.print(zeichen);
        }
        System.out.println("");
    }
    public static double summe (double a, double b, double c){
        double out = a + b + c;
        return out;
    }

}
