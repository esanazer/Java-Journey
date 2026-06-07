package array;

public class arrat2 {

    public static void main(String[] args) {

        int[] a1 = { 1, 2, 33, 44, 5, 66, 4, 35, 90, 98 };

        int c = a1.length;
        System.out.println("The length of the array is " + c);

        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + "-");
        }

        System.out.println();

        int[] a2 = { 10, 7, 5, 44, 5, 67, 87, 34, 23, 90 };

        for (int j = 0; j < a2.length; j++) {
            System.out.println(a2[j]);
        }

        int max = findmax(a1);
        System.out.println("The maximum element in a1 is: " + max);

        int min = findmin(a1);
        System.out.println("The minimum element in a1 is: " + min);

        int sum = findsum(a1);
        System.out.println("The sum of elements in a1 is: " + sum);

        int max2 = findmax(a2);
        System.out.println("The maximum element in a2 is: " + max2);

        int min2 = findmin(a2);
        System.out.println("The minimum element in a2 is: " + min2);

        int sum2 = findsum(a2);
        System.out.println("The sum of elements in a2 is: " + sum2);
    }

    public static int findmax(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int findmin(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static int findsum(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }
}