package academy.learnprogramming;

import com.sun.deploy.util.SyncFileAccess;

import java.io.*;

public class Practice5 {
    // Copy2.javaをBufferedInputStreamとBufferedOutputStreamを使用してバッファリングを行うように変更せよ

    public static void main(String[] args) {
        BufferedInputStream bis;
        BufferedOutputStream bos;

        int len;
        byte buf[] = new byte[256];
        if(args.length != 2) {
            System.err.println("使い方：Java Q6_5a file1 file2");
            System.exit(1);
        }

        try {
            bis = new BufferedInputStream(new FileInputStream(args[0]));
            bos = new BufferedOutputStream(new FileOutputStream(args[1]));
            while((len = bis.read(buf)) != -1) {
                bos.write(buf);
            }
            bis.close();
            bos.flush();
            bos.close();
        } catch (FileNotFoundException e) {
            System.err.println("ファイルが見つかりませんでした");
        } catch (IOException e) {
            System.err.println("コピーできませんでした");
        }
    }
}
