package com.coderstea.dsandalgo.sorting;

public class QuickSort extends Sort {

  @Override
  public void sort(int[] arr) {
    quickSort(arr, 0, arr.length - 1);
  }

  public void quickSort(int[] arr, int left, int right) {
    // in case it has one or zero elements don't do anything
    if (left >= right) return;

    // partition i.e. sort the array and get partitioned index
    int partitionedIndex = partition(arr, left, right);

    // repeat the process for right side
    quickSort(arr, left, partitionedIndex - 1); // important to use -1

    // repeat the process for left side
    quickSort(arr, partitionedIndex, right);
  }

  private int partition(int[] arr, int left, int right) {
    // it's best to use middle as pivot index
    int pivotIndex = left + (right - left) / 2;
    int pivotValue = arr[pivotIndex];

    // sort the array from pivot such that
    // left side is less than pivot and right side is greater than pivot
    while (left <= right) {
      // move left pointer to right until its left value is smaller
      while (arr[left] < pivotValue) left++;

      // move right pointer to left until its left value is smaller
      while (arr[right] > pivotValue) right--;

      // swap the values of left and right in case
      // left index is equal to or less than right index
      if (left <= right) {
        swap(arr, left, right);
        // move the pointer to skip the processed index
        left++;
        right--;
      }
    }
    // return the left index as partition Index
    return left;
  }

}
