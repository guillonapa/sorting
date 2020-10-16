package com.gnapa.sorting;

import java.util.List;

public class InsertionSort extends Sorter<Integer> {

    @Override
    public void sort(Integer[] array) {
        if (array == null || array.length <= 1) return;

        for (int index = 1; index < array.length; index++) {
            insert(array, index);
        }
    }

    private void insert(Integer[] array, int index) {
        while (index > 0) {
            if (array[index].compareTo(array[index - 1]) < 0) {
                swap(array, index, index - 1);
                index--;
            } else {
                return;
            }
        }
    }

    @Override
    public void sort(List<Integer> list) {
        // TODO Auto-generated method stub

    }
    
}
