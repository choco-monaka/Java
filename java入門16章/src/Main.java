
// import java.util.Date;
// import java.util.Calendar;
// import java.util.*; 全てのクラスを使用する呪文的な？？
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {

    // いままでの配列
    String[] names = new String[3];
    names[0] = "tanaka ";
    names[1] = "suzuki ";
    // names[0] = "たなか";
    System.out.println(names[0] + names[1] + names[2]);

    // ArrayListを使用 ArrayListは後からデータを追加できる
    ArrayList<String> namesArray = new ArrayList<String>(); // ArrayListの準備
    namesArray.add("tanaka");
    namesArray.add("suzuki");
    namesArray.add("saitou");
    System.out.println(namesArray.get(1));

    // Integer型をArrayListに格納する場合は、Integerとする必要がある。 → ラッパークラスp611
    ArrayList<Integer> points = new ArrayList<Integer>();
    points.add(10);
    points.add(102);
    points.add(40);
    for (int i : points) { // 拡張for文(配列を取り出すためのfor文)も利用可能
      System.out.println(i);
    }
    System.out.println("------------ここからクリアしてみた-------------");
    // points.clear();
    points.remove(1);
    for (int i : points) { // 拡張for文(配列を取り出すためのfor文)も利用可能
      System.out.println(i);
    }
    System.out.println("---------------クリア終了---------------------");

    // イテレータを用いた配列の取り出し
    Iterator<String> it = namesArray.iterator(); // イテレータのインスタンスを生成
    while (it.hasNext()) { // イテレータの矢印を次に進められるなら繰り返す
      String e = it.next(); // 矢印を次に進め、内容を取り出す
      System.out.println(e);
    }

    // Setを使用した、要素の取り出し
    Set<String> colors = new HashSet<>();
    colors.add("red");
    colors.add("green");
    colors.add("blue");

    for (String s : colors) {
      System.out.println(s);
    }

    // Mapの使いかた キー と値をセットで保持するクラス
    Map<String, Integer> prefs = new HashMap<String, Integer>();
    prefs.put("京都府", 255);
    prefs.put("東京都", 1261);
    int tokyo = prefs.get("東京都"); // キーを指定し、値を取得
    System.out.println("東京都の人口は" + tokyo);

    prefs.put("東京都", 1262); // 値の上書き
    int tokyo2 = prefs.get("東京都"); // キーを指定し、値を取得
    System.out.println("東京都の人口は" + tokyo2);

    // Mapに格納された情報をfor文で1つずつ取り出す
    for (String key : prefs.keySet()) {
      int value = prefs.get(key); // 県名(キー)を指定し、値を取得
      System.out.println(key + "の人口は、" + value);
    }

    // 練習問題
    Hero h1 = new Hero("saitou");
    Hero h2 = new Hero("suzuki");
    ArrayList<Hero> heroes = new ArrayList<Hero>();
    heroes.add(h1);
    heroes.add(h2);
    for (Hero h : heroes) { // 拡張for文(配列を取り出すためのfor文)も利用可能
      System.out.println(h.getName()); // 作ったヒーローの名前をメソッドで表示
    }

    Map<Hero, Integer> monsterKill = new HashMap<Hero, Integer>();
    monsterKill.put(h1, 3);
    monsterKill.put(h2, 7);
    for (Hero key : monsterKill.keySet()) {
      int value2 = monsterKill.get(key);
      System.out.println(key.getName() + "が倒した敵=" + value2);
    }

  }
}
