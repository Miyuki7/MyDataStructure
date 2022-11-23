package Sort.simpleSort;

import static Sort.simpleSort.BubbleSort.swap;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: miyuki
 * @Date: 2022/11
 * @Description:
 */
public class SelectionSort {
    //每次选取最大的放到后面有序数列的最钱买你
    public static void selectionSort(int[] arr) {
        for (int end = arr.length - 1; end > 0; end--) {
            int maxIndex = 0;
            for (int begin = 1; begin <= end; begin++) {
                //为了保证稳定性，需要用<=
                if (arr[maxIndex] <= arr[begin]) {
                    maxIndex = begin;
                }
            }
            swap(arr, maxIndex, end);
        }
    }

    //每次选取最小的放到前面有序数列的最后面
    public static void selectionSort2(int[] arr) {
        for (int end = 0; end < arr.length - 1; end++) {
            int minIndex = end;
            for (int right = end + 1; right < arr.length; right++) {
                if (arr[minIndex] > arr[right]) {
                    minIndex = right;
                }
            }
            swap(arr, end, minIndex);
        }
    }
}
