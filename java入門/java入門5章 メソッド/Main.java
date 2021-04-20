// import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // ソースコード内に複数のメソッドが定義されている場合、その順序に意味はない。
    hello();
    hello("YUK");
    hello("monaco");
    add(200, 300); // 実引数

    // 戻り値の例 呼び出し
    int ans2 = add2(100, 10);
    System.out.println("100 + 10" + " = " + ans2);

    // 練習問題
    double triangleArea = calcTriangleArea(10.0, 5.0);
    System.out.println("面積は" + triangleArea + "cmです");

  }

  public static void hello() {
    System.out.println("こんにちは");
  }

  // 引数の利用
  public static void hello(String name) {
    System.out.println("こんにちは" + name + "さん");
  }

  // 複数の引数
  public static void add(int x, int y) { // ここでのx,yは仮引数
    int ans = x + y;
    System.out.println(x + "+" + y + "=" + ans);
  }

  // 戻り値の例
  public static int add2(int x, int y) { // ここでのx,yは仮引数
    int ans2 = x + y;
    return ans2;
  }

  // 練習問題
  public static double calcTriangleArea(double bottom, double height) {
    double area = bottom * height / 2;
    return area;

  }
}
