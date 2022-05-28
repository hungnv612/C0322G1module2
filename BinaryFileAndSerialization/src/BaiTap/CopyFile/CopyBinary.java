package BaiTap.CopyFile;

import java.io.*;

public class CopyBinary {
    public static void main(String[] args) {
        File source = new File("src/BaiTap/QuanLySanPham/hung.csv");
        File target = new File("src/BaiTap/CopyFile/new.csv");
        if (!source.exists()) {
            System.out.println("ko có file gốc");
        } else if (target.exists()) {
            System.out.println("File đã tồn tại");
        } else {
            int count = 0;
            try (FileInputStream inputStream = new FileInputStream(source);
                 BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                 FileOutputStream outputStream = new FileOutputStream(target);
                 BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream)) {
                byte[] buffer = new byte[1024];
                int length;
                while ((length = bufferedInputStream.read(buffer)) > 0) {
                    bufferedOutputStream.write(buffer, 0, length);
                    count++;
                }
                System.out.println("Number of bytes used: " + count + " byte.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
