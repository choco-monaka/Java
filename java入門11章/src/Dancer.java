// 抽象クラスのCharacterクラスを継承している
public class Dancer extends Character {

  public void dance() {
    System.out.println(this.name + "は、暑い踊りをした!");
  }

  // Characterクラスのabstractだったattackメソッドをオーバーライド オーバライドさせないと、エラーになる
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃");
    System.out.println("敵に3ポイントのダメージ");
    m.hp -= 3;
  }

}
