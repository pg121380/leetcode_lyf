package leetcode.test;

import leetcode.solution.$03_LengthOfLongestSubstring;
import leetcode.solution.TwoSum;
import org.junit.Test;

import java.util.Arrays;

public class TestCase {
    @Test
    public void test(){
        String s = "aab";
        $03_LengthOfLongestSubstring solution = new $03_LengthOfLongestSubstring();
        System.out.println(solution.lengthOfLongestSubstring(s));;
    }
}
