
import java.util.Scanner; 

public class Switch {
    public static void main ( String[] args){

         try (Scanner scn = new Scanner(System.in)) {
            int button = scn.nextInt();

             switch (button) {
                    case 1:System.out.println("hello");
                    break;
                    case 2:System.out.println("namaste");
                    break;
                    case 3: System.out.println("bonjour");
                    break;
                    default:System.out.println("invalid button");
                    break;
             }
        }
         


    }
}
