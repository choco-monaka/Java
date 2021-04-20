public class Matango {

  int hp;
  final int LEVEL = 10; // finalを先頭につけると、値を変更できない定数フィールドになる
  char suffix;

  public void run() {
    System.out.println("お化けキノコ" + this.suffix + "は、逃げ出した");
  }

}
