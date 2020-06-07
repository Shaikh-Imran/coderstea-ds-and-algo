package com.coderstea.dsandalgo.sorting;

public class InsertionSortAlgo implements SortAlgo {

    @Override
    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currValue = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > currValue) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = currValue;
        }
        return arr;
    }
}
