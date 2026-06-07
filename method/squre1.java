package method;

import java.util.Scanner;

public class squre1 {

    static int squr(int num) {
        return num * num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find its square");

        int num = sc.nextInt();

        int result = squr(num);

        System.out.println("The square of the number " + num + " is " + result);

        sc.close();
    }
}