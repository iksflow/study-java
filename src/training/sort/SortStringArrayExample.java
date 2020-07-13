package training.sort;

import java.util.Arrays;

public class SortStringArrayExample {
    public static void main(String[] args) {
        String[] arr = {"Alfa", "Bravo", "Echo", "Foxtrot", "Charlie", "Delta"};
        Arrays.sort(arr);
        for (String code : arr) {
            System.out.println(code);
        }
    }
}
