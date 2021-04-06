{"filter":false,"title":"Bicycle.java","tooltip":"/Progate_java/doujyou2/Bicycle.java","undoManager":{"mark":1,"position":1,"stack":[[{"start":{"row":0,"column":0},"end":{"row":26,"column":0},"action":"insert","lines":["class Bicycle {","  ","  private String name;","  private String color;","  private int distance = 0;","  ","  // インスタンスの生成時にフィールドに値をセットできるよう、コンストラクタを用意","  // 初期値を0に設定してるのでここにはdistanceをセットしない？","  Bicycle(String name, String color) {","    this.name = name;","    this.color = color;","  }","  ","  public void printData() {","    System.out.println(\"名前：\" + this.name);","    System.out.println(\"色：\" + this.color);","    System.out.println(\"走行距離：\" + this.distance + \"km\");","  }","  ","  public void run(int distance) {","    System.out.println(distance + \"km走ります\");","    this.distance += distance;","    System.out.println(\"走行距離：\" + this.distance + \"km\");","  }","","}",""],"id":1}],[{"start":{"row":1,"column":0},"end":{"row":1,"column":2},"action":"remove","lines":["  "],"id":2},{"start":{"row":5,"column":0},"end":{"row":5,"column":2},"action":"remove","lines":["  "]},{"start":{"row":12,"column":0},"end":{"row":12,"column":2},"action":"remove","lines":["  "]},{"start":{"row":18,"column":0},"end":{"row":18,"column":2},"action":"remove","lines":["  "]}]]},"ace":{"folds":[],"scrolltop":163,"scrollleft":0,"selection":{"start":{"row":26,"column":0},"end":{"row":26,"column":0},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":{"row":10,"state":"start","mode":"ace/mode/java"}},"timestamp":1617455257106,"hash":"cac072951e0184fb2f6f85fb822bb98b286d759c"}