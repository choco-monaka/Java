public class Hero {

  // クラスブロックの中に宣言された変数をjavaではフィールドという nameフィールド、hpフィールド
  String name;
  int hp;

  // コンストラクタ 引数に追加情報としてnameを受け取る
  public Hero(String name) {
    this.hp = 100;
    this.name = name;
  }

  // コンストラクタをオーバーロード
  public Hero() {
    this("ダミー"); // 上記のコンストラクタを呼び出している
  }

  // 剣クラスを定義したことにより、剣変数が使える 勇者が装備している剣の情報
  Sword sword;

  // オブジェクト指向に基づくメソッドには、普通staticを付けない
  public void sleep() {
    this.hp = 100;
    // thisとは自分自身のインスタンスのこと、5行目のhpのこと
    System.out.println(this.name + "は、眠って回復した!");
  }

  public void sit(int sec) {
    this.hp += sec;
    System.out.println(this.name + "は、" + sec + "秒座った!");
    System.out.println("HPが" + sec + "ポイント回復した!" + this.hp + "になった");
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
