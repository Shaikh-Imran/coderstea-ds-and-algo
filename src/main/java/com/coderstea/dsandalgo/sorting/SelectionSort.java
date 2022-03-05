package com.coderstea.dsandalgo.sorting;

public class SelectionSort extends Sort {

  @Override
  public void sort(int[] arr) {
    // Select the minimum on the right side
    // and swap it with the current value

    for (int i = 0; i < arr.length; i++) {
      int minValIndex = i;
      // traverse right side of the array from curr element
      for (int j = i + 1; j < arr.length; j++) {
        // if the current index value is less than min value
        // make current index as min value index
        if (arr[j] < arr[minValIndex]) {
          minValIndex = j;
        }
      }
      // swap the current value with minValIndex value
      swap(arr, i, minValIndex);
    }
  }
}
