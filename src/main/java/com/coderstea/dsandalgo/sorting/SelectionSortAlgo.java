package com.coderstea.dsandalgo.sorting;

public class SelectionSortAlgo implements SortAlgo {

    @Override
    public int[] sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[minValueIndex] > arr[j])
                    minValueIndex = j;

            //swap min value with first index of sub array
            int temp = arr[minValueIndex];
            arr[minValueIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
