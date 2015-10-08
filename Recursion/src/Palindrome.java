public class Palindrome {

	public static void main(String[] args) {

		System.out.println(isPalindrome("ANNA"));
		System.out.println(isPalindrome("Johnny"));
		System.out.println(isPalindrome("amanaplanacanalpanama"));
		System.out.println(isPalindrome("recursioniscomplicated"));
	}

	public static boolean isPalindrome(String s) {

		if (s.length() <= 1)
			return true;
		if (s.charAt(0) != s.charAt(s.length() - 1))
			return false;
		return isPalindrome(s.subSequence(1, s.length() - 1).toString());
	}

}
