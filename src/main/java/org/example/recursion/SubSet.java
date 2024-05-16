package org.example.recursion;

public class SubSet {
    public static void main(String[] args){
        subset(new int[]{},"abc");
    }

    public static void subset(int[] arr,String str){
        if(str.isEmpty()){
            return;
        }
        char ch = str.charAt(0);

    }
}
