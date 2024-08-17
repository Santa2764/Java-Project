package hw_1508;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = 0;

        do {    //for not to run again after every entered month
            month = scanner.nextInt();
            if (month == 1 || month == 2 || month == 12) {
                System.out.println("Winter");
            }
            else if (month >= 3 && month <= 5) {
                System.out.println("Spring");
            }
            else if (month >= 6 && month <= 8) {
                System.out.println("Summer");
            }
            else if (month >= 9 && month <= 11) {
                System.out.println("Autumn");
            }
            else if (month == 0) {
                System.out.println("Exit");
            }
            else {
                System.out.println("Invalid month");
            }
        } while (month != 0);   //Exit from while if month == 0
    }
}
