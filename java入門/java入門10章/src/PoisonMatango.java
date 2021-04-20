import javax.swing.text.Position;

public class PoisonMatango extends Matango {

  int PoisonCount = 5;

  // コンストラクタ部分
  public PositionMatango(char suffix) {
    super(suffix); //コンストラクタの先頭で、親インスタンスのコンストラクタを呼び出す }
  }

  public void attack(Hero h) {
    super.aattack(h); //親クラスのメソッド
    if (this.PoisonCount > 0) {
      System.out.println("さらに毒の胞子をばらまいた！")
      int damage = h.hp / 5;
      h.hp -= damage;
      System.out.println(damage + "ポイントのダメージ!");
      this.PoisonCount--;
    }
  }

}
