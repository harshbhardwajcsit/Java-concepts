package com.practise.findarray;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindArrayImpl implements FindArray {

    @Override
    public int findArray(int[] array, int[] subArray) {
        int subArrayIdx = -1;

        if (null != array && null != subArray && array.length > 0 &&
                subArray.length > 0 && subArray.length < array.length) {

            Integer[] subArr = IntStream.of(subArray)
                    .boxed()
                    .toArray(Integer[]::new);

            for (int i = 0; i < (array.length - subArray.length + 1); i++) {

                Integer[] tempArray = IntStream
                        .of(Arrays.copyOfRange(array, i, subArray.length + i))
                        .boxed()
                        .toArray(Integer[]::new);

                if (Arrays.equals(tempArray, subArr)) {
                    subArrayIdx = i;
                }
            }
        }

        return subArrayIdx;
    }
//    @Override
//    public int findArray(int[] array, int[] subArray) {
//        if (array == null || subArray == null)
//            return -1;
//
//        if (array.length == 0 || subArray.length == 0)
//            return -1;
//
//        for (int i = 0; i <= array.length - subArray.length; i++) {
//            int j = 0;
//            for (; j < subArray.length; j++) {
//                if (array[i + j] != subArray[j]) {
//                    break;
//                }
//            }
//
//            if (j == subArray.length)
//                return i;
//        }
//
//        return -1;
//    }

}
