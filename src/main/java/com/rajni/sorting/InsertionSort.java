package com.rajni.sorting;

public class InsertionSort implements IntegerSort {

    public static void main(String[] args) {
        int[] array = {99, 88, 77, 66, 55, 44, 33, 22, 11};
        InsertionSort insertionSort = new InsertionSort();
        SortingUtils.sortTest(array, insertionSort);

        array = new int[]{99, 88, 77, 66, 55, 44, 33, 22, 11, 101, 78, 65, -22};
        SortingUtils.sortTest(array, insertionSort);
    }

    @Override
    public void sort(int[] array) {
        for (int lastSortedIndex = 1; lastSortedIndex < array.length; lastSortedIndex++) {
            // store the value in the variable.
            int value = array[lastSortedIndex];
            int j;
            for (j = lastSortedIndex; j > 0 && array[j - 1] > value; j--) {
                array[j] = array[j - 1];
            }
            array[j] = value;
        }
    }
}
