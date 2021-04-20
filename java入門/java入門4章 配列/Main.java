import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // 初期化されてない変数を利用(エラー文)
    // int x;
    // System.out.println(x);

    // 配列は自動的に初期化される
    int[] scores = new int[5];
    // int型の場合、初期値0が格納されている
    System.out.println(scores[4]);

    // String型の場合 初期値nullが格納
    String[] words = new String[3];
    System.out.println(words[2]);

    // 省略した書き方
    int[] scores1 = new int[] { 20, 30, 40, 50, 60 };
    System.out.println(scores1[2]);

    // for文配列 lengthは要素の回数を集計
    System.out.println("--------------------");
    int[] scores2 = new int[] { 20, 30, 40, 50, 60 };
    for (int i = 0; i < scores2.length; i++) {
      System.out.println(scores2[i]);
    }

    // for文配列ループ集計
    int sum = 0;
    int[] scores3 = new int[] { 20, 30, 40, 50, 60 };
    for (int i = 0; i < scores3.length; i++) {
      sum += scores3[i];
    }
    System.out.println("5つのスコア合計は" + sum + "点です");

    // for文配列 情報の利用
    int[] scores4 = new int[] { 20, 30, 40, 50, 60 };
    int count = 0;
    for (int i = 0; i < scores4.length; i++) {
      if (scores4[i] >= 50) {
        count++;
      }
    }
    System.out.println("50点以上の科目は" + count + "教科ありました。");

    // 配列番号を利用した問題
    int[] seq = new int[10];
    for (int i = 0; i < seq.length; i++) {
      seq[i] = new java.util.Random().nextInt(4); // ランダムな整数を生成
      char[] base = { 'A', 'B', 'C', 'D' }; // 出力させたい4つの記号
      System.out.print(base[seq[i]] + " "); // ランダムな整数の配列番号に沿った 記号を出力
    }

    // int[] などを参照型変数という
    System.out.println("");
    int[] array = { 1, 2, 3 };
    System.out.println(array[0]);
    // 参照にnullを入れることで、参照を切ることができるなので以下は例外エラーになる
    // array = null;
    // System.out.println(array[0]);

    // 多次元配列
    System.out.println("-----------多次元配列---------");
    int[][] numbers = { { 40, 50, 60 }, { 80, 60, 70 } }; // このような初期化ができる
    System.out.println(numbers.length);
    System.out.println(numbers[0].length);

    // 練習問題
    int[] moneyList = { 121902, 8302, 55100 };
    for (int i = 0; i < moneyList.length; i++) {
      System.out.println(moneyList[i]);
    }
    // 拡張for文
    for (int value : moneyList) {
      System.out.println(value);
    }

    int[] points = { 3, 4, 9 };
    System.out.println("1桁の数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    for (int n : points) {
      if (n == input) {
        System.out.println("アタリ!");
        break;
      }
    }
    System.out.println("ゲーム終了");

  }
}
