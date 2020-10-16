package com.gnapa.sorting;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * <p>
 * Unit tests for classes extending {@link Sorter}.
 * The tested sorters are:
 * </p>
 * 
 * <ul>
 * <li>BubbleSort</li>
 * <li>InsertionSort</li>
 * <li>MergeSort</li>
 * <li>QuickSort</li>
 * </ul>
 * 
 * @author Guillermo Narvaez
 * @see SortingListsTest
 */
public class SortingArraysTest {

    @Test
    public void bubbleSortTest() {
        BubbleSort sorter = new BubbleSort();
        assertTrue(simpleTest(sorter));
    }

    @Test
    public void insertionSortTest() {
        InsertionSort sorter = new InsertionSort();
        assertTrue(simpleTest(sorter));
    }

    @Test
    public void quickSortTest() {
        QuickSort sorter = new QuickSort();
        assertTrue(simpleTest(sorter));
    }

    @Test
    public void mergeSortTest() {
        MergeSort sorter = new MergeSort();
        assertTrue(simpleTest(sorter));
    }

    public boolean simpleTest(Sorter<Integer> sorter) {
        Integer[] array = List.of(
            3, 7, 4, 1, 3, 2, 9, 10, 6, 5, 8
        ).toArray(new Integer[0]);
        Integer[] sortedArray = List.of(
            1, 2, 3, 3, 4, 5, 6, 7, 8, 9, 10
        ).toArray(new Integer[0]);
        sorter.sort(array);
        return Arrays.equals(sortedArray, array);
    }
}
