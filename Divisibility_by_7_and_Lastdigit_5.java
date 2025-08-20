// WAP to check if the number is divisible by 7 or if the last digit is 5.

import java.util.Scanner;

public class Divisibility_by_7_and_Lastdigit_5 {

       public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number to check both divisibility by 7 and lastdigit is 5 : ");
        int num = sc.nextInt();
        if (num % 7 == 0 || num % 10 == 5) {
            System.out.println("The number is divisible by 7 and last digit is 5. ");
            if (num % 7 != 0 || num % 10 == 5) {
                System.out.println("The number is not divisible by 7 but last digit is 5. ");
                if (num % 7 == 0 || num % 10 != 5) {
                    System.out.println("The number is divisible by 7 but last digit is not 5.");
                }
            }
            
        } 
        else {
            System.out.println("NOT DIVISIBLE BY 7 AND LAST DIGIT IS NOT 5");
             }
        sc.close();
    }
}
