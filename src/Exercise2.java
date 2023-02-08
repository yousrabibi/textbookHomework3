/**
 * @class: Exercise3
 * @author: yousra bibi
 * @course: ITEC 2140 -05, 2023
 * @version: 1.0
 * @date: 02/07/2023
 * @description: this program will calculate how many hours, minutes and seconds are totalSeconds
 */
import java.util.Scanner;

public class Exercise2 {
//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total amount of seconds: ");
        int seconds = sc.nextInt();
        int totalSeconds = seconds % 60;
        int hours = seconds / 60;
        int minutes = hours % 60;
        hours = hours / 60;
        System.out.println(seconds + "seconds have " + hours + "hours" + minutes + "minutes and " + totalSeconds + "seconds.");
    }

}
