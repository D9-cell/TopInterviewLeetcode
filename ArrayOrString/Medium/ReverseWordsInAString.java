package ArrayOrString.Medium;


import java.util.Stack;

/**

    Given an input string s, reverse the order of the words.
    A word is defined as a sequence of non-space characters.
    The words in s will be separated by at least one space.
    Return a string of the words in reverse order concatenated by a single space.
    Note that s may contain leading or trailing spaces or multiple spaces between two words.
    The returned string should only have a single space separating the words.
    Do not include any extra spaces.

    Example 1:
    Input: s = "the sky is blue"    Output: "blue is sky the"

    Example 2:
    Input: s = "  hello world  "    Output: "world hello"
    Explanation: Your reversed string should not contain leading or trailing spaces.

    Example 3:
    Input: s = "a good   example"   Output: "example good a"
    Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

    Constraints:

    1 <= s.length <= 10^4
    s contains English letters (upper-case and lower-case), digits, and spaces ' '.
    There is at least one word in s.

 */

public class ReverseWordsInAString {

    //Most Optimized Code -- 1 or 2 ms
    public String reverseWordsOptimised(String s) {
        char[] in = s.toCharArray();
        char[] out = new char[in.length + 1];
        int right = in.length - 1;
        int ind = 0;

        while (right >= 0){
            while (right >= 0 && in[right] == ' ') right--;
            if (right < 0) break;
            int rightWordIndex = right;
            while (right >= 0 && in[right] != ' ') right--;
            for (int k = right + 1; k <= rightWordIndex; k++ ) out[ind++] = in[k];
            out[ind++] = ' ';
        }
        return new String(out, 0, ind - 1);
    }

    //Runtime --> 7ms
    public String reverseWords(String s) {

        Stack<String> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int i=0;
        int length = s.length();

        /** Eliminating Leading Spaces */
        while(i<length && s.charAt(i) == ' '){
            i++;
        }


        while (i < length) {
            StringBuilder word = new StringBuilder();

            /** Build the word */
            while (i < length && s.charAt(i) != ' ') {
                word.append(s.charAt(i));
                i++;
            }
            if (word.length() > 0) {
                stack.push(word.toString());
            }
            /** Skip extra spaces */
            while (i < length && s.charAt(i) == ' ') {
                i++;
            }
        }

        // Pop words from the stack and concatenate with a single space
        while (!stack.isEmpty()) {
            result.append(stack.pop());
            if (!stack.isEmpty()) {
                result.append(" ");
            }
        }

        return result.toString();
    }


}
