
public class IslandPerimeter {

	public static void main(String[] args) {
		SolutionIslandPerimeter sip = new SolutionIslandPerimeter();
		int[][] grid ={{0,0,0,0},{1,0,1,1},{1,1,1,0},{1,0,1,1}};
		int result = sip.islandPerimeter(grid);
		System.out.println(result);
	}

}
