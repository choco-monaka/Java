public class Hero {
  private int hp;
  private String name;

  public int getHp() {
    return this.hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
    System.out.println(this.name + "が誕生した");
  }

  // コンストラクタ
  public Hero(String name) {
    this.hp = 100;
    this.name = name;
    System.out.println(this.name + "が誕生した");
  }

  public Hero() {
    this.hp = 100;
    this.name = "ダミー";
    System.out.println(this.name + "が誕生した");
  }

}
