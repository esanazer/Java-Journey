package method;

public class addtwo1 {
    static int add(int a, int b) {// method declaration
        return a + b;
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int result = add(a, b);// calling-the-method
        System.out.println(result);
    }
}
