// 有形資産クラス　親クラスのAsset　インターフェースのThingを多重継承させる
public abstract class TangibleAsset extends Asset implements Thing {

  String color;
  double weight;

  public TangibleAsset(String name, int price, String color) {
    super(name, price);
    this.color = color;
  }

  public double getWeight() {
    return this.weight;
  }

  public double setWeight(double weight) {
    return this.weight;
  }

}
