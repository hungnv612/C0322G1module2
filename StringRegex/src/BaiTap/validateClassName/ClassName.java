package BaiTap.validateClassName;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static final String CLASS_NAME_REGEX = "^[C|A|P]\\d{4}[G|H|I|K|L|M]$";

    public ClassName() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return ((Matcher) matcher).matches();
    }
//    ắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
//    Không chứa các ký tự đặc biệt
//    Theo sau ký tự bắt đầu là 4 ký tự số
//    Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M
}
