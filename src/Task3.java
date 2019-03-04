public class Task3 {

    public static String reverseStr(String str) {
        String reversedStr = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }

        return reversedStr;
    }
}
