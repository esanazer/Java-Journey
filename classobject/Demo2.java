class student {
    String Name;
    int mark;
}

public class Demo2 {
    public static void main(String[] args) {

        student s1 = new student();
        student s2 = new student();
        student s3 = new student();

        s1.Name = "ESA";
        s1.mark = 99;

        s2.Name = "rahul";
        s2.mark = 55;

        s3.Name = "asi";
        s3.mark = 65;

        student[] v1 = { s1, s2, s3 };

        // Display all students
        System.out.println(v1[0].Name);
        System.out.println(v1[0].mark);

        System.out.println(v1[1].Name);
        System.out.println(v1[1].mark);

        System.out.println(v1[2].Name);
        System.out.println(v1[2].mark);

        // Find highest mark
        student top = v1[0];

        for (int i = 1; i < v1.length; i++) {
            if (v1[i].mark > top.mark) {
                top = v1[i];
            }
        }

        System.out.println("The highest mark is - " + top.mark);
        System.out.println("Top student is - " + top.Name);
    }
}