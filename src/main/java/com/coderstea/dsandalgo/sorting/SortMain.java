package com.coderstea.dsandalgo.sorting;

import java.util.Random;
import java.util.stream.IntStream;

public class SortMain {

    static Random random;

    public static void main(String[] args) {
        random = new Random();
        sort("Bubble Sort", new BubbleSortAlgo());
        sort("Selection Sort", new SelectionSortAlgo());
        sort("Insertion Sort", new InsertionSortAlgo());
        sort("Quick Sort", new QuickSortAlgo());
        sort("Merge dSort", new MergeSortAlgo());

    }

    static void sort(String algoName, SortAlgo sortAlgo) {
        int[] unsortedArray = getRandomIntArray(10);
        System.out.println("Unsorted Array:");
        printArray(unsortedArray);

        int[] sortedArray = sortAlgo.sort(unsortedArray);
        System.out.println("Sorted Array by " + algoName);
        printArray(sortedArray);
    }

    public static int[] getRandomIntArray(int arrSize) {
        return IntStream.range(0, arrSize)
                .map(x -> random.nextInt(100))
                .toArray();
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
