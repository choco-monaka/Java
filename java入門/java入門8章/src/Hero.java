public class Hero {

  // クラスブロックの中に宣言された変数をjavaではフィールドという nameフィールド、hpフィールド
  String name;
  int hp;

  // オブジェクト指向に基づくメソッドには、普通staticを付けない
  public void sleep() {
    this.hp = 100;
    // thisとは自分自身のインスタンスのこと、5行目のhpのこと
    System.out.println(this.name + "は、眠って回復した!");
  }

  public void sit(int sec) {
    this.hp += sec;
    System.out.println(this.name + "は、" + sec + "秒座った!");
    System.out.println(this.hp + "が" + sec + "ポイント回復した!");
  }

  public void slip() {
    this.hp -= 5;
    System.out.println(this.name + "は、転んだ");
    System.out.println("5のダメージ !");
  }

  public void run() {
    System.out.println(this.name + "は、逃げ出した!");
    System.out.println("めのまえが、まっくらになった");
    System.out.println("最終HPは" + this.hp + "でした!");
  }
}
