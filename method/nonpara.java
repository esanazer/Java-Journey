package method;

import java.util.Scanner;

public class nonpara {
    static void Display() {// non-parameter-method-declaration-non-retun-valuse
        System.out.println("This is non parametered method");
    }

    static void greet(String name) {// method-with-parameter-non-return-valuse
        System.err.println("Hello " + name);
    }

    static int getnumber()// noparameter and nonretunvalue

    {
        return 10;
    }

    static int add(int a, int b) {// method-with-pararmeter-and-return-valuse
        return a + b;
    }

    static int qub(int num) {
        return num * num * num;
    }

    public static void main(String[] args) {
        Scanner yaa = new Scanner(System.in);
        greet("Esa");
        int a = 25;
        int b = 35;
        int result = add(a, b);
        System.out.println("the sum of the number is  " + result);
        int num = getnumber();
        System.out.println(num);
        System.out.println("enter the number to find the qube ");
        int s1 = yaa.nextInt();
        int esaa = qub(s1);
        System.out.println("The qube valuue of the " + s1 + " is " + esaa);
    }
}
