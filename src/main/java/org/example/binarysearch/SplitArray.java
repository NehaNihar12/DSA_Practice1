package org.example.binarysearch;

public class SplitArray {
    public static void main(String[] args){
        int sum = splitArray(new int[] {7,2,5,10,8}, 2);
        System.out.println(sum);
    }
    public static int splitArray(int[] nums, int k) {

        int l=0,r=0, ans=0;
        // minimized sum can be in between [l,l+1,l+2,.........r-1,r]
        for(int i=0;i<nums.length;i++){
            l= Math.max(l,nums[i]);
            r+=nums[i];
        }

        // binary search a no between l to r
        while(l<=r){
            int mid = (l+r)/2;
            if(minSubArraysRequired(nums, mid)<=k){
                // it can or cannot be ans
                r = mid-1;
                ans = mid;
            }else{
                l = mid+1;
            }

        }
        return ans;

    }

    private static int minSubArraysRequired(int[] nums,int mid){
        int sum = 0,pieces=1;
        for(int num:nums){
            if(sum+num>mid){
                sum = num;
                pieces++;
            }else{
                sum+=num;
            }
        }
        return pieces;
    }
}
