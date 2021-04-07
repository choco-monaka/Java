public class Main {
  public static void main(String[] args) {
    int a = 5;
    int b = 3;
    int m = Math.max(a, b);
    System.out.println("比較実験" + a + "と" + b + "とで大きいほうは" + m);
    
    // 乱数を発生させる式
    int r = new java.util.Random().nextInt(10);
    System.out.println(r);
  }

}
