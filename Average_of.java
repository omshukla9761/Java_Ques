import java.util.Scanner;

public class Average_of {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the 3rd number: ");
        int num3 = sc.nextInt();
        System.out.print("Enter the 4rth number: ");
        int num4 = sc.nextInt();
        System.out.print("Enter the 5th number: ");
        int num5 = sc.nextInt();
        float Average = (num1+num2+num3+num4+num5)/5;
        System.out.println(Average);
        sc.close();
    }
}
