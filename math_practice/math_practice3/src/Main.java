
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

    // 問題3
    int a3 = 0;
    int b3 = 0;
    int sum3 = 0;
    System.out.println("------------問題3------------");
    System.out.print("a3の値: ");
    a3 = scanner.nextInt();
    System.out.print("b3の値: ");
    b3 = scanner.nextInt();

    if (a3 < b3) {
      for (int i = a3; i <= b3; i++) {
        System.out.print(i + " ");
        sum3 += i;
      }
      System.out.println("...." + a3 + "から" + b3 + "までの和は" + sum3 + "です");
    } else if (b3 < a3) {
      for (int i = b3; i <= a3; i++) {
        System.out.print(i + " ");
        sum3 += i;
      }
      System.out.println("...." + b3 + "から" + a3 + "までの和は" + sum3 + "です");
    }

  }

}