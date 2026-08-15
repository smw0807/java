package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
        // this() 는 첫 줄에 작성해야지만 정상작동됨
        this(name, age, 50);
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + " age=" + age + " grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
