// import java.util.ArrayList;
public class Main {
  public static void main(String... args) {
    // java .\src\Main.java a \" a\" "a "b c とすると起動パラメータは5つになる
    int sum = 0;
    for (int i = 0; i < args.length; i++) {
      System.out.print(args[i] + ",  ");
      sum++;
    }
    if (args.length == 0) {
      System.out.println("起動ハラメータは0です");
    } else {
      System.out.println("起動パラメータは<" + sum + ">個です");
    }

    String str = "aaaa";
    System.out.println(str.replace("aa", "b"));

    int a = 544;
    int b = 0x32; // 0xから始まってるので、が16進数→ok
    int c = 0727; // 0から始まっている8進数(07までが8進数 08はエラーになる)
    System.out.println(a + " " + b + " " + c);

    char ch = 89;
    System.out.println(ch);

    // 2章８
    var a_8 = new B(); // == B a_8 = new B() と同じ
    // a = new C(); Varによる型推論はコンパイル時に行われる。なので、この行はコンパイルエラーとなる
    a_8.test();

    // 2章 12 13 16
    String str_12 = "abcde";
    System.out.println(str_12.indexOf("abcdef")); // 文字列または文字で位置を検索できる存在しなければ｢-1｣が返却
    System.out.println(str_12.substring(2, 4)); // 0から始まるので、2~4の抽出すると「cd」となる
    System.out.println(str_12.substring(1, 3).startsWith("b")); // startsWithは引数の文字列で始まるかどうか「true/false」で帰ってくる

    // 2章17 concatはStringに用意されているメソッドで、インスタンスに保持されている文字列と引数の文字列を直結して、新しい文字列として戻すメソッド
    String str_17 = "Hello, ".concat("Java!");
    System.out.println(str_17);

    // 2章18 注意ポイント
    String str_18_1 = 10 + 20 + "a"; // 30a になる
    String str_18_2 = "a" + 10 + 20; // a1020 になる
    System.out.println(str_18_1 + " " + str_18_2);

    // 2章20 StringBuilderはデフォルトで｢16文字｣分のバッファを持っている＋文字列の長さ ＝答え
    StringBuilder sb = new StringBuilder("abcde");
    System.out.println(sb.capacity()); // 21 capacityはStringBuilderクラスで使用できる

    // 2章21
    StringBuilder sb_21 = new StringBuilder();
    sb_21.append("abcde"); // StringBuilderクラスのappendは、文字列に新しい文字列を追加するメソッド
    sb_21.reverse(); // 反転させたので "edcba"
    sb_21.replace(1, 3, "a"); // 1~3の｢dc｣という文字列を｢a｣に置き換え
    System.out.println(sb_21);

    // 2章22 indexOfは引数の文字列が始まる位置を調べるメソッド
    StringBuilder sb_22 = new StringBuilder("abcde");
    System.out.println(sb_22.indexOf("bcd"));

  }
}
