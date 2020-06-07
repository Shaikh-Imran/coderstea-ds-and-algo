package com.coderstea.dsandalgo.sorting;

public class QuickSortAlgo implements SortAlgo {

    @Override
    public int[] sort(int[] arr) {

        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    void quickSort(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[low];

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(arr, low, j);
        }
        if (high > i) {
            quickSort(arr, i, high);
        }
    }
}
