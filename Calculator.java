
import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
    
    Scanner scn = new Scanner(System.in);

    int a =scn.nextInt();
    int b =scn.nextInt();
    int button =scn.nextInt();

    switch (button) {
        case 1:System.out.println(a + b);
            
            break;
        case 2: System.out.println(a - b);

        case 3:System.out.println(a * b);
            break;
        case 4 : System.out.println(a / b);
            break;
        case 5 : System.out.println( a % b);
        break;

    
        default:System.out.println("not valid character");
            break;
    }

}    
}
