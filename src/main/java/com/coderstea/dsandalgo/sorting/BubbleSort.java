package com.coderstea.dsandalgo.sorting;

public class BubbleSort extends Sort {

  @Override
  public void sort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      // inner loop up to 2nd last element
      for (int j = 0; j < arr.length - 1; j++) {
        // if current element is greater than the next one, swap them
        if (arr[j] > arr[j + 1]) {
          swap(arr, j, j + 1);
        }
      }
    }
  }
}
