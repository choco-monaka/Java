public class Main {
  public static void main(String[] args) {

    // 3章問題
    int num_2 = -10;
    System.out.println(10 * -num_2); // -num_2 = - * -10 になる

    // 演算子の両方のオペランドは同じ型でないといけない。型が小さいものは自動的に大きいものに変換される
    // 今回はLong型のほうが、大きいのに代入先がintになっている ↓
    // int i_2 = 2 * 3L; コンパイルエラー
    long i_2b = 2 * 3L;
    System.out.println(i_2b);

    // byte型は-128 ~ 127 の範囲
    // short型は-32768 ~ 32767 の範囲

    int var1 = 8;
    int var2;
    int var3 = 8;
    int var4;

    System.out.println("var1= " + var1);
    var2 = var1++;
    System.out.println("var1= " + var1);
    System.out.println("var2= " + var2); // 8が出力される var1++ で先に8がvar2に代入された後 var1+1になる
    System.out.println("var3= " + var3);
    var4 = ++var3;
    System.out.println("var3= " + var3); // 9が出力される ++var3 で先に1+var3が始まり、 ver4に9が代入され var3にも9が代入
    System.out.println("var4= " + var4);

    int b_6 = 10;
    if (10 < b_6++) { // b_6++ の場合先に10 < 10の計算が始まる ++b_6だと先に1+10の計算が始まる
      System.out.println("if文実行しました");
    } else {
      System.out.println("else文実行しました");
    }

    // 3-8 同一判定
    Sample s1_8 = new Sample(10);
    Sample s2_8 = s1_8; // この段階では全く同じ同一だが、次の行で新たにインスタンスを作りs1_8に代入しているので、結果同一ではなくなる
    s1_8 = new Sample(10);
    System.out.println(s1_8 == s2_8);

    // 3-9 同値判定
    System.out.print("3-9問題: ");
    Sample a_9 = new Sample(10, "a");
    Sample b_9 = new Sample(10, "b");
    System.out.println(a_9.equals(b_9));

    // 3-11
    Object a_11 = new Object();
    Object b_11 = null;
    System.out.println(a_11.equals(b_11)); // null以外の参照権xについてx.equals(null)はfalseを返すこと

    // 3-12 3-13
    System.out.println("---------3-12-----------");
    String a_12 = "sample";
    String b_12 = "sample";
    System.out.println(a_12 == b_12); // コード中に同じ文字列リテラルが登場した場合、同じStringクラスへの参照が使いまわされる よって==演算子を使用して同一性を判定した場合｢true｣
    System.out.println(a_12.equals(b_12));
    // しかしnew演算子を使って明示的にインスタンスを作成した場合は異なる参照を持つ
    String c_12 = new String("sample");
    System.out.println(c_12 == b_12); // false
    System.out.println(c_12.equals(b_12)); // true

    // 3-14 internメソッドを使用して参照権を戻す
    System.out.println("---------3-14-----------");
    String str1_14 = new String("def");
    String str2_14 = new String("def");
    System.out.println(str1_14 == str2_14); // false
    System.out.println(str1_14.intern() == str2_14.intern()); // true
    System.out.println(str1_14.intern() == str2_14); // false
    System.out.println(str1_14.intern() == "def"); // true

    // 3-21 case式
    int num_21 = 1;
    switch (num_21) {
    case 1: // num_21は｢1｣なので、この条件が当てはまる。しかしbreakがないのでそのまま全ての処理が実行される
    case 2:
    case 3:
      System.out.println("A");
    case 4:
      System.out.println("B");
    default:
      System.out.println("C");
    }

  }
}
