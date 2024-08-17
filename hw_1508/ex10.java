package hw_1508;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int[] firstArr = new int[25];
        int[] evenArr = new int[25];
        int evenId = 0;
        int[] oddArr = new int[25];
        int oddId = 0;
        int[] negArr = new int[25];
        int negId = 0;
        int[] posArr = new int[25];
        int posId = 0;


        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = rand.nextInt(-100,100);
            System.out.print(firstArr[i] + "  ");

            if (firstArr[i] % 2 == 0) {
                evenArr[evenId] = firstArr[i];
                evenId++;
            } else {
                oddArr[oddId] = firstArr[i];
                oddId++;
            }

            if (firstArr[i] == 0) {
                continue;
            } else if (firstArr[i] < 0) {
                posArr[posId] = firstArr[i];
                posId++;
            } else {
                negArr[negId] = firstArr[i];
                negId++;
            }
        }


        System.out.println("\n--------------------------------\n");
        System.out.println("Sorted array: " + Arrays.toString(evenArr));
        System.out.println("\n--------------------------------\n");
        System.out.println("Sorted array: " + Arrays.toString(oddArr));
        System.out.println("\n--------------------------------\n");
        System.out.println("Sorted array: " + Arrays.toString(posArr));
        System.out.println("\n--------------------------------\n");
        System.out.println("Sorted array: " + Arrays.toString(negArr));
    }
}
