package com.gnapa.sorting;

import java.util.List;

public class QuickSort extends Sorter<Integer> {

    @Override
    public void sort(Integer[] array) {
        quickSort(array, 0, array.length - 1);

    }

    private void quickSort(Integer[] array, int start, int end) {
        if (start < end) {
            int pivot = partition(array, start, end);
            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);
        }
    }

    private int partition(Integer[] array, int start, int end) {
        int pivotIndex = (start + end) / 2;
        int pivotValue = array[pivotIndex];
        swap(array, pivotIndex, end);

        int strictlyLess = start - 1;
        for (int currIndex = start; currIndex < end; currIndex++) {
            if (array[currIndex].compareTo(pivotValue) < 0) {
                strictlyLess++;
                swap(array, strictlyLess, currIndex);
            }
        }
        swap(array, strictlyLess + 1, end);
        return strictlyLess + 1;
    }

    @Override
    public void sort(List<Integer> list) {
        // TODO Auto-generated method stub

    }
    
}
