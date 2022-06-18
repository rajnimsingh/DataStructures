package com.rajni.sorting;

public class SelectionSort implements IntegerSort {
    @Override
    public void sort(int[] array) {


        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int maximum = array[lastUnsortedIndex];
            int maximumIndex = lastUnsortedIndex;
            for (int j = 0 ; j < lastUnsortedIndex; j++) {
                if(array[j] > maximum) {
                    maximum = array[j];
                    maximumIndex = j;
                }
            }
            SortingUtils.swap(array, lastUnsortedIndex, maximumIndex);
        }
    }

    public static void main(String[] args) {
        int[] array =  {99, 88, 77, 66, 55, 44, 33, 22, 11};
        SelectionSort selectionSort = new SelectionSort();
        SortingUtils.sortTest(array, selectionSort);

        array =  new int[] {99, 88, 77, 66, 55, 44, 33, 22, 11, 101, 78, 65, -22};
        SortingUtils.sortTest(array, selectionSort);
    }
}
