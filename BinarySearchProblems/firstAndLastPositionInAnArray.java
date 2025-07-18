
problem link: "https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/"

class Solution {
    public int[] searchRange(int[] nums, int target) {

        int ans[] = new int[2];
        ans[0]=binarySearch(nums,  target, true);
        ans[1]= binarySearch(nums, target,  false);
        return ans;
    }
    public static int binarySearch(int nums[], int target, boolean isFirst){
        int start=0, end=nums.length-1,ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                ans=mid;
                if(isFirst){
                    end=mid-1;
                }else{
                    start = mid+1;
                }
            } else if(target > nums[mid]){
                start=mid+1;
            } else{
                end = mid-1;
            }
        }
        return ans;

    }
}
