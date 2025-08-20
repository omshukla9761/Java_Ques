import java.util.Scanner;

public class Leap_year_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("The year is a LEAP YEAR");
        } else {
            System.out.println("The year is not a LEAP YEAR");
        }
        sc.close();
    }
}
