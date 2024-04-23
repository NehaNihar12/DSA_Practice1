package org.example.binarysearch;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {2,3,5,7,8,9};
        int index = binarySearch(arr,5,0,5);
        System.out.println(index);
    }

    static int binarySearch(int[] arr,int target,int start,int end){

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<target){
                start= mid+1;
            }else if(arr[mid]>target){
                end= mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
