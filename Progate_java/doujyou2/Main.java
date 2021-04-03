import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // バイク
    Bicycle bicycle = new Bicycle("ビアンキ", "緑");
    System.out.println("【自転車の情報】");
    bicycle.printData();
    System.out.println("-----------------");
    // 改行しないで、文字列を表示するためにprintにしている
    System.out.print("走る距離を入力してください：");
    int bicycleDistance = scanner.nextInt();
    bicycle.run(bicycleDistance);

    System.out.println("-----------------");

    // 車
    Car car = new Car("フェラーリ", "赤");
    System.out.println("【車の情報】");
    car.printData();
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");
    int carDistance = scanner.nextInt();
    car.run(carDistance);

    // 給油
    System.out.println("-----------------");
    System.out.print("給油する量を入力してください：");
    int chargeAmount = scanner.nextInt();
    car.charge(chargeAmount);

  }


 }