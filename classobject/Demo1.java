class student {
    String name;
    int age;
}

public class Demo1 {

    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();

        s1.name = "Esa";
        s1.age = 21;

        s2.name = "wave";
        s2.age = 24;

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s1.age);
        System.out.println(s2.age);
    }
}