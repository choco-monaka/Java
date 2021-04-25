import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.time.LocalDate;
// import java.rmi.Remote;
import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    // 9章

    // 9-1
    System.out.println(Math.pow(2, 3));

    // 9-2
    Sample[] samples = { new Sample(2, "B"), new Sample(3, "C"), new Sample(1, "A") };
    List<Sample> list = new ArrayList<>(Arrays.asList(samples));
    list.sort(new SampleComparator());
    for (Sample s : list) {
      System.out.println(s.getName());
    }

    // 9-3
    List<Integer> list_3 = Arrays.asList(new Integer[] { 1, 2, 3 });
    list_3.sort((a, b) -> -a.compareTo(b));
    for (Integer num : list_3) {
      System.out.println(num); // 3 2 1 の順
    }

    // 9-4
    char a_4 = '0';
    int num_4 = 0;
    if (Character.isAlphabetic(a_4)) { // 引数で受け取った文字が、アルファベットか否か
      num_4++;
    }
    if (Character.isDigit(a_4)) { // 引数で受け取った文字が、数字かどうか
      num_4++;
    }
    if (Character.isLowerCase(a_4)) { // 引数で受け取った文字が、小文字かどうか
      num_4++;
    }
    System.out.println(num_4); // 1 が出力される

    // 9-6
    LocalDate a_6 = LocalDate.of(2019, 8, 19);
    LocalDate b_6 = LocalDate.now();
    System.out.println(a_6 + " " + b_6);
    b_6.with(DayOfWeek.MONDAY);
    System.out.println(a_6.isBefore(b_6)); // a_6がb_6よりも前の日付を持っているか

    // 9-9
    ArrayList<String> list_9 = new ArrayList<>();
    list_9.add("A");
    // list_9.add(2, "B"); 例外エラーになる。追加する順番は0から始まる Aの後に追加するなら1,
    // Bになるのでコンパイルエラーではないが、例外エラー
    list_9.add("C");
    list_9.add("D");
    for (String str : list_9) {
      System.out.println(str);
    }

    // 9-11
    ArrayList<Item> list_11 = new ArrayList<>();
    list_11.add(new Item("A", 100));
    list_11.add(new Item("B", 200));
    list_11.add(new Item("C", 300));
    list_11.add(new Item("A", 100));
    list_11.remove(new Item("A", 500)); // equalsメソッドをオーバーライドしているので、nameが一致しているだけでok

    for (Item item : list_11) {
      System.out.println(item.getName()); // B C A と出力される
    }

    // 9-12
    System.out.println("---------9_12--------");
    ArrayList<String> list_12 = new ArrayList<>();
    list_12.add("A");
    list_12.add("B");
    list_12.add("C");
    for (String str : list_12) {
      if ("B".equals(str)) {
        list_12.remove(str); // 2番目のBが削除されるが、配列("C")が繰り上がるので、Aしか出力さない
      } else {
        System.out.println(str);
      }
    }
    // ArrayListはスレッドセーフではないクラスなので、削除後に再度読み込むと例外エラーになる
    for (String str : list_12) {
      System.out.println(str); // 本来なら例外エラーになる 発生しないけど
    }

    // 9-14
    var list_14 = List.of(1, 2, 3);
    // list_14.add(9); 要素を増やせないリストなので、例外エラーになる
    for (var var : list_14) {
      System.out.println(var);
    }

    // 9-19
    System.out.println("---------9_19--------");
    Map<Integer, Item> map = new HashMap<Integer, Item>();
    map.put(1, new Item(1, "A"));
    map.put(2, new Item(2, "B"));
    map.put(3, new Item(3, "C"));
    map.put(1, new Item(1, "D"));
    map.put(null, new Item(0, "default"));
    System.out.println(map.size()); // sizeメソッドはキーとバリューの組み合わせの数を戻す ４が出力される

  }
}
