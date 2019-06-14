/*
 * @lc app=leetcode.cn id=400 lang=java
 *
 * [400] 第N个数字
 */
class Solution {
    public int findNthDigit(int n) {
        StringBuffer stringBuffer = new StringBuffer();
        int i =1;
        while(stringBuffer.length()<n){
            stringBuffer.append(i++);
        }
        System.out.println(stringBuffer.toString());
        return Integer.parseInt(String.valueOf(stringBuffer.charAt(n-1)));
    }
}

