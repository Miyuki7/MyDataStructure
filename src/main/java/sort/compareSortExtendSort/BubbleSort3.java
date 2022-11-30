package sort.compareSortExtendSort;

import sort.Sort;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: miyuki
 * @Date: 2022/11
 * @Description:
 */
//endIndex代表发生交换的最后一个元素下标
    //例如：321456  第一趟排序结束变成213456，这个endIndex就是2，并且从下表2开始都有序了
    //下标3以及之后的元素都没有发生交换，所以可以将end直接跳转到endIndex-1，在for循环里有end--，所以end = endIndex后跳到下一层循环
    //里面end会自动减一（end--这个条件）
public class BubbleSort3<T extends Comparable<T>> extends Sort<T> {

    @Override
    protected void sort() {
        for (int end = array.length - 1; end > 0; end--) {
            int sortedIndex = 1;
            // endIndex可以设置为任意小于等于1的数
            //数据一开始就有序的化，在下面会将end赋值为1，接着外层循环end--就不满足end>0就退出了
            for (int begin = 1; begin <= end; begin++) {
                // if (array[begin] < array[begin - 1]) {
                if (cmp(begin, begin - 1) < 0) {
                    swap(begin, begin - 1);
                    sortedIndex = begin;
                }
            }
            end = sortedIndex;
        }
    }

}
