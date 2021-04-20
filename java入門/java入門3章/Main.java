import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    boolean weather = false;
    if (weather == true) {
      System.out.println("晴れてるのでお出かけしよう");
    } else {
      System.out.println("雨なので家で映画を見る");
    }

    // 条件がtrueの場合、永遠に実行されてしまう。
    boolean doorClose = false;
    while (doorClose == true) {
      System.out.println("ノックする");
      System.out.println("1分待つ");
    }

    // 否定演算子 条件式が正しくないならtrue
    int age = 10;
    if (!(age == 10)) {
      System.out.println("年齢は10歳ではない");
    } else {
      System.out.println("else文 年齢は10歳です");
    }

    // switch文 1~5までの乱数
    int fortune = new java.util.Random().nextInt(5) + 1;
    System.out.println("あなたの運勢は" + fortune + "です");
    switch (fortune) {
    case 1:
    case 2:
      System.out.println("いいね");
      break;
    case 3:
      System.out.println("普通です");
      break;
    case 4:
    case 5:
      System.out.println("うーん...");
      break;
    }

    // do-while文 tempが25以上の場合は永遠に実行される
    int temp = 27;
    do {
      temp--;
      System.out.println("温度を1度下げました");
    } while (temp > 25);

    // for文基本
    for (int i = 0; i < 3; i++) {
      System.out.println((i + 1) + "回目のこんにちは");
    }

    // for文 九九
    for (int i = 1; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        System.out.print(i * j);
        // スペース空ける
        System.out.print(" ");
      }
      // 改行する
      System.out.println("");
    }

    // 練習問題

    // 条件式が奇数
    int c = 11;
    if (c % 2 == 1) {
      System.out.println("奇数だあああ");
    } else {
      System.out.println("偶数でーーーす");
    }

    // 文字列を条件式で等しいと記載する場合
    String name = "奏";
    if (name.equals("奏")) {
      System.out.println("名前一致");
    } else {
      System.out.println("名前不一致");
    }
    
    // switch問題
    Scanner scanner = new Scanner(System.in);
    System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更");
    int selected = scanner.nextInt();
    switch (selected) {
    case 1:
      System.out.println("検索します");
      break;
    case 2:
      System.out.println("登録します");
      break;
    case 3:
      System.out.println("削除します");
      break;
    case 4:
      System.out.println("変更します");
      break;
    }

    // for文ネスト問題
    int ans = new java.util.Random().nextInt(9);
    for (int i = 0; i < 5; i++) {
      System.out.println("0~9までの数字を入力してください");
      int num = scanner.nextInt();
      if (ans == num) {
        System.out.println("アタリ");
        break;
      } else {
        System.out.println("違います");
      }

    }
    System.out.println("ゲームを終了します");

    scanner.close();

  }

}
