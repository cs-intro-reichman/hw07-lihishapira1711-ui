/** Checks if a given string is a palindrome. */
public class Palindrome {

	public static void main(String[] args) {
    In in = new In();
    String s = in.readString();
    System.out.println(isPalindrome(s));
    }

	/** Checks if the given string is a palindrome. */
	public static boolean isPalindrome(String s) {
		int start=0;
		int end= s.length()-1;
		return isPalindrome (s,start,end);
    }
	public static boolean isPalindrome(String s, int start, int end) {
		if (start>=end)
		{
			return true;
		}
		if (s.charAt(start) != s.charAt(end))
		{
			return false;
		}
		return isPalindrome (s, start+1, end-1);
		
    }
}