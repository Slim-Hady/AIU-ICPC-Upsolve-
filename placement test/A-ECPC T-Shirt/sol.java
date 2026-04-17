import java.util.*;
public class Main {
    public static void main(String[]args){
      
        Scanner scanner = new Scanner(System.in);
      
        String s = scanner.next();
      
        if(s.equals("Red")) System.out.println("Contestant");
        if(s.equals("Green")) System.out.println("Coach");
        if(s.equals("Blue")) System.out.println("Judge");
      
    }
}
