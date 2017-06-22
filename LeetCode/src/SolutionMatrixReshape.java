public class SolutionMatrixReshape {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
    int rows = nums.length;
    int cols = nums[0].length;
    if(rows*cols != r*c){
    	return nums;
    }
    	int[][] reshapedMatrix = new int[r][c];
    	int nrow =0;
    	int ncols=0;
    	for(int i=0;i<rows;i++){
    		for(int j=0;j<cols;j++){
    			reshapedMatrix[nrow][ncols] = nums[i][j];
    			ncols++;
    			if(ncols == c){
    				ncols=0;
    				nrow++;
    			}
    		}
    	}
    	
    	return reshapedMatrix;
    
    }
}