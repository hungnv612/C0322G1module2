package BaiTap.DocFileCsv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NationAdd {
    public void add() throws IOException {
        ArrayList<Produst> list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Code");
        String code = scanner.nextLine();
        System.out.println("Nhập Name");
        String name = scanner.nextLine();
        Produst produst = new Produst(id, code, name);
        String line = produst.getId()
                + "," + produst.getCode()
                + "," + produst.getName();
        ReadAndWriteFile.writeFile("src/BaiTap/DocFileCsv/File", line);
        System.out.println("đã thêm thành công");

    }
}
