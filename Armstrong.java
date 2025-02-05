import java.util.Scanner;

public class Armstrong{
    
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in); 
     
       System.out.println("Enter a number");
       int number = scn.nextInt();
       scn.close();

  if (isArmstrong(number)) {
       System.out.println(number + " is  an  armstrong number");
  
   }else{
  System.out.println(number + " is not an armstrong number");
   
  
  }
   
}
        public static boolean isArmstrong(int num){
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
    
    while(num > 0){
        int digit  = num % 10;
        sum += Math.pow(digit ,digits);
        num /= 10;
        }
    return sum == originalNum;
 }
}