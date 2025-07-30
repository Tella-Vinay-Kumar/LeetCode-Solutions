problem link : "https://leetcode.com/problems/search-a-2d-matrix/description/"


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n = matrix[0].length;
        int start=0;
        int end= (n*m) -1;
        while(start <=end){
            int mid = start +(end - start)/2;
            int r = mid/n;
            int c = mid%n;
            int val = matrix[r][c];
            if(val == target){
                return true;
            } else if(target <= val){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return false;
    }
}
