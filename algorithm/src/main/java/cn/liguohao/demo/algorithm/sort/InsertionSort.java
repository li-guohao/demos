package cn.liguohao.demo.algorithm.sort;

/**
 * <h1>插入排序</h1>
 * <p>介绍：将数组分为已经排好序的和没有排好序的两部分，从局部有序到整体有序。</p>
 * <p>复杂度：时间O(n*n) 空间O(1)</p>
 * <p>稳定性：支持</p>
 * <p>指针：嵌套循环，两个指针i和j, 指针i从头(左)走到尾，指针j初始位置为i-1，指针j往头走。</p>
 * <p>过程：循环过程中比较指针i和指针j(或者指针i+1)的值，如果大则交换两个指针的值。</p>
 */
public class InsertionSort implements Sort{
    @Override
    public void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // 大指针从第二个元素到为尾部
        for (int i = 1; i < arr.length; i++) {
            // 小指针从大指针前一个位置往头，当大指针之前的位置有序(局部有序)
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
