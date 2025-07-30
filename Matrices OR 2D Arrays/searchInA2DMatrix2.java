problem link: "https://leetcode.com/problems/search-a-2d-matrix-ii/description/"


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            int n = matrix[i].length;
            if(matrix[i][n-1]>=target){
            int start=0;
            int end = n-1;
            while(start<=end){
                int mid = start+(end - start)/2;
                if(matrix[i][mid]==target){
                    return true;
                } else if(target < matrix[i][mid]){
                    end = mid-1;
                } else{
                    start = mid +1;
                }

            }
        }
       

        }
         return false;
    }
}
