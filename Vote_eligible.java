import java.util.Scanner;
public class Vote_eligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int Age = sc.nextInt();
        if (Age<18) {
            System.out.println("Sorry! You are not eligible to vote.");
        } else {
            System.out.println("You eligible to vote ");
        }
        sc.close();
    }
}
