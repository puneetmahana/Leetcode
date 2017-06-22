
public class ReshapeMatrix {

	public static void main(String[] args) {
		SolutionMatrixReshape smr = new SolutionMatrixReshape();
		int[][] nums = 	{{1,2}, {3,4}};
		int r=1;
		int c=4;
		int[][] result = smr.matrixReshape(nums, r, c);
		for(int i=0;i<result.length;i++){
			for(int j=0;j<result[0].length;j++){
				System.out.print(result[i][j]+" ");
			}
			System.out.println("\n");
		}
		
	}

}
