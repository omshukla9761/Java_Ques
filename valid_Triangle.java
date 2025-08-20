/* 
   You are given 3 integer angles(in degrees), A, B, and C, of a triangle. You have to tell 
   whether the triangle is valid or not. A triangle is valid if the sum of its angles equals 
   180
*/
import java.util.Scanner;

public class valid_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Angle First is : ");
        int Angle_1 = sc.nextInt();
        System.out.print("Angle Second is : ");
        int Angle_2 = sc.nextInt();
        System.out.print("Angle Third is : ");
        int Angle_3 = sc.nextInt();
        int Perfect_triangle = Angle_1 + Angle_2 + Angle_3;
        if (Perfect_triangle == 180) {
            System.out.println("The Given Angle Justifies that it is a perfect triangle. ");
        }
        sc.close();
    }
}
