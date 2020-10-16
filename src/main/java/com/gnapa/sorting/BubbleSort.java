package com.gnapa.sorting;

import java.util.List;

public class BubbleSort extends Sorter<Integer> {

    @Override
    public void sort(Integer[] array) {
        if (array == null || array.length <= 1) return;

        boolean didSwap = true;
        while (didSwap) {
            didSwap = false;
            for (int index = 1; index < array.length; index++) {
                if (array[index] == null || array[index - 1] == null) throw new RuntimeException();
                if (array[index].compareTo(array[index - 1]) < 0) {
                    swap(array, index, index - 1);
                    didSwap = true;
                }
            }
        }
    }

    @Override
    public void sort(List<Integer> list) {
        // TODO Auto-generated method stub
    }
    
}
