class Solution {
    public String reverseStr(String s, int k) {
        for (int i = 0; i < s.length(); i = i + 2 * k) {
            if (s.length() - i < k) {
                s = reverseString(s, i, s.length() - 1);
            } else {
                s = reverseString(s, i, i + k-1);
            }
        }
        return s;
    }

    public String reverseString(String str, int start, int end) {
        char[] chars = str.toCharArray();
        for (int i = start, j = end; i < j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        String result = test.reverseStr("abcdefg", 2);
        System.out.println(result);
    }
}