
public class Item {

  private String name;
  private int price;
  private int id;

  public Item(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public Item(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public boolean equals(Object obj) {
    if (obj instanceof Item) {
      Item tmp = (Item) obj;
      if (tmp.name.equals(this.name)) {
        return true;
      }
    }
    return false;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

}
