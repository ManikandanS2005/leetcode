class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix.length == 0) return res;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        
        while(top <= bottom && left <= right){
            // Traverse top row left -> right
            for(int i = left; i <= right; i++){
                res.add(matrix[top][i]);
            }
            top++;
            
            // Traverse right column top -> bottom
            for(int i = top; i <= bottom; i++){
                res.add(matrix[i][right]);
            }
            right--;
            
            // Traverse bottom row right -> left
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            // Traverse left column bottom -> top
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}
