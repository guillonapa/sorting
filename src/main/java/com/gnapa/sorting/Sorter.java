package com.gnapa.sorting;

import java.util.List;

public abstract class Sorter<T> {

    public abstract void sort(T[] array);

    public abstract void sort(List<T> list);

    public void swap(T[] array, int a, int b) {
        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

}