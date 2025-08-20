import java.util.Scanner;
public class Check_last_digit_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        // if (num % 10 == 4) {
        //     System.out.println("THE LAST DIGIT IS 4.");
        // }
        // else {System.out.println("THE LAST DIGIT IS NOT 4 .");
        // }
        
        String result = (num % 10 == 4)? "THE LAST DIGIT IS 4." : "THE LAST DIGIT IS NOT 4 .";
        System.out.println(result);
        sc.close();

    }
}