package SlidingWindow;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
      int i=0;
      int j=0;
      int max = 0;
      HashSet<Character> hashSet = new HashSet<>();

      while(j < s.length()){
          if(!hashSet.contains(s.charAt(j))){
              hashSet.add(s.charAt(j));
              j++;
              max = Math.max(hashSet.size(),max);
          }else{
              hashSet.remove(s.charAt(i));
              i++;
          }
      }
      return max;
    }


}

class Solution {
    public int lengthOfLongestSubstring(String s) {

        int len = s.length();
        int[] last = new int[128];
        Arrays.fill(last,-1);

        int start = 0;
        int res = 0;
        for(int i = 0; i < len; i++){
            int index = s.charAt(i);
            start = Math.max(start, last[index]+1);
            res = Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;

    }
}

// maintain a map where you keep character with index
// you start with i =0
// if you get that character in the map find the length by end- start
// get the start to maps I+1
// and end keeps growing
