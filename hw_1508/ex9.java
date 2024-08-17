package hw_1508;

import java.util.Random;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int[] arr = new int[10];
        int maxId=0;
        int minId=0;
        int neg=0;
        int pos=0;
        int zero=0;


        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(-100,100);
            System.out.print(arr[i] + "  ");


            if(arr[i]>arr[maxId]) {     //collecting max and min num's id
                maxId = i;
            }
            if(arr[i]<arr[minId]) {
                minId = i;
            }

            if(arr[i]==0) {
                zero++;
            } else if (arr[i]<0) {
                neg++;
            } else {
                pos++;
            }
        }


        System.out.println("\nmax: " + arr[maxId] +
                "\nmin: " + arr[minId] +
                "\nneg: " + neg +
                "\npos: " + pos +
                "\nzeros: " + zero);
    }
}
