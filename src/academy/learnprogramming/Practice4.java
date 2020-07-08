package academy.learnprogramming;

import java.io.*;

public class Practice4 {
    // キーボードから格言を１つ入力して、それをkakugen.txtに追加するプログラムを作成せよ
    public static void main(String[] args) {
        FileWriter fr;
        BufferedWriter bw;
        InputStreamReader isr;
        BufferedReader br;
        isr = new InputStreamReader(System.in);
        br = new BufferedReader(isr);

        try {
            fr = new FileWriter("kakugen.txt", true);
            bw = new BufferedWriter(fr);
            System.out.println("格言を入力してください。");
            String kakugen = br.readLine();
            bw.write(kakugen);
            bw.newLine();
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.err.println("書き込めませんでした");
        }


    }
}
