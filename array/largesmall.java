package array;

public class largesmall {
    public static void main(String[] args) {

        int[] ar1 = { 32, 43, 56, 76, 43, 23 };

        int large = ar1[0];
        int small = ar1[0];
        int sum = 0;
        int evcount = 0;
        int oddcount = 0;

        int target = 43;
        int lastindex = -1;

        // Find largest, smallest, sum, even count, odd count
        for (int i = 0; i < ar1.length; i++) {

            System.out.println(ar1[i]);

            if (ar1[i] > large) {
                large = ar1[i];
            }

            if (ar1[i] < small) {
                small = ar1[i];
            }

            sum = sum + ar1[i];

            if (ar1[i] % 2 == 0) {
                evcount++;
            } else {
                oddcount++;
            }
        }

        // Find first occurrence
        for (int j = 0; j < ar1.length; j++) {
            if (ar1[j] == target) {
                System.out.println("The first occurrence is -- " + j);
                break;
            }
        }

        // Find last occurrence
        for (int j = 0; j < ar1.length; j++) {// last occurence
            if (ar1[j] == target) {
                lastindex = j;
            }
        }

        System.out.println("The largest element is - " + large);
        System.out.println("The smallest element is - " + small);
        System.out.println("The sum of the array elements is - " + sum);
        System.out.println("The even count is - " + evcount);
        System.out.println("The odd count is - " + oddcount);
        System.out.println("The last occurrence index is - " + lastindex);
    }
}