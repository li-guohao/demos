package cn.liguohao.demo.algorithm.sort;

/**
 * <h1>选择排序</h1>
 * <p>介绍：拿到最小值和当前值比较</p>
 * <p>复杂度：时间O(n*n) 空间O(1)</p>
 * <p>稳定性：不支持</p>
 * <p>指针：嵌套循环，两个指针i和j, 大指针i从头(左)走到尾(右)，小指针j最小值为大指针i+1，小指针j往后走筛选最小值。</p>
 * <p>过程：大指针的值大于小指针筛选出来的其它位置的最小值，则交换两者的位置</p>
 */
public class SelectionSort implements Sort {
    @Override
    public void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        // 大指针从头到位
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            // 小指针从 大指针下个位置 到尾部，筛选出值最小的位置
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[i] > arr[j] ? j : i;
            }
            if (minIndex != i) {
                int tmp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = tmp;
            }
        }
    }
}
