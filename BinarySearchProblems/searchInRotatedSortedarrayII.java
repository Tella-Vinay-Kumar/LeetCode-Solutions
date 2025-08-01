problem link : "https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/"

class Solution {
    public boolean search(int[] arr, int target) {
        int start=0;
        int end = arr.length-1;
        boolean ans = false;
        while(start <= end){
            int mid = start+(end - start)/2;
            if(arr[mid] == target){
                return true;
            }
             if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                start++;
                end--;
            } 
            else if(arr[start]<=arr[mid]){
                if(target>=arr[start] && target<arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            } 
            else
            {
                if(target >arr[mid] && target<=arr[end]){
                    start = mid+1;
                } else{
                    end=mid-1;
                }
            }
        }
        return ans;
    }
}
