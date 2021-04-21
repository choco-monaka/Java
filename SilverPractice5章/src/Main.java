public class Main {
  public static void main(String[] args) {

    // 5章配列
    // 配列を扱うにはほかのオブジェクト同様にnew を使用する new時に配列の要素数を指定する [] を使用して、配列型変数であることを表す

    // 配列型変数の宣言
    int[] array;
    array = new int[0]; // 要素数0でもエラーにはならない
    System.out.println(array); // 参照先にある配列インスタンス(この場合はarray)のtoStringメソッドを呼び出して結果を表示する →ハッシュコードが出力される

    // 全てのインスタンスは、どのクラスから作られたのかという｢生成元の情報｣を所持している。以下のコードで配列がクラスから作られたコードであることを確かめることができる。
    Class clazz = array.getClass();
    System.out.println(clazz.getCanonicalName()); // int[] が出力される

    String a = new String("10");
    Class clazz2 = a.getClass();
    System.out.println(clazz2.getCanonicalName()); // java.lang.String

    // 5-2 配列型変数の宣言 柔軟に対応するため変数型の宣言は21.22どちらでもok
    int[] array_2;
    int array_2_2[];

    int[][] array3_1; // 2次元配列型変数の宣言
    int array3_2[][][]; // 3次元配列型変数の宣言
    int[] array4_1[]; // これも2次元配列型変数の宣言
    int[][] array4_2[]; // これも3次元配列型変数の宣言

    // 5-3 配列型変数(今回だと int[]
    // には、配列インスタンスへの参照を代入するだけで、参照先の配列がいくつの要素を扱えるかは関係ない。よって次のコードはコンパイルエラー
    // int array_3[2];
    // int[1] array_3_2;

    // 5-4 配列インスタンスの生成には、必ず扱える要素数を指定する 以下はコンパイルエラー
    // int a_4[] new int[2][3]; 配列１に対し、２を代入しようとしている
    // int[] b_4 = new int[2.3]; 必ず整数である必要
    // int f_4[][] = new int[][3]; 1次元の要素を省略できない

    // 5-5 配列インスタンスを生成しただけでは、要素の中身が作られることはない
    int[] array_5 = new int[3];
    System.out.print(array_5[0] + " " + array_5[1]); // 0 0 が出力される
    array_5[2] = 10;
    System.out.println("");
    System.out.println(array_5[2]); // 10が出力

    // 以下のコードはjava.lang.NullPointerException:という例外になる
    Item[] items = new Item[3]; // 配列インスタンスを作成しているのであって、要素の中身は作られてない。
    int total_5 = 0;
    for (int i = 0; i < items.length; i++) {
      // total_5 += items[i].price; // [i]の部分が定義されてないので、オブジェクト型の初期値であるnullが入るよって例外になる
    }
    System.out.println(total_5);

    // 5-6
    String[] array6 = { "A", "B", "C", "D" };
    array6[0] = null; // 要素[0]にnullが代入されただけ
    for (String str : array6) {
      System.out.print(str); // nullBCD
    }

    // 5-7 初期化式{} を使って 配列インスタンスの生成・初期化と配列型変数の宣言と参照の代入
    System.out.println("");
    int[] array7 = { 2, 3 }; // パターン1
    int[] array7_2 = new int[] { 2, 3 }; // パターン2
    // int[] array7_2 = new int[2] { 2, 3 }; 配列の要素数 [2] を指定すると、コンパイルエラーになる
    int[] array7_3 = {}; // 要素0だが、これもエラーではない。

    // int[][] array7_4 = new int[] {}; コンパイルエラー 左は2次元 右は1次元なので
    int[][] array7_5 = new int[][] {}; // 左右の次元数は一致しているので、エラーにはならない。
    int[][] array7_6 = {}; // newを使用せず、初期化式だけでもエラーにはならない。

    // 5-10 cloneメソッド 配列の内容をそのままコピーできるメソッド
    int[][] array10 = { { 1, 2 }, { 1, 2 }, { 1, 2, 3 } };
    int array11[][] = array10.clone();
    System.out.println(array10 == array11); // falseになる 参照先は異なるため
    int total = 0;
    for (int[] tmp : array11) {
      for (int val : tmp) {
        total += val;
      }
    }
    System.out.println(total); // 12が出力される

    int[][] arrayA = { { 1, 2 }, { 1, 2 }, { 1, 2, 3 } };
    int arrayB[][] = arrayA;
    System.out.println(arrayA == arrayB); // 代入は同じ参照先を示すのでtrue

  }
}
