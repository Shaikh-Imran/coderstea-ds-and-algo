package com.coderstea.dsandalgo.sorting;

public class MergeSortAlgo implements SortAlgo {
    @Override
    public int[] sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
        return arr;
    }

    void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergeSort(arr, low, middle);
            mergeSort(arr, middle + 1, high);
            mergeParts(arr, low, middle, high);
        }
    }

    void mergeParts(int[] arr, int low, int middle, int high) {

        int leftArrSize = middle - low + 1;
        int rightArrSize = high - middle;

        int[] leftArr = new int[leftArrSize];
        int[] rightArr = new int[rightArrSize];

        System.arraycopy(arr, low, leftArr, 0, leftArrSize);
        System.arraycopy(arr, middle + 1, rightArr, 0, rightArrSize);

        int i = 0, j = 0, k = low;

        while (i < leftArrSize && j < rightArrSize) {
            if (leftArr[i] < rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while (j < rightArrSize) {
            arr[k++] = rightArr[j++];
        }
        while (i < leftArrSize) {
            arr[k++] = leftArr[i++];
        }
    }
}
