public class StringContains {
    public static boolean isStringContainedIn(String subString, String s) {
        if (s == null) {
            return false;
        }
        if (subString == null) {
            return false;
        }
        for (int i = 0; i < s.length() - subString.length() + 1; i++) {
            boolean isSubString = true;
            for (int j = 0; j < subString.length(); j++) {
                if (subString.charAt(j) != s.charAt(i + j)) {
                    isSubString = false;
                    break;
                }
            }
            if (isSubString) {
                return true;
            }
        }
        return false;
    }
}