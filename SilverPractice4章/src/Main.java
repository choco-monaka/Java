// import java.util.function.ObjIntConsumer;

public class Main {
  public static void main(String[] args) {

    // 4-4 初期化文で複数の変数を宣言する場合、変数は同じ型でないといけない
    // for (int i_4 = 1, long j_4; i_4 < 5; i_4++) {
    // System.out.println(i_4 * j_4);
    // }

    for (int i = 0, j = 0; i < 5 && j < 5; i++) { // 条件文を複数にする場合は倫理演算子を使う
      System.out.println(i++); // さきにiが出力された後にi + 1の計算
      j += i;
    }

    int array_9[][] = new int[][] { { 1, 2 }, { 2, 3, 4 } };
    int total_9 = 0;
    System.out.println(array_9.length); // 数は2つ
    for (int i = 0; i < array_9.length; i++) {
      for (int j = i; j < array_9[i].length; j++) {
        total_9 += array_9[i][j];
        System.out.print(array_9[i][j]);
      }
    }
    System.out.println("");
    System.out.println(total_9);

    // 4-11 2次元配列の拡張for文
    String[][] array_11 = { { "A", "B", "C" } };
    for (Object obj : array_11) {
      System.out.println(obj); // エラーにならないコード
    }

    // 4-13 前置後置インクリメント while文
    int num_13 = 10;
    while (num_13++ <= 10) {
      // 後置インクリメントによって、10 <= 10の判定が行われる。その後10+1実行.
      // 2週目に12<=10の判定の後に、後置インクリメントによって12+1になる よって41行目に13出力
      num_13++; // 11 + 1
    }
    System.out.println(num_13); // 13が出力される

    int num_13_2 = 10;
    do {
      num_13_2++; // 10 + 1
    } while (++num_13_2 < 10); // 前置インクリメントによって11 + 1が実行 その後12 < 10の判定
    System.out.println(num_13_2); // 12が出力

    // 4-15 continue文
    int[] array_15 = { 1, 2, 3, 4, 5 };
    int total_15 = 0;
    for (int i : array_15) {
      if (i % 2 == 0)
        continue; // 条件に合ったときだけ処理をスキップする 2,4が対象
      total_15 += i;
    }
    System.out.println(total_15);

    // 4-16ラベル付きfor文
    sample: for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (3 < j) {
          System.out.println(j);
          break sample; // 60行目 sampleついている最初のfor文のループを抜ける
        }
      }
    }

    // 4-17 さらに複雑なラベル付きfor文
    int total_17 = 0;
    a: for (int i = 0; i < 5; i++) {
      b: for (int j = 0; j < 5; j++) {
        if (i % 2 == 0)
          continue a; // 条件にマッチするとaのループがスキップされる (例)iが0の場合 ラベルaの処理がスキップされ iが1の場合から始まる
        if (3 < j)
          break b; // 条件にマッチするとbの処理が終了する つまりjが4,5の場合total_17に加算されない。
        total_17 += j;
      }
    }
    System.out.println(total_17); // 12が出力される

  }
}
