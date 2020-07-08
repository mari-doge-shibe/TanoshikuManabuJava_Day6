package academy.learnprogramming;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Practice3 {
    // Kakugen1.javaを変更し、kakugen.txtの空行を無視するようにせよ
    public static void main(String[] args) {
        FileReader fr;
        BufferedReader br;
        String kakugenFile = "kakugen.txt";
        ArrayList<String> alst = new ArrayList<String>(4);
        String str, kakugen, ls;

        try {
            fr = new FileReader(kakugenFile);
            br = new BufferedReader(fr);
            while(( str = br.readLine()) != null) {
                if(!(str.equals(""))) {
                    alst.add(str);
                }
            }
            br.close();
            kakugen = (String)alst.get((int)(Math.random() * alst.size()));
            System.out.println(kakugen);
        } catch (FileNotFoundException e) {
            System.err.println("ファイルが見つかりませんでした");
        } catch (IOException e) {
            System.err.println("読み込めませんでした");
        }
    }

}
