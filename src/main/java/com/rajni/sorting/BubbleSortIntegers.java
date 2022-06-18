package com.rajni.sorting;

import java.util.Arrays;

public class BubbleSortIntegers implements IntegerSort {

    @Override
    public void sort(int[] array) {
        int unsortedPartitionIndex = 0;
        for (int i = unsortedPartitionIndex; i < array.length; i++) {
            int sortedPartition = (array.length - 1) - unsortedPartitionIndex;
            for (int j = 0; j < sortedPartition; j++) {
                if(array[j] > array[j + 1]) {
                    SortingUtils.swap(array, j, j + 1);
                }
            }
            unsortedPartitionIndex++;
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 7, 9, 11, 8, 10, 25, 66, 6, 4};
        BubbleSortIntegers bubbleSortIntegers = new BubbleSortIntegers();
        SortingUtils.sortTest(array, bubbleSortIntegers);
    }
}
