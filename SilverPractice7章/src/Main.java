
public class Main {
  public static void main(String[] args) {

    // ここから問題
    // 1234567890 の正の約数のうち、500000以下のものを全て足し合わせたときの和を求める
    int x = 1234567890;
    int total = 0;
    for (int i = 0; i < 500000; i++) {
      if (x % i == 0) {
        total = total + i;
      }
    }

    System.out.println(total);

  }
}
