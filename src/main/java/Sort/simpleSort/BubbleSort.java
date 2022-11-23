package Sort.simpleSort;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: miyuki
 * @Date: 2022/11
 * @Description:
 */
public class BubbleSort {

    public static void bubbleSort1(int[] arr) {
        //比较的结束位置，第一次循环结束位置就是arr中的最后一个元素
        for (int end = arr.length - 1; end > 0; end--) {
            //每一轮比较从 0 到 end
            for (int begin = 1; begin <= end; begin++) {
                if (arr[begin] < arr[begin - 1]) {
                    swap(arr, begin - 1, begin);
                }
            }
        }
    }
    public static void bubbleSort2(int[] arr) {
        for (int end = arr.length - 1; end > 0; end--) {
            //每一轮开始时候都设置一个标志
            boolean sorted = true;
            for (int begin = 1; begin <= end; begin++) {
                if (arr[begin] < arr[begin - 1]) {
                    sorted = false;
                    swap(arr, begin - 1, begin);
                }
            }
            if (sorted) break;
        }
    }
    //endIndex代表发生交换的最后一个元素下标
    //例如：321456  第一趟排序结束变成213456，这个endIndex就是2，并且从下表2开始都有序了
    //下标3以及之后的元素都没有发生交换，所以可以将end直接跳转到endIndex-1，在for循环里有end--，所以end = endIndex后跳到下一层循环
    //里面end会自动减一（end--这个条件）
    public static void bubbleSort3(int[] arr) {
        for (int end = arr.length - 1; end > 0; end--) {
            // endIndex可以设置为任意小于等于1的数
            //数据一开始就有序的化，在下面会将end赋值为1，接着外层循环end--就不满足end>0就退出了
            int endIndex = 1;
            for (int begin = 1; begin <= end; begin++) {
                if (arr[begin - 1] > arr[begin]) {
                    swap(arr, begin - 1, begin);
                    endIndex = begin;
                }
            }
            end = endIndex;
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
