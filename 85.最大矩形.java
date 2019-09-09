/*
 * @lc app=leetcode.cn id=85 lang=java
 *
 * [85] 最大矩形
 */
class Solution {
    public int maximalRectangle(char[][] matrix) {
        
    }
}

public static int schedule(int[] arr, int num) {
  if (arr == null || arr.length == 0 || num < 1) {
  throw new RuntimeException("err");
  }
  if (arr.length < num) {
  int max = Integer.MIN_VALUE;
  for (int i = 0; i != arr.length; i++) {
  max = Math.max(max, arr[i]);
  }
  return max;
  } else {
  int minSum = 0;
  int maxSum = 0;
  for (int i = 0; i < arr.length; i++) {
  maxSum += arr[i];
  }
  while (minSum != maxSum - 1) {
  int mid = (minSum + maxSum) / 2;
  if (getNeedNum(arr, mid) > num) {
  minSum = mid;
  } else {
  maxSum = mid;
  }
  }
  return maxSum;
  }
  }

public class Main{
    public static int getNeedNum(int[] arr, int lim) {
        int res = 1;
        int stepSum = 0;
        for (int i = 0; i != arr.length; i++) {
        if (arr[i] > lim) {
        return Integer.MAX_VALUE;
        }
        stepSum += arr[i];
        if (stepSum > lim) {
        res++;
        stepSum = arr[i];
        }
        }
        return res;
        }
        public static void main(String[] args){
               Scanner in = new Scanner(System.in);
               int m = in.nextInt();
               int size  = in.nextInt();
               int[] array = new int[size];
               for(int i = 0; i < size; i++) {
                   array[i] = in.nextInt();
               }
               
               System.out.println(schedule(array,m));    
           }
        }
      
}

