package sort.simpleSort;

import static sort.simpleSort.SelectionSort.selectionSort;
import static sort.simpleSort.SelectionSort.selectionSort2;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: miyuki
 * @Date: 2022/11
 * @Description:
 */
public class test {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            util();
        }
        if (correct == i) {
            System.out.println("测试通过！！");
        }
    }
    static int i = 0;
    static int correct = 0;
    static void util() {
        int[] a = new int[10];
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
            b[i] = a[i];
        }
        selectionSort2(a);
        selectionSort(b);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                System.out.println("出错了");
                break;
            }
            if (i == a.length - 1 && a[i] == b[i]) {
                correct++;
            }
        }
        i++;

    }
}
