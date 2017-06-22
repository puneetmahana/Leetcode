
public class StringReversal {

	public static void main(String[] args) {
		SolutionStringReversal ssr = new SolutionStringReversal();
		SolutionSimpleStringReverse sssr = new SolutionSimpleStringReverse();
		//String value = "Let's take LeetCode contest";
		//String result = ssr.reverseWords(value);
		String value = "Hello";
		String result = sssr.reverseString(value);
		System.out.println(result);
	}

}
