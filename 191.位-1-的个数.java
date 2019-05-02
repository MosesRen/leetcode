/*
 * @lc app=leetcode.cn id=191 lang=java
 *
 * [191] 位1的个数
 */
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int times = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1)==1) {
                times++;
            }
            n>>=1;
        }
        return times;
    }
}
