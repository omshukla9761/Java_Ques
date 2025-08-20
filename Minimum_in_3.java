import java.util.Scanner;
public class Minimum_in_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter The 1st Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter The 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter The 3rd Number: ");
        int num3 = sc.nextInt();
        if (num1 < num2 && num1 < num3) {
            System.out.println("Num1 is smaller.");
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("Num2 is smaller ");
        }

        else {
            System.out.println("Num3 is smaller ");
        }
        sc.close();
    }
}
