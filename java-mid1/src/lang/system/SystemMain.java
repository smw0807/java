package lang.system;

import java.util.Arrays;
import java.util.Map;

public class SystemMain {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("Current time is " + currentTimeMillis);

        long currentNanoTime = System.nanoTime();
        System.out.println("Current nanoTime is " + currentNanoTime);

        // 환경 변수
        Map<String, String> getenv = System.getenv();
        System.out.println("getenv is " + getenv);
        for(String name : getenv.keySet()) {
            System.out.println(name + " : " + getenv.get(name));
        }

        System.out.println("properties = " + System.getProperties());

        // 배열을 고속으로 복사한다.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        System.out.println("original array is " + Arrays.toString(originalArray));
        System.out.println("copied array is " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0);
    }
}
