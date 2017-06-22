
public class NextGreaterElement {

	public static void main(String[] args) {
		SolutionNextGreaterElement snge = new SolutionNextGreaterElement();
		int[] findNums = {4,1,2};
		int[] nums = {1,4,3,2};
		int[] result = snge.nextGreaterElement(findNums, nums);
		for(int i=0;i<result.length;i++)
		System.out.print(result[i] +" ");
	}

}
