
import java.util.Scanner;
public class Table {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();

     for (int i = 1; i < 11; i++) {
        System.out.println(n + "  X  "+  i  + " = " +(n*i));
        
    }
}
}