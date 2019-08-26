import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=605 lang=java
 *
 * [605] 种花问题
 */
public class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length;i++) {
            if (nums[i]!=i+1) {
                result[1]=i+1;
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==nums[i+1]) {
                result[0]=nums[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Solution test = new Solution();
        int[] result = test.findErrorNums(new int[] {3,2,3,4,6,5});
        System.out.println(result[1]);
    }
}

