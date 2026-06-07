package array;

public class counteven {
    public static void main(String[] args) {
        int a1[] = new int[6];
        a1[0] = 26;
        a1[1] = 34;
        a1[2] = 35;
        a1[3] = 24;
        a1[4] = 56;
        a1[5] = 88;
        int count = 0;
        int target = 24;
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
            if (a1[i] % 2 == 0) {// tofind the even number
                count = count++;
                if (a1[i] == target) {
                    System.out.println("The target value is found in the array");
                }
            }
        }
        System.out.println("The even number are----" + count);
    }
}
