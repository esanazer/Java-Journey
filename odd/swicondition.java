package odd;

import java.util.Scanner;

public class swicondition {
    public static void main(String[] args) {
        int[] arr3 = new int[5];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the 5 element for the array");
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = s1.nextInt();
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        System.err.println("1.Travers");
        System.out.println("2.Search");
        System.out.println("3.Largest");
        int choice = s1.nextInt();
        int large = arr3[0];
        switch (choice) {
            case 1:
                for (int j = 0; j < arr3.length; j++) {
                    System.out.print("==" + arr3[j]);
                }
                break;
            case 2:
                System.out.println("Enter the target elemrnt");
                int target = s1.nextInt();
                for (int j = 0; j < arr3.length; j++) {
                    if (target == arr3[j]) {
                        System.out.println("target found TArget= " + arr3[j]);
                    }
                    break;
                }
            case 3:
                for (int k = 0; k < arr3.length; k++) {
                    if (arr3[k] > large) {
                        large = arr3[k];
                    }
                    break;
                }
                System.out.println("largest element is  " + large);
            default:
                System.out.println("invalid choice");
                break;

        }
    }
}
