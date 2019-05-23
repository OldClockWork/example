package studio;

import java.util.Scanner;

public class FindCircleArea {

    public static void main(String[] args){

        double radius = 0.0;
        double area = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = sc.nextDouble();
        area =  3.14 * (radius *radius);
        System.out.println("The area of this circle is " + area);

    }
}
