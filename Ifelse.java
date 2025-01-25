import java.util.Scanner;  

public class Ifelse {

    public static void main (String[] args){

        try (Scanner scn = new Scanner(System.in)) {
            System.out.print("enter a number ");
            int n = scn.nextInt();


            if (n%2 == 0) {
                System.out.print("it is a even number");
                
            }else{
                System.out.print("it is a odd number");
            }
        }
    }
    
}
