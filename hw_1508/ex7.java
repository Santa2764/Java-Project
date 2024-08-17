package hw_1508;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int fin = scanner.nextInt();

        if (start > fin) {
            int num=start;
            start = fin;
            fin = num;
        }

        for (int i = start; i <= fin; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
