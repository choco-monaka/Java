
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // 問題1
    for (int i = 1; i <= 9; i++) {
      // System.out.print(i + " ");
      System.out.println("\n---+---------------------------");
      for (int x = 1; x <= 9; x++) {
        System.out.print(i + "+" + x + " ");
      }
    }

    // 問題2
    Scanner scanner = new Scanner(System.in);
    System.out.println("正方形を表示します");
    System.out.print("段数は: ");
    int a = scanner.nextInt();
    System.out.println("--------------------------------");
    for (int i = 1; i <= a; i++) {
      for (int x = 1; x < a; x++) {
        System.out.print(" ");
        System.out.print("*");
      }
      System.out.println(" " + "*");
    }
    scanner.close();

  }
}