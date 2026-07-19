package array;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] arr = {90, 80, 70, 60, 50};

        int total = 0;
//        for (int i = 0; i < arr.length; i++) {
//            total += arr[i];
//        }
        for(int num : arr) {
            total += num;
        }

        double avg = (double) total / arr.length;

        System.out.println("점수 총합 : " + total);
        System.out.println("점수 평균 : " + avg);

    }
}
