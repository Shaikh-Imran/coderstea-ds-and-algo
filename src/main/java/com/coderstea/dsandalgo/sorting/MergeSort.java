package com.coderstea.dsandalgo.sorting;

public class MergeSort extends Sort {
  @Override
  public void sort(int[] arr) {
    int[] tempArr = new int[arr.length];
    mergeSort(arr, tempArr, 0, arr.length - 1);
  }

  public void mergeSort(int[] arr, int[] tempArr, int left, int right) {
    // in case of one or zero element do nothing
    if (left >= right) return;

    int mid = left + (right - left) / 2; // or (right + left) /2

    // sort left side
    mergeSort(arr, tempArr, left, mid);

    // sort right side
    mergeSort(arr, tempArr, mid + 1, right);

    // merge the sorted array
    mergeSortedArray(arr, tempArr, left, right);
  }

  private void mergeSortedArray(int[] arr, int[] tempArr, int left, int right) {
    int leftStart = left;
    int rightEnd = right;
    int leftEnd = leftStart + (rightEnd - leftStart) / 2; // simply middle index
    int rightStart = leftEnd + 1;

    int sortedIndex = leftStart;
    //  traverse until one of the start index reaches corresponding end index
    while (leftStart <= leftEnd && rightStart <= rightEnd) {
      // if left value is smaller or equal than the right side,
      // use it and increment left pointer
      if (arr[leftStart] <= arr[rightStart]) {
        tempArr[sortedIndex] = arr[leftStart];
        leftStart++;
      } else { // else use right index and increment right index
        tempArr[sortedIndex] = arr[rightStart];
        rightStart++;
      }
      sortedIndex++; // increment it anyway
    }

    // in case one of the array reaches the end first, we need to
    // make sure remaining values are copied.

    /** I used arraycopy but for simplicity you can use while loop also */

    // copy left array if remaining
    // (leftEnd - leftStart + 1) will give zero if nothing remaining
    System.arraycopy(arr, leftStart, tempArr, sortedIndex, leftEnd - leftStart + 1);

    // copy right array if remaining
    // (rightEnd - rightStart + 1) will give zero if nothing remaining
    System.arraycopy(arr, rightStart, tempArr, sortedIndex, rightEnd - rightStart + 1);

    // copy the full temp array from left to right
    System.arraycopy(tempArr, left, arr, left, right - left + 1);
  }
}
