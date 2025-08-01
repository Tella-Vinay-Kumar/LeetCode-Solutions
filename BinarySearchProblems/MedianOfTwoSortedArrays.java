
problem link: "https://leetcode.com/problems/median-of-two-sorted-arrays/"

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      if(nums1.length >nums2.length){
        return findMedianSortedArrays(nums2,nums1);
      }
      int n1=nums1.length;
      int n2=nums2.length;
      int N=(n1+n2);
      int start=0;
      int end =n1;
      while(start <=end){
        int mid1 = start+(end - start)/2;
        int mid2 = N/2 -mid1;

        int l1 =(mid1==0)?Integer.MIN_VALUE : nums1[mid1 -1];
        int l2 =(mid2==0)?Integer.MIN_VALUE : nums2[mid2-1];
        int r1 = (mid1==n1)?Integer.MAX_VALUE : nums1[mid1];
        int r2 = (mid2==n2)?Integer.MAX_VALUE : nums2[mid2];

        if(l1<=r2 && l2<=r1){
            if(N%2==0){
                return (double) ((Math.max(l1,l2)+Math.min(r1,r2))/2.0);
            }else{
                return (double) Math.min(r1,r2);
            }
        }else if(l1>r2){
            end = mid1-1;
        } else{
            start=mid1+1;
        }
      }
      return 0.0;

    }
}
