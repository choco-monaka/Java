import java.util.Random;

// 聖職者
public class Cleric {

  int name;

  int hp = 50;
  int mp = 10;

  final int MAX_HP = 50;
  final int MAX_MP = 10;

  public void selfAid() {
    this.mp -= 5;
    this.hp = this.MAX_HP;
  }

  public int pray(int sec) {
    int recover = new Random().nextInt(3) + sec;
    // 実際の回復遼の計算 最大値を超えないように、少ないほうを代入する mpが１しか減ったいないとき、ちゃんと1回復する
    int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
    this.mp += recoverActual;
    System.out.println("MPが" + recoverActual + "回復した!");
    return recoverActual;

  }

}
