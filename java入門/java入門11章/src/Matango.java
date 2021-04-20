public class Matango {

  int hp;
  final int LEVEL = 10; // finalを先頭につけると、値を変更できない定数フィールドになる
  char suffix;

  public Matango(char suffix) {
    this.suffix = suffix;
    System.out.println("キノコ" + this.suffix + " が誕生した！");
  }

  public void attack(Character h) {
    System.out.println("キノコ" + this.suffix + "の攻撃！");
    System.out.println("10のダメージ");
    h.hp -= 10;
  }

  public void run() {
    System.out.println("お化けキノコ" + this.suffix + "は、逃げ出した");
  }

}
