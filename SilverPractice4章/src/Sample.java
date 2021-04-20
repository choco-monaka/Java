public class Sample {

  private int num;
  private String name;

  public Sample(int num, String name) {
    this.num = num;
    this.name = name;
  }

  public Sample(int num) {
    this.num = num;
  }

  // equalsメソッドをオーバーライドすることで、同値であることの条件を定めている
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (obj instanceof Sample) {
      Sample s = (Sample) obj;
      return s.num == this.num; // name,num2つあるフィールドの内numの値だけ一致すれば同値としている
    }
    return false;

  }
}
