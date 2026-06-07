import java.util.Scanner;

public class findlarge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the firdt number");
        int a = sc.nextInt();
        System.out.println("Enter the secound number");
        int b = sc.nextInt();
        if (a < b) {
            System.out.println("The largest number is  " + b);
        } else {
            System.out.println("the largest number is  " + a);
        }
        if (a == b) {
            System.out.println("both the number are same");
        }
        // To cheackthe number is positive or negative
        if (a % 2 == 0) {
            System.out.println("the number " + a + " is even");
        } else {
            System.out.println("the number " + a + " is odd");
        }
        if (b % 2 == 0) {
            System.out.println("the number " + b + " is even");
        } else {
            System.out.println("the number " + b + " is odd");
        }

    }
}
