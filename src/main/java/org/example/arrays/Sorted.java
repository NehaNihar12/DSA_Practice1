package org.example.arrays;

public class Sorted {
    public static void main(String[] args){
        System.out.println("Hi");
        boolean a = isSorted(new int[]{1, 2, 8, 4, 5},0);
        System.out.println(linSearch(new int[]{1, 2, 8, 4, 5},8,0));

    }

    private static boolean isSorted(int[] arr, int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return arr[i]<arr[i+1] && isSorted(arr,i+1);
    }

    private static boolean linSearch(int[] arr, int target,int i){
        if(i==arr.length){
            return false;
        }
        if(target == arr[i]){
            return true;
        }
        return linSearch(arr, target,i+1);
    }
}
