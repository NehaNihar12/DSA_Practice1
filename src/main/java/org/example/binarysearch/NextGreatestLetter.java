package org.example.binarysearch;

public class NextGreatestLetter {
    public static char nextGreatestLetter(char[] letters, char target) {

        char ch;
        int l = letters.length-1,start=0, end=letters.length-1;


//        if(letters[l]<=target){
//            return letters[0];
//        }

        while(start<=end){

            int mid = start+ (end-start)/2;
            if(target<letters[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }

        return letters[start%letters.length];

    }
    public static void main(String[] args){
        char c = nextGreatestLetter(new char[]{'x','x','x','y','y'}, 'y');
        System.out.println(c);
    }
}
