public class Main {
  public static void main(String[] args) {
    // 12章
    // 素数計算
    int x = 0;

    for (int i = 0; i <= 10; i++) {
      System.out.print(i + " ");

      for (int j = 0; j < i / 2; j++) {
        // if (i % i == 0) && {
        // x += i;
        // }
        System.out.print(j);
        System.out.println(" ");
      }
    }

  }
}
