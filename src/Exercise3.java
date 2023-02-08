/**
 * @class: Exercise3
 * @author: yousra bibi
 * @course: ITEC 2140 -05, 2023
 * @version: 1.0
 * @date: 02/07/2023
 * @description: this program will calculate how many gallons and quarts of paint is needed to paint a room
 */

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the room: ");
        int length = sc.nextInt();
        System.out.println("Enter the width of the room: ");
        int width = sc.nextInt();
        System.out.println("Enter the height of the room: ");
        int height = sc.nextInt();

        System.out.println("Enter the number of windows: ");
        int windows = sc.nextInt();
        System.out.println("Enter the number of doors: ");
        int doors = sc.nextInt();

        double totalArea = (length * height * width) * 2 + length * width - windows *
                15 - doors;
        System.out.println("The area is " + totalArea);
        double quarts = 4.0 *totalArea /350.0;

        System.out.println(quarts + "quarts needed");

        int gallons = 0;
        while (quarts >= 4){
            gallons++;
            quarts -= 4;
        }
        System.out.println(gallons + "gallons and " + quarts + "quarts of paint is needed to paint the room.");
    }

}
