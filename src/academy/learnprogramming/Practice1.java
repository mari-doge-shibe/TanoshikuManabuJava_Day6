package academy.learnprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {
    // 6-1-5 Weight5.javaを変更し、キーボードから男性か女性かを入力させ、異なるBMIの値を使って計算するようにせよ
    public static void main(String[] args) {
        double bmi = 22;
        double weight, height;
        InputStreamReader isr;
        BufferedReader br;
        isr = new InputStreamReader(System.in);
        br = new BufferedReader(isr);

        try {
            System.out.println("身長（cm）を入力してください:");
            String ans = br.readLine();
            System.out.println("性別を選択してください（1: 男性、2: 女性）: ");
            String ans2 = br.readLine();
            int sex = Integer.parseInt(ans2);
            if((sex < 1) || (sex > 2)) {
                System.err.println("1か2を入力してください");
                System.exit(1);
            } else if (sex == 2) {
                bmi = 21;
            }

            height = Double.parseDouble(ans)/100;
            weight = height * height * bmi;
            System.out.println("身長：" + ans + "cm");
            System.out.println("体重：" + weight + "kg");

        } catch (IOException e) {
            System.err.println("値を読み込みませんでした");
        } catch (NumberFormatException e) {
            System.err.println("身長を数値で指定してください");
        }


    }


}
