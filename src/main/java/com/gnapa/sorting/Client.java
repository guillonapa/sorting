package com.gnapa.sorting;

import java.util.Arrays;

public class Client {

    public static final boolean DEBUG = false;
    public static void main(String[] args) {
        Integer[] arrayForBubbleSort = generateRandomArray(80000, 100000);
        Integer[] arrayForInsertionSort = arrayForBubbleSort.clone();
        Integer[] arrayForMergeSort = arrayForBubbleSort.clone();
        Integer[] arrayForQuickSort = arrayForBubbleSort.clone();
        
        BubbleSort bubbleSort = new BubbleSort();
        sortAndTime(bubbleSort, arrayForBubbleSort);
        
        InsertionSort insertionSort = new InsertionSort();
        sortAndTime(insertionSort, arrayForInsertionSort);

        MergeSort mergeSort = new MergeSort();
        sortAndTime(mergeSort, arrayForMergeSort);

        QuickSort quickSort = new QuickSort();
        sortAndTime(quickSort, arrayForQuickSort);
    }

    private static void sortAndTime(Sorter<Integer> sorter, Integer[] randomArray) {
        if (DEBUG) System.out.println(Arrays.toString(randomArray));
        long start = System.currentTimeMillis();
        sorter.sort(randomArray);
        long end = System.currentTimeMillis();
        if (DEBUG) System.out.println(Arrays.toString(randomArray));
        System.out.println(String.format("Sorted in: %d seconds.", (end - start)/1000));
    }

    private static Integer[] generateRandomArray(int size, int ceiling) {
        Integer[] array = new Integer[size];
        for (int index = 0; index < array.length; index++) {
            array[index] = (int) (Math.random() * ceiling);
        }
        return array;
    }

}
