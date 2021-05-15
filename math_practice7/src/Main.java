import java.util.Arrays;
import java.util.*;

public class Main {
  public static void main(String[] args) {

    int max = 0;
    for (int i = 0; i <= 10; i++) {
      if (i > max) {
        max = i;
      }
    }
    System.out.println("最大値は" + max);

    int[] array = { 10, 30, 40, 21, 5 };
    Arrays.sort(array); // 昇順
    for (int value : array) {
      System.out.print(value + " ");
    }

    int y = 0;
    for (int i = 1; i <= 64; i++) {
      y += i * i * i * i;
    }
    System.out.println(y);

    // バイナリーサーチ
    Scanner scanner = new Scanner(System.in);
    int a[] = { 2, 10, 11, 12, 39, 43, 45, 52, 57, 63, 65, 66, 73, 76, 83, 97 };
    System.out.println("データを入力して下さい: ");
    int x = scanner.nextInt();
    int pos = -1;
    int lower = 0;
    int upper = a.length - 1;
    // もう少し細かく動作できるようにする
    while (lower <= upper) {
      int mid = (lower + upper) / 2;
      if (a[mid] == x) {
        pos = mid;
        break;
      } else if (a[mid] < x) {
        lower = mid + 1;
      } else {
        upper = mid - 1;
      }
    }
    if (pos < 0) {
      System.out.println("見つかりません");
    } else {
      System.out.println(x + "は" + pos + "番目です");
    }

    Sample s = new Sample("sample");
    s.test();

    int[] a;
    a = new int[3];

  }
}
