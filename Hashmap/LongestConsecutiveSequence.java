package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        int longestLength = 0;
        Map<Integer , Boolean> map = new HashMap<>();
        for (int i:nums){
            map.put(i,false);
        }

        for(int num : nums){

            int currentLength = 1;

            int nextNum = num + 1;
            while(map.containsKey(nextNum) && !map.get(nextNum)){
                currentLength++;
                map.put(nextNum,true);
                nextNum++;
            }

            int prevNum = num - 1;
            while(map.containsKey(prevNum) && !map.get(prevNum)){
                currentLength++;
                map.put(prevNum,true);
                prevNum--;
            }
            longestLength = Math.max(longestLength,currentLength);
        }
        return longestLength;
    }

}
