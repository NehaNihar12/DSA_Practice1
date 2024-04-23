package org.example.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {3,4,8,1,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

/**  it's like sorting a hand of cards.
 * Initially 1st card is already sorted.
 * Remove one card at a time
 * find correct position, compare it with already sorted cards from right to left
 * insert it into to sorted deck.
 * good for small input
*/
    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                // shift the elements one position towards right
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
