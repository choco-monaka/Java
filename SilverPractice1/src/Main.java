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
    int b = 0x32;
    int c = 0727;
    System.out.println(a + " " + b + " " + c);

    char ch = 89;
    System.out.println(ch);

  }
}
