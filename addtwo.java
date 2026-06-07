import java.util.Scanner;

public class addtwo {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = Sc.nextInt();
        System.out.println("enter the secound numner");
        int num2 = Sc.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum of the two number are  " + sum);
    }

}