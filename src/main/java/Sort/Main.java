package Sort;

import Sort.compareSortExtendSort.BubbleSort3;
import Sort.tools.Asserts;
import Sort.tools.Integers;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: miyuki
 * @Date: 2022/11
 * @Description:
 */
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
public class Main {

    public static void main(String[] args) {
        Integer[] array = {7, 3, 5, 8, 6, 7, 4, 5};

        testSorts(array,
//				new RadixSort()
//				new InsertionSort1(),
//				new InsertionSort2(),
//                new InsertionSort3(),
//                new SelectionSort(),
//                new HeapSort(),
//                new MergeSort(),
                new BubbleSort3()
//                new QuickSort(),
//                new ShellSort()
        );
    }

    static void testSorts(Integer[] array, Sort... sorts) {
        for (Sort sort : sorts) {
            Integer[] newArray = Integers.copy(array);
            sort.sort(newArray);
            Asserts.test(Integers.isAscOrder(newArray));
        }
        Arrays.sort(sorts);

        for (Sort sort : sorts) {
            System.out.println(sort);
        }
    }
}