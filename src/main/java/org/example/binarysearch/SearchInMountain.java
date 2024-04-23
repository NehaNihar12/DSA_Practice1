package org.example.binarysearch;


    /**
     * // This is MountainArray's API interface.
     * // You should not implement it, or speculate about its implementation
     * interface MountainArray {
     *     public int get(int index) {}
     *     public int length() {}
     * }
     */

    interface MountainArray {
         public int get(int index);
         public int length();
    }
    class SearchInMountain {
        public int findInMountainArray(int target, MountainArray mountainArr) {

            int peakIndex = findPeakIndex(mountainArr);
            int index = OrderAgnosticBinarySearch(target,0, peakIndex, mountainArr);
            if(index != -1){
                return index;
            }
            return OrderAgnosticBinarySearch(target,peakIndex+1,mountainArr.length()-1, mountainArr);


        }

        private static int findPeakIndex(MountainArray mountainArr){
            // find peak element
            int start = 0, end = mountainArr.length()-1;
            while(start<end){
                int mid = start+(end-start)/2;
                if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                    start = mid+1;
                }else{
                    end = mid;
                }
            }

            return start;
        }

        private static int OrderAgnosticBinarySearch(int target,int start, int end, MountainArray mountainArr){
            int index = -1;
            boolean isAsc = mountainArr.get(start)<mountainArr.get(end);
            while(start<=end){
                int mid = start+(end-start)/2;
                if(mountainArr.get(mid)==target){
                    return mid;
                }
                if(isAsc){
                    if(target>mountainArr.get(mid)){
                        start = mid+1;
                    }else{
                        end = mid-1;
                    }
                }
                else{
                    if(target<mountainArr.get(mid)){
                        start = mid+1;
                    }else{
                        end = mid-1;
                    }
                }
            }

            return index;
        }
    }

