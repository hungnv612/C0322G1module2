package until;

import java.util.Scanner;

public class FacilitylUntil {
    public static String romStandard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập dịch vụ: \n" +
                "1.VIP\n" +
                "2.Normal");
        do {
            int input = Integer.parseInt(scanner.nextLine());

            switch (input) {
                case 1:
                    return "VIP";
                case 2:
                    return "Normal";

                default:
                    System.out.println("ko có chức năng này mời nhập lại");
            }
        } while (true);
    }
}
