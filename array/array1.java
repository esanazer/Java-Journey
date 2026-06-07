package array;

public class array1 {
    public static void main(String[] args) {

        int[] a1 = new int[5];// Declaration of an array
        int[] a2 = { 10, 20, 30, 40, 50 };// Declaration and initialization of an array
        a1[0] = 31;
        a1[1] = 21;
        a1[2] = 11;
        a1[3] = 41;
        a1[4] = 63;
        int sum1 = 0;
        int max = a1[0];
        for (int i = 0; i < a1.length; i++) {

            System.out.println(a1[i]);
            sum1 = sum1 + a1[i];
            if (a1[i] > max) {
                max = a1[i];
            }
            System.out.println("The maximum value in the array1 is " + max);
        }
        System.out.println("The sum of the array1 is  " + sum1);
        int sum = 0;
        int min = a2[0];
        for (int j = 0; j < a2.length; j++) {
            System.out.println(a2[j]);
            sum = sum + a2[j];
            if (min > a2[j]) {
                min = a2[j];
            }
        }
        System.out.println("The sum of the array is " + sum);
        System.out.println("The minimum value in the array2 is " + min);
    }

}
