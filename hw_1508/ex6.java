package hw_1508;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int metres = 0;
        double miles = 0.000621;
        double inches = 39.7401;
        double yards = 1.0936;


        do {
            metres = scanner.nextInt();
            if (metres < 0) {
                System.out.println("Wrong!");
            }
            else if (metres == 0) {     //Exit if 0 meters
                System.out.println("Exit");
                return;
            }
        } while (metres <= 0);

        while (true) {
            System.out.println("to miles (m)\n" +
                    "to inches (i)\n" +
                    "to yardes (y)\n" +
                    "Exit (e)");
            char choise = scanner.next().charAt(0);

            switch (choise) {
                case 'm':
                    System.out.println(metres + "m == " + metres*miles + "mi");
                    break;
                case 'i':
                    System.out.println(metres + "m == " + metres*inches + "in");
                    break;
                case 'y':
                    System.out.println(metres + "m == " + metres*yards + "ya");
                    break;
                case 'e':
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Wrong!");
            }
        }
    }
}
