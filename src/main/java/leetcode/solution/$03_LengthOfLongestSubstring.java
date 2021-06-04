package leetcode.solution;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class $03_LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        ArrayList<Integer> maxLengths = new ArrayList<>();
        char[] input = s.toCharArray();
        HashSet<Character> bag = new HashSet<>();
        for (int i = 0;i < input.length;i++){
            if (!bag.contains(input[i])){
                //无重复
                maxLength += 1;
                bag.add(input[i]);
                if (i == input.length - 1)
                    maxLengths.add(maxLength);
            } else {
                //出现重复
                maxLengths.add(maxLength);
                i = i - maxLength;
                maxLength = 0;
                bag.clear();
            }
        }

        if (maxLengths.size() == 0)
            return s.length();
        else
            return maxLengths.stream().max((v1, v2) -> {
                return v1 - v2;
            }).get();
    }
}
