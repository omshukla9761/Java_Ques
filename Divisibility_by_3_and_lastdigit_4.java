import java.util.Scanner;
public class Divisibility_by_3_and_lastdigit_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number to check both divisibility by 3 and lastdigit is 4 : ");
        int num = sc.nextInt();
        if (num % 3 == 0 || num % 10 == 4) {
            System.out.println("The number is divisible by 3 and last digit is 4. ");
            if (num % 3 != 0 || num % 10 == 4) {
                System.out.println("The number is not divisible by 3 but last digit is 4. ");
                if (num % 3 == 0 || num % 10 != 4) {
                    System.out.println("The number is divisible by 3 but last digit is not 4.");
                }
            }
            
        } 
        else {
            System.out.println("NOT DIVISIBLE BY 3 AND LAST DIGIT IS NOT 4");
             }
        sc.close();
    }
}
