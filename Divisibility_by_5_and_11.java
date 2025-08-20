/* 
   Take an integer A as input. You have to tell whether A is divisible by both 5 and 11 or 
   not. 
*/
import java.util.Scanner;
public class Divisibility_by_5_and_11 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int A = sc.nextInt();
        if (A % 5 == 0 || A % 11 == 0) {
            System.out.println("The number is divisible by both 5 and 11 ");
            if (A % 5 != 0 || A % 11 == 0) {
                System.out.println("The number is not divisible by 5 but divisible by 11. ");
                if (A % 5 == 0 || A % 11 != 0) {
                    System.out.println("The number is divisible by 5 but not divisible by 11 .");
                }
            }
            
        } 
        else {
            System.out.println("NOT DIVISIBLE BY 5 AND NOT DIVISIBLE BY 11");
             }
        sc.close();
    }
}
