package hw_1508;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int fin = scanner.nextInt();


        if (start < 0) {      //If number <0 deleting '-'
            start -= start * 2;
        }
        else if (start == 0) {
            start++;
        }

        if (fin < 0) {      //If number <0 deleting '-'
            fin -= fin * 2;
        }
        else if (fin == 0) {
            fin++;
        }


        if (start > fin) {
            int num=start;
            start = fin;
            fin = num;
        }


        for (int i = start; i <= fin; i++) {
           for (int j=1; j<=10; j++) {
               System.out.print(i + "*" + j + "=" + i*j + ' ');
           }
           System.out.println("\n-----------------------------------------\n");
        }
    }
}