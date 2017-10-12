package datastructure.sort;

/**
 * 快排
 * Created by Linuxea on 2017/9/22.
 */
public class QuickSort {

    public static void quickSort(int[] ints) {
        int base = ints[0]; // 选择一个 base 参数
        for (int i = 1, j = ints.length - 1; i != j; i++, j--) {
            if (ints[i] < base) {
                // 出现了一个更小的数
                int temp = 0;
                temp = base;
                base = ints[i];
                ints[i] = temp;
            }
        }
    }

}
