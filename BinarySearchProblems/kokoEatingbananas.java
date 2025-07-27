problem link: "https://leetcode.com/problems/koko-eating-bananas/"


class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE,ans=0;
        for(int i=0;i<piles.length;i++){
            max= Math.max(piles[i],max);
        }
        int start=1,end=max,mid=0;
        while(start<=end){
            mid =start+(end-start)/2;
            if(isValid(piles,mid,h)){
                ans= mid;
                end=mid-1;
            } else{
                start= mid+1;
            }
        }
        return ans;
    }
    static boolean isValid(int[] piles,int k, int h){
        long sum=0;
        for(int i=0;i<piles.length;i++){
            sum =sum+( (piles[i] + k-1)/k);
            
        }
        if(sum<=h){
            return true;
        } 
            return false;
    }
}
