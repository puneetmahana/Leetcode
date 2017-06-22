import java.util.HashMap;
import java.util.Stack;

public class SolutionNextGreaterElement {
	    public int[] nextGreaterElement(int[] findNums, int[] nums) {
	    HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
	    Stack<Integer> stack = new Stack<Integer>();
	    for(int number:nums){
	    	while(!stack.isEmpty() && stack.peek()<number){
	    		hmap.put(stack.pop(), number);
	    	}
	    	stack.push(number);
	    }
	    int[] result = new int[findNums.length];
	    for(int i=0;i<findNums.length;i++){
	    result[i] = hmap.getOrDefault(findNums[i], -1);
	    }
	    return result;
	}
}
