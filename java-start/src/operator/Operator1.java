package operator;

public class Operator1 {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println("a + b = " + sum);

        int dff = a - b;
        System.out.println("a - b = " + dff);

        int multi = a * b;
        System.out.println("a * b = " + multi);

        int div  = a / b;
        System.out.println("a / b = " + div);

        double div2 = (double) a / b;
        System.out.println("a / b = " + div2);

        int mod  = a % b;
        System.out.println("a % b = " + mod);

    }
}
