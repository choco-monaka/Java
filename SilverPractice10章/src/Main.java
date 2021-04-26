public class Main {
  public static void main(String[] args) {
    // 10章

    // 10-1
    try {
      int[] array_1 = {};
      array_1[0] = 10;
      System.out.println("finish");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("error");
    } finally {
      System.out.println("例外処理の有無に関わらず、finallyは必ず実行される");
    }

    // 10-5
    System.out.println(test(null)); // AA B A の順番に出力 returnよりもfinallyのほうが優先度は高い

    // 10-6
    int result_6 = sample();
    System.out.println(result_6); // 20が出力される

    // 10-17
    // main(args); 再帰呼び出ししている最終的に｢StackOverflowError｣が発生する

  }

  private static String test(Object obj) {
    try {
      System.out.println(obj.toString());
    } catch (NullPointerException e) {
      System.out.println("AA");
      return "A";
    } finally {
      System.out.println("B");
    }
    return "C";
  }

  private static int sample() {
    try {
      throw new RuntimeException();
    } catch (RuntimeException e) {
      return 10; // returnを戻す変数があるイメージなので、10が先に入った後に、20が代入される よって20
    } finally {
      return 20;
    }
  }

}
