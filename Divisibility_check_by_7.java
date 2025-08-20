import java.util.Scanner;

public class Divisibility_check_by_7 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the to check the divisibility by 7: ");
        int num = sc.nextInt();
    // 1st METHOD (By using if else method)

        // if (num % 7 == 0) {
        //     System.out.println("Yes The Number is Completely Divisible By 7.");
        // } else {
        //     System.out.println("No !, The Number is Not Divisible By 7.");
        // }
        
    // 2nd METHOD (By using ternary operator)
        String result = (num % 7 == 0) ?"Yes The Number Is Completely Divisible By 7":"No !, The Number is Not Divisible By 7" ;
        System.out.println(result);
        sc.close();
    }
}
