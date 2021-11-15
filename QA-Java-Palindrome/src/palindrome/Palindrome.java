package palindrome;

public class Palindrome {
	public static boolean isPalindrome(String s) {
        	for (int i=s.length()-1, j=0; i>=0 && j<s.length(); i--, j++) {
        		if (s.charAt(i) != s.charAt(j)) {
        			return false;
        		}
            		if (i == j) {
            			break; // break halfway for better performance
            		}
        	}
        	return true;
    	}
	
	public static boolean listAll(String[] words) {
		System.out.println("Palindrome List\n-----------------------");
		for (String word : words) {
			System.out.println(
					word + (isPalindrome(word) ? " is a palindrome" : " is not a palindrome")
			);
		}
		return true;
	}
}
