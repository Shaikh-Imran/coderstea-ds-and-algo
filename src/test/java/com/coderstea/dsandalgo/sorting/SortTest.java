package com.coderstea.dsandalgo.sorting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

  private static Random random;

  @BeforeAll
  static void init() {
    random = new Random();
  }

  @Test
  void bubbleSort() {
    sortTest(new BubbleSort());
  }

  @Test
  void insertionSort() {
    sortTest(new InsertionSort());
  }

  @Test
  void selectionSort() {
    sortTest(new SelectionSort());
  }

  @Test
  void quickSort() {
    sortTest(new QuickSort());
  }

  @Test
  void mergeSort() {
    sortTest(new MergeSort());
  }

  void sortTest(Sort sortAlgo) {
    var unsortedArray = getRandomIntArray();
    var expectedSort = Arrays.copyOf(unsortedArray, unsortedArray.length);
    Arrays.sort(expectedSort); // sort expected array with core library

    // sort unsorted with given algo IN-PLACE
    sortAlgo.sort(unsortedArray);

    assertArrayEquals(expectedSort, unsortedArray);
  }

  public static int[] getRandomIntArray() {
    return IntStream.range(0, 10)
            .map(x -> random.nextInt(100))
            .toArray();
  }
}