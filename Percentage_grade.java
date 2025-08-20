/* 
    Accept the percentage from the user and display the grade according to the following 
    criteria. 
    ● 
    Below 25 – D 
    ● 
    25 to 45 – C 
    ● 
    45 to 65 – B 
    ● 
    65 to 85 – A 
    ● 
    Above 85 – A+ 
*/

import java.util.Scanner;

public class Percentage_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the percentage: ");
        float percentage = sc.nextFloat();
        if (percentage>86){
            System.out.println("A+");
            }
            else if (percentage>66) {
            System.out.println("A");
            }
            else if (percentage>46) {
            System.out.println("B");
            }
            else if (percentage>23) {
            System.out.println("C");
            }
            else {System.out.println("D");}
            sc.close();
    }
}
