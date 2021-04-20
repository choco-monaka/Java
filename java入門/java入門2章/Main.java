import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = 5;
    int b = 3;
    int m = Math.max(a, b);
    System.out.println("比較実験" + a + "と" + b + "とで大きいほうは" + m);

    // 乱数を発生させる命令
    int r = new java.util.Random().nextInt(10);
    System.out.println(r);

    // キーボードから入力を受け付ける命令
    System.out.println("あなたの年齢を入力しろ");
    int age = scanner.nextInt();
    System.out.println("貴方の年齢は" + age + "歳です");

    // 練習問題 ()をつけることで計算の評価順位を上げ、文字列"510"ではなく、"15"として計算される
    int x = 5;
    int y = 10;
    String ans = "x+yは" + (x + y);
    System.out.println(ans);

    // 練習問題2
    System.out.print("ようこそ占いの館へ");
    System.out.println("あなたの名前を入力してください");
    String name = scanner.next();
    int fortune = new java.util.Random().nextInt(4);
    fortune++;
    System.out.println("占い結果が出ました");
    System.out.println(name + "さん、あなたの運気番号は" + fortune + "です");
    System.out.println("1:大吉 2:中吉 3:吉 4:大凶");

    scanner.close();

  }

}
