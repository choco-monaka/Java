public class Wizard {
  String name;
  int hp;

  // 引数に、作成したクラス(Hero型)を指定できる
  public void heal(Hero h) {
    h.hp += 10;
    System.out.println(this.name + "は、回復魔法を唱えた! " + h.name + "のHPを10回復した!");
  }

}
