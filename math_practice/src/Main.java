public class Main {
  public static void main(String[] args) {

    int x = 0;
    int sum = 0;

    for (int i = 1; i < 65; i++) {
      x = i * i * i * i;
      sum = x;
    }
    System.out.println(sum);

    // 2問目

    int a = 1234567890;
    int sum2 = 0;

    for (int i = 1; i <= 5000000; i++) {
      if (a % i == 0) {
        sum += i;
        // System.out.println(sum);
      }
      // System.out.println(sum);
    }
    System.out.println(sum2);

  }
}
