package ru.malysheva.task21;

import java.util.Arrays;

public class ShiftArray {

    public static void main(String[] args) {

        final int k = 1; //на сколько сдвинем влево
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = new int[array1.length];
        System.arraycopy(array1, 1, array2, 0, array1.length - k);
        System.out.println(Arrays.toString(array2));

    }
//        src − This is the source array.
//        srcPos − This is the starting position in the source array.
//        dest − This is the destination array.
//        destPos − This is the starting position in the destination data.
//        length − This is the number of array elements to be copied.

}
