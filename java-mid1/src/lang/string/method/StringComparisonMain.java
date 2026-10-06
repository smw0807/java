package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!";
        String str2 = "hello, java!";
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str equalsIgnoreCase str2: " + str2.equalsIgnoreCase(str2));

        System.out.println("'b' compareTo 'a': " + "b".compareTo("a"));
        System.out.println("'c' compareTo 'a': " + "c".compareTo("a"));
        System.out.println("'a' compareTo 'b': " + "a".compareTo("b"));
        System.out.println("'a' compareTo 'c': " + "a".compareTo("c"));

        System.out.println("srt1 compareTo srt3: " + str1.compareTo(str3));
        System.out.println("srt1 compareToIgnoreCase srt2: " + str1.compareToIgnoreCase(str2));

        System.out.println("str1 start with 'Hello': " + str1.startsWith("Hello"));
        System.out.println("str1 end with 'Java': " + str1.endsWith("Java!"));

    }
}
