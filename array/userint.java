package array;

import java.util.Scanner;

public class userint {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int a1[] = new int[5];

            for (int i = 0; i < a1.length; i++) {

                System.out.println("Enter the value of the array");
                a1[i] = sc.nextInt();
            }
            for (int i = 0; i < a1.length; i++) {

                System.out.println(a1[i]);
                ;
            }
        }
    }
}
