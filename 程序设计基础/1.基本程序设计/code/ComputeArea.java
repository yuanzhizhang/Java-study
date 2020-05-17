import java.util.*;
public class ComputeArea{
    public static void main(String[] args) {
        double radius;
        double area;
        final double PI = 3.14159;
        
        Scanner input = new Scanner(System.in);
        
        radius = input.nextDouble();
        area = Math.pow(radius,2) * PI;
        
        System.out.print("The area for the circle of radius " + radius + " is " + area);
    }
}