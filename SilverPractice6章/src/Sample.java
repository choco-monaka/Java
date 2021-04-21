
public class Sample {

  static int num5 = 0;
  static int num_22; // 6-22

  // 6-12
  float divide12(int a, int b) {
    return (float) a / (float) b;
  }

  // 6-21 6-22 6-24
  public Sample() {
    // System.out.println("A");
    // int num_22 = 100;
    this(null, 0); // 別のコンストラクタを呼び出している 呼び出す際に別の定義があるとコンパイルエラーになる 14,15
  }

  public Sample(String str, int num) {
    System.out.println("ok");
  }

  // 初期化式 初期化子はすべてのコンストラクタで共通する前処理を記述するために使用します。そのため、初期化子はコンストラクタが実行される前に実行される
  {
    System.out.println("B");
    num_22 = 10; // 6-22
  }

}
