package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hell", "java", "jvm", "sprint", "jpa"};
        int sum = 0;
        for (String str : arr) {
            System.out.println(str + ":" + str.length());
            sum += str.length();
        }
        System.out.println("sum:" + sum);
    }
}
