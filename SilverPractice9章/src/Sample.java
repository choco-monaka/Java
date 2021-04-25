public class Sample {

  private int id;
  private String name;

  public Sample(int id, String name) {
    super();
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int compareTo(Sample b) {
    return 0;
  }

}
