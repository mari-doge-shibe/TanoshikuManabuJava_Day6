package academy.learnprogramming;

import java.io.*;

public class ConvEnc1 {
    public static void main(String[] args) {
        FileInputStream fis;
        InputStreamReader isr;
        BufferedReader br, keyIn;
        FileOutputStream fos;
        OutputStreamWriter osw;
        PrintWriter pw;
        String encode = "SJIS";
        String str;

        keyIn = new BufferedReader(new InputStreamReader(System.in));
        if (args.length != 2) {
            System.err.println("使い方：ConEnc1 file1 file2");
            System.exit(1);
        }
        System.out.println("文字コードを指定してください");
        System.out.println("1: ShiftJIS 2: EUC-JP 3: JIS");

        try {
            int enc = Integer.parseInt(keyIn.readLine());
            switch(enc) {
                case 1:
                    encode = "SJIS";
                    break;
                case 2:
                    encode = "EUC_JP";
                    break;
                case 3:
                    encode = "ISO2022JP";
            }

            fis = new FileInputStream(args[0]);
            isr = new InputStreamReader(fis, "JISAutoDetect");
            br = new BufferedReader(isr);
            fos = new FileOutputStream(args[1]);
            osw = new OutputStreamWriter(fos, encode);
            pw = new PrintWriter(new BufferedWriter(osw));
            while(( str = br.readLine()) != null) {
                pw.println(str);
            }
            keyIn.close();
            br.close();
            pw.close();
        } catch (FileNotFoundException e) {
            System.err.println("ファイルが見つかりませんでした");
        } catch (IOException e) {
            System.err.println("変換できませんでした");
        } catch (NumberFormatException e) {
            System.err.println("文字コードを整数で指定してください");
        }


    }
}
