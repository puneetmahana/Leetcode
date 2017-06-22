import java.util.*;

public class SolutionDistributeCandies {
    public int distributeCandies(int[] candies) {
    	Set<Integer> sister = new HashSet<Integer>();
    	int size = candies.length/2;
    	for(int i=0;(i<candies.length) && (sister.size()<size);i++){
    		sister.add(candies[i]);
    	}
    	int result = sister.size();
    	return result;
    }
}