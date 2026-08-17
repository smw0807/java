package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "Hello Java";
        String deco = DecoUtil2.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);

        String s2 = "JAVA";
        String deco2 = DecoUtil2.deco(s2);
        System.out.println("before: " + s2);
        System.out.println("after: " + deco2);
    }
}
