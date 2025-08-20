import java.util.Scanner;

public class Maximum_in_3_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The 1st Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter The 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter The 3rd Number: ");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("Num1 is greater.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Num2 is greater ");
        }

        else {
            System.out.println("Num3 is greater ");
        }
        sc.close();
    }

}
