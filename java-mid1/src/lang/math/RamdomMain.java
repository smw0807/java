package lang.math;

import java.util.Random;

public class RamdomMain {
    public static void main(String[] args) {
        Random random = new Random();
//        Random random = new Random(2); // seed가 같으면 random의 결과가 같다.

        int randomInt = random.nextInt();
        System.out.println("randomInt: " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble: " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean: " + randomBoolean);

        // 범위로 조회
        int randomRange1 = random.nextInt(10);
        System.out.println("0 ~ 9: " + randomRange1);

        int randomRange2 = random.nextInt(5, 10);
        System.out.println("5 ~ 10: " + randomRange2);
    }
}
