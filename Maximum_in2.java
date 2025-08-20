import java.util.Scanner;

public class Maximum_in2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The 1st Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter The 2nd Number: ");
        int num2 = sc.nextInt();
        if (num1>num2) {
            System.out.println("Number 1 is greater ");
        } 
        else {
            System.out.println("Number 2 is greater");
        }
        sc.close();
    }
}
