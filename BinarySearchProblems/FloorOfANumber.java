problem: given an array of sorted elements and a target find  the number of occurances of a target the array
class Solution{
    public static int floor(int[] arr, int target) {
        int start =0,end=arr.length-1,ans=-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]==target){
                ans = arr[mid];
                break;
            } 
            else if(arr[mid]>target){
                end=mid-1;
                ans=arr[mid];

            }else{
                start = mid+1;
            }
        }
    }return ans;
}

