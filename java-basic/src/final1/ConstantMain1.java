package final1;

public class ConstantMain1 {
    private static final int MAX_COUNT = 1000;
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " + MAX_COUNT);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        if (currentUserCount > MAX_COUNT) {
            System.out.println("wait");
        } else {
            System.out.println("gogo");
        }
    }
}
