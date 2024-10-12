class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while(row <= matrix.length-1 && col >= 0){
            if(target == matrix[row][col]){
                return true;
            }
            else if(target > matrix[row][col]){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
    }

    public static void main(String args[]){
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9,10,11,12}}; 
        int target = 10;

        searchMatrix(matrix, target);
    }
        
}
