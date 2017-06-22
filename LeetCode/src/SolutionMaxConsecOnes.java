
public class SolutionMaxConsecOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
		int currMax =0;
		int max=0;
		for(int number:nums){
			if(number == 1){
				currMax += 1;
				max = Math.max(currMax,max);
			}
			else
			currMax = 0;
		}
        return max;
    }
}
