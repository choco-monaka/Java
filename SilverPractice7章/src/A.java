public interface A {

  // 7-4 interfaceにデフォルトメソッドを記述することで、インターフェースに実装を実現できるようになった
  default void sample() {
    System.out.println("sample A");
  }
}
