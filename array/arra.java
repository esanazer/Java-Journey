package array;

public class arra {
    public static void main(String[] args) {
        int[] a1 = new int[5];
        a1[0] = 01;
        a1[1] = 02;
        a1[2] = 03;
        a1[3] = 04;
        a1[4] = 05;

        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }

        int[] a2 = { 10, 20, 30, 40, 50 };

        for (int j = 0; j < a2.length; j++) {
            System.out.println(a2[j]);
        }
    }
}