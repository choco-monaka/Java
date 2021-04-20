import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 入力パラメータを読み込む
    System.out.println("半角スペースを空けてください");
    String input = br.readLine();
    String[] param = input.split(" ");// 入力値を空白で分解する

    // 以下解答
    // 問題1 2つの整数の足し算
    // int num1 = Integer.parseInt(param[0]); // Stringのint型に変換
    // int num2 = Integer.parseInt(param[1]);
    // System.out.println(num1 + num2);

    // 問題2 2つの整数の四則演算
    // int num1 = Integer.parseInt(param[0]); // Stringのint型に変換
    // String type = param[1];
    // int num2 = Integer.parseInt(param[2]);

    // switch (type) {
    // case "+":
    // System.out.println(num1 + num2);
    // break;
    // case "-":
    // System.out.println(num1 - num2);
    // break;
    // case "*":
    // System.out.println(num1 * num2);
    // break;
    // case "/":
    // System.out.println(num1 / num2 + "余り..." + num1 / num2);
    // break;
    // }

    // 問題3
    String type = null;
    int total = 0;

    for (int i = 0; i < param.length; i++) {
      // 演算記号が入力された場合
      if (param[i].equals("+") || param[i].equals("-")) {
        type = param[i];
        // 演算記号以外 → 整数が入力された場合
      } else {
        int num = Integer.parseInt(param[i]);
        if (type != null) { //演算記号が格納されている場合
          if (type.equals("+")) { //+が格納されているなら、それまでの合計に、+に応じた計算をする
            total += num;
          } else if (type.equals("-")) { //-が格納されているなら、それまでの合計に、-に応じた計算をする
            total -= num;
          }
        } else {
          total = num;
        }
      }
    }
    System.out.println(total);

  }
}