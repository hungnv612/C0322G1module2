package BaiTap.ValidatePhoneNumber;

import java.util.Scanner;

public class PhoneNumberTest {
    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input phone number: ");
        String numberPhone = scanner.nextLine();
        boolean isValid = phoneNumber.validate(numberPhone);
        System.out.println("Phone number is " + isValid);
    }
}
