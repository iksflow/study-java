package training.sort;

import java.util.Arrays;

public class SortArrayExample {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 3, 1};

        Arrays.sort(arr);

        for (int num : arr) {
            System.out.println(num);
        }

    }
}
