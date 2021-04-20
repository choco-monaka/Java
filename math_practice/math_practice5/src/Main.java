
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 問題1 n段のピラミッド作成
    System.out.print("何段のピラミッドを作成しますか？: ");
    int a = scanner.nextInt();

    for (int i = 1; i <= a; i++) {
      for (int x = 1; x <= a - i - 1; x++) {
        System.out.print(" ");
      }
      for (int x = 1; x <= (i - 1) * 2 + 1; x++) {
        System.out.print("*");
      }
      System.out.println(""); // 改行目的
    }

    // // 問題2 n段の数字ピラミッド作成
    // System.out.print("何段の数字ピラミッドを作成しますか？: ");
    // int a2 = scanner.nextInt();
    // int y = 1;

    // for (int i = 1; i <= a2; i++) {
    // for (int x = 1; x <= a2 - i - 1; x++) {
    // System.out.print(" ");
    // }
    // for (int x = 1; x <= (i - 1) * 2 + 1; x++) {
    // System.out.print(y);
    // }
    // System.out.println(""); // 改行目的
    // y++;
    // }

  }
}
