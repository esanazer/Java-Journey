import java.util.Scanner;

public class esa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int mul = 0;
        for (int i = 1; i <= num; i++) {
            mul = num * i;
            System.out.println(mul + "*" + i + "=" + mul);
        }
    }
}