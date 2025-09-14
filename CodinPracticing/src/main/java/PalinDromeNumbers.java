public class PalinDromeNumbers {

//    Given an integer x, return true if x is a palindrome, and false otherwise.
// Example 1:
//
//    Input: x = 121
//    Output: true
//    Explanation: 121 reads as 121 from left to right and from right to left.

    public boolean isPalindrome(int x) {

            String pal = String.valueOf(x);

            if(pal.charAt(0) == pal.charAt(pal.length() - 1)){
                return true;
            }
            else {
                return false;
            }
    }
}
