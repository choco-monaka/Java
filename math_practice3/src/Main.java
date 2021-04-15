
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // 問題１
    Scanner scanner = new Scanner(System.in);
    int a, b, c;
    System.out.println("3つの整数の最小値を求めます");
    System.out.print("aの値: ");
    a = scanner.nextInt();

    System.out.print("bの値: ");
    b = scanner.nextInt();

    System.out.print("cの値: ");
    c = scanner.nextInt();

    int min = method.min3(a, b, c);
    System.out.println("最小値は" + min + "です");

    // 問題２
    System.out.println("1からnまでの和をもとめます");
    System.out.print("nの値: ");
    int n = scanner.nextInt();
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
      // System.out.print(i + " ");
    }
    System.out.println("  1から" + n + "までの和は" + sum + "です");
    // 別の計算式
    // int sum1 = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // 和
    // System.out.println("1から" + n + "までの和は" + sum1 + "です。");

  }

}