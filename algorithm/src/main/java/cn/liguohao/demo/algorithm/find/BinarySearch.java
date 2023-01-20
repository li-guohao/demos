package cn.liguohao.demo.algorithm.find;

/**
 * <p>二分法查找</p>
 * <ol>
 *     <li>在一个有序数组(小到大)中，找某个数是否存在</li>
 *     <li>在一个有序数组(小到大)中，找大于等于某个数最左侧的位置</li>
 *     <li>局部最小值问题</li>
 * </ol>
 */
public class BinarySearch {
    public static boolean exist(int[] arr, int num) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException();
        }
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (num < arr[middle]) {
                high = middle - 1;
            } else if (num > arr[middle]) {
                low = middle + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static int question2(int[] arr, int num) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException();
        }
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (num > arr[middle]) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return arr[low];
    }


    public static int question3(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException();
        }
        if (arr[0] < arr[1]) {
            return arr[0];
        }
        if (arr[arr.length - 2] > arr[arr.length - 1]) {
            return arr[arr.length - 1];
        }

        int low = 1;
        int high = arr.length - 2;


        return -1;
    }

}
