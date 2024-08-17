package hw_1508;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        Integer[] arr = new Integer[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(-100, 100);
        }
        System.out.println("Original array: " + Arrays.toString(arr));


        System.out.print("Sort type (i/d): ");
        char choise = scanner.next().charAt(0);
        sort(choise, arr);
    }


    public static void sort(char sortType, Integer[] arr) {
        if (sortType == 'i') {
            Arrays.sort(arr);
        } else if (sortType == 'd') {
            Arrays.sort(arr, Collections.reverseOrder());
        } else {
            System.out.println("Invalid sort type!");
            return;
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
