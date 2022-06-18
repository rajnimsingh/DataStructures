package com.rajni.sorting;

import java.util.Arrays;

public class SortingUtils {

    public static void swap(int[] array, int indexOne, int indexTwo) {
        if( indexOne == indexTwo ) {
            return;
        }
        if (array.length > 1 && indexOne >= 0 && indexTwo >= 0 && indexOne < array.length && indexTwo < array.length) {
            int temp = array[indexOne];
            array[indexOne] = array[indexTwo];
            array[indexTwo] = temp;
        }
    }

    public static void sortTest(int[] array, IntegerSort sorter) {
        sorter.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
