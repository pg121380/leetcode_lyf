package leetcode.test;

import leetcode.median.$03_LengthOfLongestSubstring;
import org.junit.Test;

public class TestCase {
    @Test
    public void test(){
        String s = "aab";
        $03_LengthOfLongestSubstring solution = new $03_LengthOfLongestSubstring();
        System.out.println(solution.lengthOfLongestSubstring(s));;
    }
}
