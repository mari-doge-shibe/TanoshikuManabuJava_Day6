package academy.learnprogramming;

import java.io.*;

public class Practice2 {
    // FileRead2.javaを変更し、6-2-3のFileRead3.javaのように各行の先頭に行番号を表示せよ
    // LineNumberReaderを使用せずにBufferedReaderクラスのみで実装
    // To read a file successfully, place the file directly under Day6 folder and specify only the file name in the arguments field

    public static void main(String[] args) {
        FileReader fr;
        BufferedReader br;
        String str;

        if(args.length != 1) {
            System.err.println("ファイル名を指定してください");
            System.exit(1);
        }



        try {
            fr = new FileReader(args[0]);
            br = new BufferedReader(fr);
            int i = 1;
            while ((str = br.readLine()) != null) {
                System.out.println(i + ":");
                i++;
                System.out.println(str);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("ファイルが見つかりませんでした");
        } catch (IOException e) {
            System.err.println("書き込めませんでした。");
        }


    }

}
