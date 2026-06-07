import java.util.Scanner;

public class sumofnumbers {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            sum = sum + i;
            System.out.println("the sum of first " + i + " numbers is  " + sum);
        }
        System.out.println("The sum of the total number is " + sum);
    }
}
