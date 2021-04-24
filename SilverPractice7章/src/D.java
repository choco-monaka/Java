public interface D extends A, C {

  // 7-7 インターフェースを多重継承した場合、A Cどちらのsample()メソッドを継承するか 記述しないとエラーになる
  @Override
  default void sample() {
    A.super.sample(); // インターフェース名.super.メソッド名
  }
}
