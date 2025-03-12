class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int c0 = 1; // Track if first column needs to be zero

        // Step 1: Mark rows and columns using first row and first column
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // Mark row
                    if (j != 0) {
                        matrix[0][j] = 0; // Mark column
                    } else {
                        c0 = 0; // First column should be zero
                    }
                }
            }
        }

        // Step 2: Update the matrix based on marks (excluding first row & column)
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Set first row to zero if needed
        if (matrix[0][0] == 0) {
            for (int j = 0; j < c; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 4: Set first column to zero if needed
        if (c0 == 0) {
            for (int i = 0; i < r; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
