package loop;

public class Countinue1 {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i == 10) continue;
            System.out.println("Hello World " + i);
            i++;
        }
    }
}
