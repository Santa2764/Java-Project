package hw_1508;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int firstNum=0;
        String secondNum="";

        while(firstNum==0) {
            firstNum=scanner.nextInt();

            if (firstNum/100000<1 || firstNum/100000>9) {
                System.out.println("Wrong!");
                firstNum=0;
            }
            System.out.println(firstNum);
        }

        for (int i=firstNum; i>0; i/=10) {
            secondNum+=i%10+"";
        }

        System.out.println(secondNum);

    }
}
