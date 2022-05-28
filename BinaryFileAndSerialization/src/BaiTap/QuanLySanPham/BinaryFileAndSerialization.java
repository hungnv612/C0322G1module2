package BaiTap.QuanLySanPham;

import java.io.*;

public class BinaryFileAndSerialization {
    public static void writerFileBinary(String path, Object obj) {
        File file = new File(path);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file, false);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(obj);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Object readFileBinary(String path) throws IOException {
        File file = new File(path);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        Object obj = null;
        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            obj = objectInputStream.readObject();
            return obj;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            fileInputStream.close();
        }
        return null;
    }
}
