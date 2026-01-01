/** Checks if a given string is a palindrome. */
public class Palindrome {

	public static void main(String[]args) {
    	System.out.println(isPalindrome(args[0]));

    }
	
	/** Checks if the given string is a palindrome. */
	public static boolean isPalindrome(String s) {
		int start=0;
		int end= s.length()-1;
		return isPalindrome (s,start,end);
    }
	public static boolean isPalindrome(String s, int start, int end) {
		if (start==end || end == -1)
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