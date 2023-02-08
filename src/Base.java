import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius, length, baseArea, PI, volume;
        PI = 3.1416;
        System.out.println("Enter the radius of the cylinder: ");
        radius = sc.nextDouble();
        System.out.println("Enter the length of the cylinder: ");
        length = sc.nextDouble();
        baseArea = PI * radius * radius;
        volume = baseArea * length;
        System.out.println("The base area of the cylinder is: " + baseArea);
        System.out.println("The volume of the cylinder is: " + volume);
    }
}
