package until;

import java.util.Scanner;

public class CustomerUntil {
    static Scanner scanner = new Scanner(System.in);
    public static String classify() {
        System.out.println("Nhập classify: \n" +
                "1.Diamond\n" +
                "2.Platinium\n" +
                "3.Gold\n" +
                "4.Silver\n" +
                "5.Member\n" );
        do {
            int input = Integer.parseInt(scanner.nextLine());

            switch (input) {
                case 1:
                    return "Diamond ";
                case 2:
                    return "Platinium";
                case 3:
                    return "Gold";
                case 4:
                    return "Silver";
                case 5:
                    return "Member";
                default:
                    System.out.println("ko có chức năng này mời nhập lại");
            }
        } while (true);
    }
}
