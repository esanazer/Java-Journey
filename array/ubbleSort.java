package array;

public class ubbleSort {
    public static void main(String[] args) {

        int[] bub = { 23, 45, 67, 76, 54, 34, 56 };

        System.out.println("Before Sorting:");

        for (int i = 0; i < bub.length; i++) {
            System.out.print(bub[i] + " ");
        }

        for (int j = 0; j < bub.length - 1; j++) {
            for (int k = 0; k < bub.length - 1 - j; k++) {

                if (bub[k] > bub[k + 1]) {

                    int temp = bub[k];
                    bub[k] = bub[k + 1];
                    bub[k + 1] = temp;
                }
            }
        }

        System.out.println("\nAfter Sorting:");

        for (int m = 0; m < bub.length; m++) {
            System.out.print(bub[m] + " ");
        }
    }
}