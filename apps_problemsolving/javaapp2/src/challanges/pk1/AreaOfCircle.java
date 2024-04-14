/*
TODO:  Area Of Circle Java Program

A: is an area of a circle
π: is a constant, whose value is 3.1415 or 22/7.
r: is the radius of a circle
d: is the diameter of a circle
C: is the circumference of a circle

area = π × r^2
area = (π/4) × d^2
area = C^2 / 4π

circumference (C) = 2πr
*/

package challanges.pk1;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius, circumference, diameter, area;
        int option;
        System.out.println("1. If the radius is known");
        System.out.println("2. If the diameter is known");
        System.out.println("3. If the circumference is known");
        System.out.print("Enter your choice: ");
        option = input.nextInt();
        switch(option){
            case 1 -> {
                // area = π × r^2
                System.out.print("Enter the radius of the circle: ");
                radius = input.nextDouble();
                area = Math.PI * (radius * radius);
                System.out.print("The area of the circle is: " + area);
            }
            case 2 -> {
                // area = (π/4) × d^2
                System.out.print("Enter the diameter of the circle: ");
                diameter = input.nextDouble();
                area = (Math.PI * (diameter * diameter)) / 4d;
                System.out.print("The area of the circle is: " + area);
            }
            case 3 -> {
                // area = C^2 / 4π
                System.out.print("Enter the circumference of the circle: ");
                circumference = input.nextDouble();
                area = (circumference * circumference) / (4 * Math.PI);
                System.out.print("The area of the circle is: " + area);
            }
            default -> {
                System.out.println("invalid choice!");
            }
        }
    }
}






















