// 抽象クラスになったので、このクラスはnew利用できない。
public abstract class Character {

  String name;
  int hp;

  public void run() {
    System.out.println(this.name + "は、逃げ出した!");
  }

  // Characterが必ず持つべき、メソッドだが処理内容が未確定なのでabstractを使用する。
  public abstract void attack(Matango m);

}
