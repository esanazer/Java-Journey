import java.util.Arrays;

public class Sortarray {
    public static void main(String[] args) {

        int[] ar1 = { 23, 45, 67, 54, 34, 34 };

        Arrays.sort(ar1);

        for (int i = 0; i < ar1.length; i++) {
            System.out.println(ar1[i]);
        }
    }
}