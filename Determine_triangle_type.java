/*
   Read three angles of triangles and determine their types(Right triangle, Obtuse 
   triangle, Acute triangle). 
*/ 
import java.util.Scanner;

public class Determine_triangle_type {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Angle First is : ");
        int Angle_1 = sc.nextInt();
        System.out.print("Angle Second is : ");
        int Angle_2 = sc.nextInt();
        System.out.print("Angle Third is : ");
        int Angle_3 = sc.nextInt();
        int Acute = Angle_1 + Angle_2 + Angle_3;
        if (Angle_1 == 90 || Angle_2==90 || Angle_3 == 90) {
            System.out.println("The Given Angle Justyfies That It Is RIGHT TRIANGLE. ");
        }
        else if (Angle_1 > 90 && Angle_1 < 180 || Angle_2 > 90 && Angle_2 < 180 ||Angle_3 > 90 && Angle_3 < 180){
            System.out.println("The Given Angle Justyfies That It Is OBTUSE TRIANGLE.");
        }
        else if (Angle_1 < 90 && Angle_2 < 90 && Angle_3 < 90 && Acute <180 ){
            System.out.println("The Given Angle Justyfies That It Is ACUTE TRIANGLE.");
        }
        else {System.out.println("Not a Right ,Obtuse,Acute Triangle");}
        sc.close();

    }
}
