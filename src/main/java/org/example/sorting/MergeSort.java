package org.example.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] arr = {4,3,7,6,1,2};
//        System.out.println(Arrays.toString(mergeSort(arr)));
        mergeSort(arr,0,arr.length);  // O(N): NlogN
        InplaceMergeSort(arr,0,arr.length-1); //O(N): N(logN)^2
        System.out.println(Arrays.toString(arr));

    }

    public static void InplaceMergeSort(int[] arr,int low,int high){
        if(low == high){
            return;
        }

        int mid = (low+high)/2;
        InplaceMergeSort(arr,low,mid);
        InplaceMergeSort(arr,mid+1,high);

        InplaceMerge(arr,low,mid,high);
    }

    // implement merge using shell sort
    /**
     * initial h = arr.lenght/2
     * iterate the list and compare each element to the next element that is at a distance h
     * if they are in incorrect order swap
     * if h== 1 terminate else repeat step 2
     * O(n) = nlogn
     */
    public static void InplaceMerge(int[] arr,int low,int mid,int high){
        int len = high-low+1;
        int h = len/2;

        while(h>=1){
            int i = low;
            while(i+h<=high){
                if(arr[i]>arr[i+h]){
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[i+h];
                    arr[i+h] = temp;
                }
                i++;
            }
            if(h==1)
                break;
            h=h/2;
        }
    }
    public static void mergeSort(int[] arr,int start,int end){
        if((end-start) == 1){
            return;
        }

        int mid = (start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid,end);

        merge(arr,start,mid,end);
    }

    private static void merge(int[] arr,int start,int mid,int end){

        int[] mix = new int[end-start];
        int i=start,j=mid,k=0;
        while(i< mid && j< end){
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<end){
            mix[k]=arr[j];
            j++;
            k++;
        }

        for(int idx =0;idx<mix.length;idx++){
            arr[start+idx] = mix[idx];
        }

    }
}
