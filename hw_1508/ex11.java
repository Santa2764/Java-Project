package hw_1508;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Symbol: ");
        char symbol = scanner.next().charAt(0);
        System.out.print("Direction (h/v): ");
        char direction = scanner.next().charAt(0);
        System.out.print("Length: ");
        int length = scanner.nextInt();

        line(symbol, direction, length);
    }



    public static void line(char symb, char dir, int length) {
        for (int i = 0; i < length; i++) {
            if (dir == 'v') {
                System.out.println(symb);
            } else if (dir == 'h') {
                System.out.print(symb);
            } else {
                System.out.println("Wrong direction!");
            }
        }
        return;
    }
}
