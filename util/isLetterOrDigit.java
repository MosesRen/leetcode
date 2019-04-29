/**
 * 功能判断一个字符是否是字母或数字
 */
class IsLetterOrDigit {
    public static boolean IsLetterOrDigit(char ch, String method) {
        boolean result = true;
        switch (method) {
        case "letter":
            result = isLetter(ch);
            break;
        case "digit":
            result = isDigit(ch);
            break;
        case "both":
            result = isDigit(ch) || isLetter(ch);
            break;
        }
        return result;
    }

    public static boolean isLetter(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    public static boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }
}