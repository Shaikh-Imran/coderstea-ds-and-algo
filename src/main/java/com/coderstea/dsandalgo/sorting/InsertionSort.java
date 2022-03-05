package com.coderstea.dsandalgo.sorting;

public class InsertionSort extends Sort {

  @Override
  public void sort(int[] arr) {
    // start with 2nd element assuming the 0th element is sorted
    for (int i = 1; i < arr.length; i++) {
      // copy the current element
      int curr = arr[i];
      int j = i - 1; // traverse the left side excluding current

      // shift element to right until
      // the element is greater than the 'curr'
      // or you reach the start of the array
      while (j >= 0 && arr[j] > curr) {
        arr[j + 1] = arr[j]; // shift the element to right
        j--; // move pointer to one index left
      }
      // INSERT the current element resulting the left side as sorted
      arr[j + 1] = curr;
    }
  }
}
