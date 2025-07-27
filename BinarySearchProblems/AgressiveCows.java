// problem link:  "https://www.geeksforgeeks.org/problems/aggressive-cows/1"
class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        if(k>stalls.length){
            return -1;
        }
        Arrays.sort(stalls);
        int start=1,end=stalls[stalls.length -1],ans=-1;
        while(start<=end){
            int mid = start+(end - start)/2;
            if(isValid(stalls,k,mid)){
                ans=mid;
                start=mid+1;
            } else{
                end = mid-1;
            }
        }
        return ans;
    }
    static boolean isValid(int[] stalls,int cows,int minDistance){
        int cowsCount=1;
        int lastCowDistance = stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i] - lastCowDistance>= minDistance){
                cowsCount++;
                lastCowDistance = stalls[i];
            }
        }
        if(cowsCount>=cows){
            return true;
        }
        return false;
    }
}
