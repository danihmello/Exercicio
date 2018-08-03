
import java.util.Scanner;

public class Visao {
    Scanner in = new Scanner(System.in);
    
    public int inInt(String s){
        System.out.print(s);
        int v = in.nextInt();
        in.nextLine();
        
        return v;
    }
    
    public double inDouble(String s){
        System.out.print(s);
        return in.nextDouble();
    }
    
    public void inString(String s){
        System.out.print(s);
    }
}
