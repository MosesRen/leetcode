import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=599 lang=java
 *
 * [599] 两个列表的最小索引总和
 */
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int nums = 0;
        for (int i = 0; i < flowerbed.length;i++) {
            if(flowerbed[i]!=0){
                if(nums!=0){
                    arrayList.add(nums);
                    nums = 0;
                }
            }else{
                nums++;
            }
        }
        int sum = 0;
        for (int num : arrayList) {
            sum += num/3;
        }
        return sum>=n;
    }
    public static void main(String[] args) {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        int [] flowerbed = {1,0,0,0,1,0,0};
        String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        Solution test = new Solution();
        boolean result = test.canPlaceFlowers(flowerbed, 2);
        System.out.println(result);
    }
}
