package hw_1508;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String totalNum="";

        for (int i=0; i<3; i++) {

            int num = scanner.nextInt();
            if (num<0 || num>9 || (i==0 && num==0)) {
                System.out.println("Wrong!");
                i--;
            }
            else {
                totalNum+=num+"";
            }

        }

        System.out.println("Total num = " + totalNum);

    }
}
