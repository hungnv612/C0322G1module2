package until;

import java.util.regex.Pattern;

public class Regex {
    public static boolean code(String str) {
        final String CODE_PRODUCT = "(ABC)-\\d{5}";
        Pattern pattern = Pattern.compile(CODE_PRODUCT);
        return pattern.matcher(str).matches();
    }
    public static boolean codeQl(String str) {
        final String CODE_PRODUCT = "(VIP)-\\d{5}";
        Pattern pattern = Pattern.compile(CODE_PRODUCT);
        return pattern.matcher(str).matches();
    }
    public static boolean date(String str) {
        final String DATE_PRODUCT = "^\\d{1,2}/\\d{1,2}/\\d{4}$";
        Pattern pattern = Pattern.compile(DATE_PRODUCT);
        return pattern.matcher(str).matches();
    }



}
