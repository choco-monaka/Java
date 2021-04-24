abstract class AbstractSample {

  public void sample() {
    System.out.println("A");
    test(); // ConcreteSampleのオーバーライドされたtestメソッドを呼び出している
    System.out.println("C");
  }

  protected abstract void test(); // 抽象メソッドは実装を持たないため、このクラスを継承したサブクラスでオーバーライドする必要がある

}