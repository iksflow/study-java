package training.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortReferenceArrayExample {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 5, 3, 4};
        Arrays.sort(arr);
        for (Integer num : arr) {
            System.out.println(num);
        }
        Collections.reverseOrder();
        Arrays.sort(arr, Comparator.reverseOrder());
        for (Integer num : arr) {
            System.out.println(num);
        }

    }
}
