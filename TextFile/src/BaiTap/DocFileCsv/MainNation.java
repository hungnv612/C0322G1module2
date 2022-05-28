package BaiTap.DocFileCsv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainNation {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        NationAdd nation = new NationAdd();
        int num;
        do {
            nation.add();
            System.out.println("Nhập: 0 để xuất 1 để tiếp tục");
            num =Integer.parseInt(scanner.nextLine());
        }while (num!=0);
        List<String[]> list =  ReadAndWriteFile.readerFile("src/BaiTap/DocFileCsv/file");//"src/BaiTap/DocFileCsv/Country"
        List<Produst> produsts = new ArrayList<>();
        for (String[] item : list){
            Produst produst = new Produst(Integer.parseInt(item[0]), item[1], item[2]);
            produsts.add(produst);
        }
        System.out.println("Danh sách các nước:");
        for (Produst item : produsts) {
            System.out.println(item);
        }
    }
}
