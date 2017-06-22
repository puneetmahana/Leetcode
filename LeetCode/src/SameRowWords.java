
public class SameRowWords {

	public static void main(String[] args) {
		String[] words = {"Hello", "Alaska", "Dad", "Peace"};
		SolutionFindWords sfw = new SolutionFindWords();
		String[] result = sfw.findWords(words);
		for(String s:result)
		System.out.println(s);
	}

}