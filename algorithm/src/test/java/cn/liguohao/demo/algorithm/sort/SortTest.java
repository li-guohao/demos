package cn.liguohao.demo.algorithm.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SortTest {

    @Test
    void selectionSort() {
        var selectionSort = new SelectionSort();
        int[] arr = {1, 7, 2, 0};
        Arrays.stream(arr).forEach(System.out::println);
        selectionSort.sort(arr);
        System.out.println();
        Arrays.stream(arr).forEach(System.out::println);
    }

    @Test
    void bubbleSort() {
        var bubbleSort = new BubbleSort();
        int[] arr = {1, 7, 2, 0};
        Arrays.stream(arr).forEach(System.out::println);
        bubbleSort.sort(arr);
        System.out.println();
        Arrays.stream(arr).forEach(System.out::println);
    }

    @Test
    void insertionSort() {
        var insertionSort = new InsertionSort();
        int[] arr = {1, 7, 2, 0};
        Arrays.stream(arr).forEach(System.out::println);
        insertionSort.sort(arr);
        System.out.println();
        Arrays.stream(arr).forEach(System.out::println);
    }
}