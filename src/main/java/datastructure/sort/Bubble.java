package datastructure.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 初版冒泡
 * Created by Linuxea on 2017/9/22.
 */
public class Bubble {

    public static void sort(int[] ints) {

        System.out.println("before datastructure.sort :" + Arrays.toString(ints));
        int temp;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length - i - 1; j++) { //每次排序好的序列结果保存在最后。故为冒泡
                if (ints[j] > ints[j + 1]) {
                    temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }

        System.out.println("after datastructure.sort :" + Arrays.toString(ints));

    }


    public static void main(String[] args) {
        int[] ints = new int[10];
        for (int i = 0; i < 10; i++) {
            ints[i] = new Random().nextInt(966);
        }
        Bubble.sort(ints);
    }

}
