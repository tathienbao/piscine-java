public class StringReplace {
 public static String replace(String s, Object target, Object replacement) {
 // Check if the target and replacement are of type Character or String
 if (target instanceof Character && replacement instanceof Character) {
    return s.replace((Character) target, (Character) replacement);
        } else if (target instanceof String && replacement instanceof String) {
            return s.replace((String) target, (String) replacement);
        } else {
            return "Invalid input types for target and replacement";
        }
    }
}