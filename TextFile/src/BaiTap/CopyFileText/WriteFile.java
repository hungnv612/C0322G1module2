package BaiTap.CopyFileText;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        File fileIndex = new File("src/BaiTap/CopyFileText/index");

        File fileCopy = new File("src/BaiTap/CopyFileText/copy");

        if (!fileIndex.exists()) {
            System.out.println("file nguồn chưa tồn tại");
        } else if (fileCopy.exists()) {
            System.out.println("file copy đã tồn tại");
        } else {
            String line;
            try (FileReader fileReader = new FileReader(fileIndex);
                 BufferedReader bufferedReader = new BufferedReader(fileReader);
                 FileWriter fileWriter = new FileWriter(fileCopy);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                while ((line = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
