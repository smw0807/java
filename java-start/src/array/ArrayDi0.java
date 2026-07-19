package array;

public class ArrayDi0 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = i + j;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j] + " ");
            }
        }

    }
}
