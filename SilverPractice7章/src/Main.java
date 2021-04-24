
public class Main {
  public static void main(String[] args) {
    // 7章
    // 7-2 継承していても｢コンストラクタ｣｢privateなメンバ｣は引き継げない

    // 7-4 interfaceにデフォルトメソッドを記述することで、インターフェースに実装を実現できるようになった
    A a = new B();
    a.sample(); // sample Aと出力される

    // 7-9
    AbstractSample s_9 = new ConcreteSample();
    s_9.sample(); // A B Cと出力される

    // 7-13
    Worker worker = new Engineer();
    worker.work(); // workが出力される

    // 7-19
    Child child = new Child();
    child.name = "sample";
    System.out.println(child.getName()); // nullが出力される
    // childクラスにもnameを定義していることで、nameはchildクラスを利用している
    // しかし、getNameメソッドはparentクラスで戻り値はthis.name;よってここでのgetNameの戻り値はparentクラスのnameなのでnull

  }
}
