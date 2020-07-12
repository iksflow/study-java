package training.sort;

import java.util.Arrays;

public class ReverseSortArrayExample {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 3, 1};

        for (int num : reverseSort(arr)) {
            System.out.println(num);
        }
    }

    public static int[] reverseSort(int[] arr) {
        int[] reverseArr = new int[arr.length];
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            reverseArr[i] = arr[arr.length - i - 1];
        }

        return reverseArr;
    }

}
