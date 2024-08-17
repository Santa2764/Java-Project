package hw_1508;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("num: ");
        float num = scanner.nextFloat();

        System.out.println("per: ");
        float per = scanner.nextFloat();

        float perOfNum=per/100*num;
        System.out.println(per + "% of " + num + " = " + perOfNum);

    }
}
