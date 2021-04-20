// import java.util.Scanner;
package calcapp.main; //プロジェクトフォルダにしないと、よくない？？

import calcapp.logics.CalcLogic; //importすることで、別の完全限定クラスを呼び出すときに、いちいち毎回指定しなくてよい
// calcapp.logicsの全クラスをimportしたいなら、 import calcapp.logics.*;

public class Calc {
  public static void main(String[] args) {
    int a = 10;
    int b = 2;
    int total = CalcLogic.sum(a, b);
    int delta = CalcLogic.minus(a, b);
    System.out.println("足し算" + total + "、引き算" + delta);

  }
}
