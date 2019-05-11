package com.practise.warmUp.com.practise.warmUp.main;

public class WarmupImpl implements Warmup {
    @Override
    public int findMax(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int maximumIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maximumIndex]) {
                maximumIndex = i;
            }
        }
        return maximumIndex;
    }

    public static void main(String args[]) {
        Warmup warmup = new WarmupImpl();
        int array[] = {};
        System.out.println(warmup.findMax(array));
    }
}
