package training.sort;

import java.util.Arrays;
import java.util.Collections;

public class ReverseSortStringArrayExample {
    public static void main(String[] args) {
        String[] arr = {"Alfa", "Bravo", "Echo", "Foxtrot", "Charlie", "Delta"};
        Arrays.sort(arr, Collections.reverseOrder());
        for (String code : arr) {
            System.out.println(code);
        }
    }
}
