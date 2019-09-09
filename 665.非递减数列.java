/*
 * @lc app=leetcode.cn id=665 lang=java
 *
 * [665] 非递减数列
 */
class Solution {
    public static boolean checkPossibility(int[] nums){
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<nums[i-1]){
                if(count==1) return false;
                if((i-2>=0)&&nums[i]<nums[i-2]){
                    nums[i]=nums[i-1];
                }
                count++;
            }
        }
        return true;
    }
}

