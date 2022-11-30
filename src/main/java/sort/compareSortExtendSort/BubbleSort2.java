package sort.compareSortExtendSort;

import sort.Sort;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: miyuki
 * @Date: 2022/11
 * @Description:
 */
public class BubbleSort2<T extends Comparable<T>> extends Sort<T> {

    @Override
    protected void sort() {
        for (int end = array.length - 1; end > 0; end--) {
            //每一轮开始时候都设置一个标志
            boolean sorted = true;
            for (int begin = 1; begin <= end; begin++) {
                // if (array[begin] < array[begin - 1]) {
                if (cmp(begin, begin - 1) < 0) {
                    swap(begin, begin - 1);
                    sorted = false;
                }
            }
            if (sorted) break;
        }
    }

}
