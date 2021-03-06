package training.sort;

import java.util.Arrays;

public class ReverseSortArrayExample {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 3, 1};

        reverseSort(arr);
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static void reverseSort(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}
