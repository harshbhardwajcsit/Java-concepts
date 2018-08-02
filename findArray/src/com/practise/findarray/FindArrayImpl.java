package com.practise.findarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindArrayImpl implements FindArray {

    @Override
    public int findArray(int[] array, int[] subArray) {
        if (array == null || array.length == 0) {
            return -1;
        }
        if (subArray == null || subArray.length == 0) {
            return -1;
        }
        if (subArray.length > array.length) {
            return -1;
        }
        return Collections.indexOfSubList(convertArrayToList(array), convertArrayToList(subArray));
    }

    private List<Integer> convertArrayToList(int[] array) {
        if (array == null) {
            return null;
        }
        List<Integer> output = new ArrayList<Integer>(array.length);
        for (int i = 0; i < array.length; i++) {
            output.add(Integer.valueOf(array[i]));
        }
        return output;
    }

}
