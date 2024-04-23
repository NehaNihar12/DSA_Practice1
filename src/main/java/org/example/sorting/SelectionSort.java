package org.example.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {3,4,8,1,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * select the largest element and swap it with the last index of unsorted part
     * repeat this for n-1 times to fill n-1 positions
     */
    private static void selectionSort(int[] arr) {
        for(int i = 0;i<arr.length-1;i++){
            
        }
    }
}
