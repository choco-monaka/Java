import java.util.Date;
import java.util.Calendar;

public class Main {
  public static void main(String[] args) {

    // 処理時間計測スタート long型
    long start = System.currentTimeMillis();

    String s = "Java";
    if (s.matches("Java")) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    // 任意の1文字であればよい . の箇所
    if (s.matches("J.va")) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    // 直前文字の0回以上の繰り返し
    if ("Jaaaaaaava".matches("Ja*va")) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    // ".*" という正規表現は、「任意の1文字を0回以上繰り返し」という意味 → つまり「全ての文字列を許すということ」
    if ("あいうxx019".matches(".*")) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    // String splitメソッド 1つの文字列を分割できる
    String x = "abc,def;ghi";
    String[] words = x.split("[,;]");
    for (String w : words) {
      System.out.print(w + "->");
    }

    // 計測終了
    System.out.println("");
    long end = System.currentTimeMillis();
    System.out.println("処理にかかった時間は... " + (end - start) + "ミリ秒でした");

    // 現在日時
    Date now = new Date();
    System.out.println(now);

    // 6つのint値とDate型の相互変換
    System.out.println("--------------------------------------");
    Calendar c = Calendar.getInstance();
    // 6つのint値からDateインスタンスを生成
    c.set(2019, 8, 22, 1, 23, 45);
    c.set(Calendar.MONTH, 9);
    Date d = c.getTime();
    System.out.println(d);

    // Dateインスタンスからint値を生成
    Date now1 = new Date();
    c.setTime(now1); //cに現在の年月日を代入
    int y = c.get(Calendar.YEAR); //YEARだけ取り出す
    System.out.println("今年は" + y + "年です");

  }
}
