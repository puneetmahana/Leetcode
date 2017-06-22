import java.util.*;
public class SolutionFindWords {
    public String[] findWords(String[] words) {
    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    ArrayList<String> result = new ArrayList<String>();
    String[] keyboard = {"qwertyuiop","asdfghjkl","zxcvbnm"};
    for(int i=0;i<keyboard.length;i++){
    	for(char c:keyboard[i].toCharArray()){
    		map.put(c,i+1);
    	}
    }
    for(String s:words){
    	int row = map.get(s.toLowerCase().charAt(0));
    	for(char c:s.toLowerCase().toCharArray()){
    		if(map.get(c)!=row){
    			row = -1;
    		    break;
    	}
    	}
    	if(row!=-1)
    		result.add(s);
    }
    return result.toArray(new String[0]);
     }
    
}
   