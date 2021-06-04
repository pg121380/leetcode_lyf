package leetcode.easy;

import org.junit.Test;

import java.util.HashMap;

public class $01_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = {0, 1};
        if (nums.length == 2) {
            return result;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i], i);
        }
        for(int j = 0;j < nums.length;j++){
            if (map.containsKey(target - nums[j])){
                result[0] = j;
                result[1] = (Integer)map.get(target - nums[j]);
                if (result[0] != result[1]) {
                    break;
                }
            }
        }
        return result;
    }
}
