/*
 * @lc app=leetcode.cn id=680 lang=java
 *
 * [680] 验证回文字符串 Ⅱ
 */
class Solution {
    public boolean validPalindrome(String s) {
      int i=-1,j=s.length();
      while(++i<--j){
          if(s.charAt(i)!=s.charAt(j)){
              return isPalindrome(s,i,j-1)||isPalindrome(s,i+1,j);
          }
      }
      return true;
    }
    
    private boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--))
                return false;
        }
        return true;
    }
}

