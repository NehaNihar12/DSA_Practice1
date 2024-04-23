package org.example.binarysearch;

public class RotationCount {
    public static void main(String[] args){
        int[] arr = {15,18,19};
        int count = countRotation(arr);
        System.out.println(count);
    }

    private static int countRotation(int[] arr){
        if(arr.length==1 || arr[0]<arr[arr.length-1]){
            return 0;
        } else{
            int i = 0,count=0;
            while(arr[i]<arr[i+1]){
                count++;
                i++;
            }
            return count+1;
        }


    }
}
