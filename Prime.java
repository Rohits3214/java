
import java.util.Scanner;


public class Prime {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        scn.close();

        if (isprime(n)) {
            System.out.println(n + "is a prime number");
            
        }else{
            System.out.println(n + "is not a prime number");
        }
    }
    
    public static boolean isprime(int num){
        if (num <= 1) {

            return false;
            
        }
        for(int i =2; i<= num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
