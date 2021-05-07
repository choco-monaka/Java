import java.util.Arrays;
import java.util.Collections;

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

  }
}
