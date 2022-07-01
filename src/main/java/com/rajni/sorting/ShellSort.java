package com.rajni.sorting;

public class ShellSort implements IntegerSort {

    public static void main(String[] args) {
        ShellSort sort = new ShellSort();
        SortingUtils.sortTest(new int[]{1, 3, 5, 77, 33, 11}, sort);
    }

    @Override
    public void sort(int[] array) {
        // create a gap value - for each gap values compare them
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            // 1, 3, 5, 77, 33, 11 -> for this array, 77 will be compared with array[index - gap]
            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];
                int j = i;
                while (j > gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j = j - gap;
                }
                array[j] = newElement;
            }
        }
    }

}
