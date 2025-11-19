class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int rowStart = 0, rowEnd = rows - 1;
        int colStart = 0, colEnd = cols - 1;

        List<Integer> result = new ArrayList<>();

        while (rowStart <= rowEnd && colStart <= colEnd) {

            for (int col = colStart; col <= colEnd; col++)
                result.add(matrix[rowStart][col]);
            rowStart++;

            for (int row = rowStart; row <= rowEnd; row++)
                result.add(matrix[row][colEnd]);
            colEnd--;

            if (rowStart <= rowEnd) {
                for (int col = colEnd; col >= colStart; col--)
                    result.add(matrix[rowEnd][col]);
                rowEnd--;
            }

            if (colStart <= colEnd) {
                for (int row = rowEnd; row >= rowStart; row--)
                    result.add(matrix[row][colStart]);
                colStart++;
            }
        }

        return result;
    }
}


/* class Solution {
    public int[] spiralOrder(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int rowstart = 0, rowend = rows - 1;
        int colstart = 0, colend = cols - 1;

        int[] result = new int[rows * cols];
        int i = 0;
        
        while(rowstart<=rowend && colstart<=colend){

           for(int col=colstart;col<=colend;col++) result[i++]=matrix[rowstart][col];
           rowstart++;
           for(int row=rowstart;row<=rowend;row++) result[i++]=matrix[row][colend];
           colend--;
           for(int col=colend;col>=colstart;col--) result[i++]=matrix[rowend][col];
           rowend--;
           for(int row=rowend;row>=rowstart;row--) result[i++]=matrix[row][colstart];
           colstart++;
        }
        return result;
    }
} */