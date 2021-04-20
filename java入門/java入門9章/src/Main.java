public class Main {
  public static void main(String[] args) {

    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;

    Hero h1 = new Hero("minato");
    h1.sword = s; // swordフィールドに生成済みの剣インスタンスを代入 イメージは関連付けみたいなものか
    System.out.println("勇者" + h1.name + "を生み出しました。");
    System.out.println("現在の武器は" + h1.sword.name + "を装備しています。");

    Hero h2 = new Hero(); // 引数がないのでコンストラクタ２が呼び出される
    System.out.println("勇者" + h2.name + "を生み出しました。");

    Wizard w1 = new Wizard();
    w1.name = "monaka";
    w1.hp = 50;

    Matango m1 = new Matango();
    m1.hp = 50;
    m1.suffix = 'A';

    Matango m2 = new Matango();
    m2.hp = 48;
    m2.suffix = 'B';

    w1.heal(h1); // h1のhpを⑩回復させる
    w1.heal(h2);
    w1.heal(h2);

  }
}
