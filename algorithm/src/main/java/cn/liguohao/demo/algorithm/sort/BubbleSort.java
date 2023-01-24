package cn.liguohao.demo.algorithm.sort;

/**
 * <h1>冒泡排序</h1>
 * <p>介绍：一次比较两个元素，如果顺序错误就交换。</p>
 * <p>复杂度：时间O(n*n) 空间O(1)</p>
 * <p>稳定性：支持</p>
 * <p>指针：嵌套循环，两个指针i和j, 大指针i从尾(右)走到头(左)，小指针j最大值为大指针i，小指针j往头走。</p>
 * <p>过程：循环过程中比较小指针j 和 其后一个位置 的值，如果大则交换两个指针的值。</p>
 */
public class BubbleSort implements Sort {

    @Override
    public void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // 大指针从尾到头
        for (int i = arr.length - 1; i >= 0; i--) {
            // 小指针从头到尾
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
