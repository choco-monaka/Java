public class Main {
  public static void main(String[] args) {
    // 6章

    // 6-5
    Sample.num5 = 10; // クラス名.フィールド名 にすることでstaticなフィールドにアクセスできる。
    Sample s_5 = new Sample();
    Sample s2_5 = new Sample();
    s_5.num5 += 10; // staticな領域にある１つの変数を更新し続けている
    s2_5.num5 = 30;
    System.out.println(Sample.num5); // 30が出力される

    // 6-12
    Sample s12 = new Sample();
    double result12 = s12.divide12(10, 2); // sampleクラスのdivideメソッドで、戻り値をfloatにしている。よって左側互換性のあるdouble or float にする必要がある
    System.out.println(result12);

    // 6-21
    Sample s_21 = new Sample(); // B Aと出力される

    // 6-22
    System.out.println(Sample.num_22); // インスタンスを１つもない状態でこのコードを実行したら初期値である0が出力される

    // 6-24
    Sample s24 = new Sample();
  }

  // 6-10 メソッド定義について
  // アクセス修飾子 戻り値型 メソッド名(引数の型 引数名) { メソッドの処理; }
  // 戻り値を使用する場合必ずreturn文と型を合わせる必要がある 戻り値を何も戻さない場合はvoidを使用する
  int method_10(int num) {
    return num * 2; // 2.0にすると演算結果がdoubleになるのでコンパイルエラー
    // return System.out.println(num); コンパイルエラーになる
  }

  void method_10_2(int num) {
    System.out.println(num); // voidにすればok
  }
}
