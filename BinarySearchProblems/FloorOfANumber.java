problem: given an sorted array and a target find all occurances of that tareget in the array which might contain duplicate elements

class Solution{
    public int floor(int[] arr, int target) {
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

