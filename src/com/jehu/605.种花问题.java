import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=605 lang=java
 *
 * [605] 种花问题
 */
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < flowerbed.length;) {
            int nums = 0;
            while(flowerbed[i]!=1){
                nums++;
                i++;
            }
            arrayList.add(nums);
            i++;
        }
        int sum = 0;
        for (int num : arrayList) {
            sum += num/3;
        }
        return sum>=n;
    }
}

