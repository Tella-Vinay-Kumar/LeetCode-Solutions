problem link: "https://leetcode.com/problems/transpose-matrix/";

class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                transpose[j][i]=matrix[i][j];
            }
        }
        return  transpose;
    }
}