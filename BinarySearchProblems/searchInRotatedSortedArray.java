problem link : "https://leetcode.com/problems/search-in-rotated-sorted-array/description/"

  class Solution {
    public int search(int[] arr, int target) {
       int start=0;
       int end = arr.length-1;
       int ans=-1;
       while(start <=end){
        int mid = start+(end-start)/2;
        if(target == arr[mid]){
            ans= mid;
        }
        //left is sorted anukundam
        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target < arr[mid]){
                end=mid-1;
            }else{
                start = mid+1;
            }
        }
        //right side sorted anukundam
        else{
            if(target>arr[mid] && target<=arr[end]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }      
    }
    return ans;

}
}
