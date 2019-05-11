package com.dsa.quicksort;
import java.util.Arrays;

public class QuickSortImpl implements QuickSort {

    public static  int[] unsortedArray = {11,16,2,8,1,9,4,7,91,17,1,90,16,15,4,3,2,90};

    @Override
    public int partition(int[] array,int beg,int end) {
        System.out.println(array);
        int partitionIndex = 0;
        int pivot=array[end];
        int pivotIndex=end;
        int current=beg;
        int index=beg;
        for(int i=current;i<=end;i++,current++){
            if(current<pivotIndex){
                if(array[current]<pivot){
                    int temp=array[current];
                    array[current]=array[index];
                    array[index]=temp;
                    System.out.println(array);
                    index++;
                }
            }
            else{
                int temp0=array[pivotIndex];
                array[pivotIndex]=array[index];
                array[index]=temp0;
                partitionIndex=index;
                System.out.println(array);
            }

        }

        return partitionIndex;
    }

    @Override
    public void quickSort(int[] unsortedArray,int beg,int end) {

        if(beg<end) {

            int partitionIndex=partition(unsortedArray,beg,end);
            quickSort(unsortedArray, 0, partitionIndex - 1);
            quickSort(unsortedArray, partitionIndex + 1, end);
        }
        System.out.println(unsortedArray);
//        Arrays.sort(unsortedArray);

    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSortImpl();
        quickSort.quickSort(unsortedArray,0,unsortedArray.length-1);
    }
}
