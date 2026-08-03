package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "student1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "student2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("name: " + student1.name + " age: " + student1.age + " grade: " + student1.grade);
        System.out.println("name: " + student2.name + " age: " + student2.age + " grade: " + student2.grade);
    }
}
