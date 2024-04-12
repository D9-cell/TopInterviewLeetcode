package Hashmap;


import java.util.Arrays;

/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.
Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true

Constraints:
1 <= ransomNote.length, magazine.length <= 10^5
ransomNote and magazine consist of lowercase English letters.
 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {

        int[] ch_ransom = new int[26];
        int[] ch_magazine = new int[26];
        Arrays.fill(ch_ransom,0);
        Arrays.fill(ch_magazine,0);
        for (int i = 0; i < magazine.length(); i++) {
            char cur_ch = magazine.charAt(i);
            ch_magazine[cur_ch-97]++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char cur_ch = ransomNote.charAt(i);
            ch_ransom[cur_ch-97]++;
        }
        for (int i = 0; i < ch_ransom.length; i++) {
            if(ch_ransom[i]>ch_magazine[i]){
                return false;
            }

        }
        return true;
    }

    public boolean canConstructOptimum(String ransomNote, String magazine) {
        int[] count = new int[26];

        for(char ch:magazine.toCharArray()){
            count[ch - 'a']++;
        }
        for(char ch:ransomNote.toCharArray()){
            count[ch-'a']--;

            if(count[ch-'a'] < 0){
                return false;
            }
        }
        return true;
    }
}
