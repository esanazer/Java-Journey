package method;

public class nonstatic {
    void display() {// craetion of non-static method

        System.out.println("This is non static method");
    }

    public static void main(String[] args) {
        nonstatic s1 = new nonstatic();// create-object-for-non-static-method
        s1.display();// calling-of-function-using-object name s1
    }
}
gi