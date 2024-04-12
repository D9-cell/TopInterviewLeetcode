package Hashmap;


import java.util.HashMap;

/*
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false

Constraints:
1 <= pattern.length <= 300
pattern contains only lower-case English letters.
1 <= s.length <= 3000
s contains only lowercase English letters and spaces ' '.
s does not contain any leading or trailing spaces.
All the words in s are separated by a single space.
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        if(words.length != pattern.length()){
            return false;
        }
        else{
            HashMap<Character , String > map = new HashMap<>();

            for (int i = 0; i < pattern.length(); i++) {
                char current_char = pattern.charAt(i);
                if(map.containsKey(current_char)){
                    if(!map.get(current_char).equals(words[i])){
                        return false;
                    }
                }else{
                    if(map.containsValue(words[i])){
                        return false;
                    }
                    map.put(current_char , words[i]);
                }
            }
            return true;
        }
    }
}
