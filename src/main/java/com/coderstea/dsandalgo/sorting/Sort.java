package com.coderstea.dsandalgo.sorting;

public abstract class Sort {
  public abstract void sort(int[] arr);

  public void swap(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }
}
