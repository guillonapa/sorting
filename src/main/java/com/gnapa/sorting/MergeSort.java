package com.gnapa.sorting;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeSort extends Sorter<Integer> {

    @Override
    public void sort(Integer[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(Integer[] array, int start, int end) {
        if (end - start > 1) {
            int mid = (start + end) / 2;
            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);
            merge(array, start, mid, end);
        }
    }

    private void merge(Integer[] array, int start, int mid, int end) {
        List<Integer> ordered = new LinkedList<>();
        int left = start;
        int right = mid + 1;
        while (left <= mid && right <= end) {
            if (array[right] < array[left]) {
                ordered.add(array[right]);
                right++;
            } else {
                ordered.add(array[left]);
                left++;
            }
        }

        while (left <= mid) {
            ordered.add(array[left]);
            left++;
        }
        while (right <= end) {
            ordered.add(array[right]);
            right++;
        }

        int index = start;
        for (Integer num : ordered) {
            array[index++] = num;
        }
    }

    @Override
    public void sort(List<Integer> list) {
        // TODO Auto-generated method stub

    }
    
}
