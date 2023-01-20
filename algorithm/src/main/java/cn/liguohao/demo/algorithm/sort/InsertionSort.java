package cn.liguohao.demo.algorithm.sort;

public class InsertionSort implements Sort{
    @Override
    public void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i -1; j >=0 && arr[j] > arr[j + 1] ; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        // i 和 j 如果是一个位置的，位运算的结果会变成0，这是不符合预期的
        if(i == j) {
            throw new IllegalArgumentException("'i' must not ep 'j'");
        }
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
