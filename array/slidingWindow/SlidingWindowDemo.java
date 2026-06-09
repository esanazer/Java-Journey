package array.slidingWindow;

public class SlidingWindowDemo {
    /**
     * @param args
     */
    public static void main(String[] args) {

        int[] arr = { 2, 4, 1, 6, 8 };
        int k = 3;

        int sum = 0;

        // Calculate first window sum
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        System.out.println("Maximum Sum = " + maxSum);
    }
}