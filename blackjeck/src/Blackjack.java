package net.sejuku;

import java.util.Collections;
import java.utill.ArrayList;
import java.utill.List;
import java.utill.Ccollections;
import java.utill.Scanner;

/*カード枚数は52枚。ジョーカーは含めない。カードの重複が無いように山札を構築する。
プレイヤー、ディーラーの一対一で対戦するものとし、以下の挙動を取る
初期設定として、プレイヤー・ディーラーが交互に1枚ずつ山札からカードを取り手札とする。
プレイヤーからは自分の手札すべてと、ディーラーの1枚めの手札が確認できる。
（ディーラーの2枚目移行の手札はわからない）

手札はAが1ポイント、2-10がそれぞれ2-10ポイント、J/Q/Kが10ポイントとして計算される。

プレイヤーは手札を1枚追加するか、しないかを選択できる。
手札を追加した場合、21ポイントを超えるとバーストとなり、ゲームに敗北する。
プレイヤーはバーストするか、好きなタイミングで止めるまで手札にカードを追加できる。
ディーラーは手札の合計ポイントが17以上になるまで山札を引き続ける。
ディーラーの手札が21ポイントを超えた場合、バーストしてプレイヤーの勝利。
ディーラーの手札が18以上21以下になったとき次の段階に移行する。

プレイヤー・ディーラーの手札のポイントを比較して、大きいほうが勝利。

ダブルダウン・スプリット・サレンダーなどの特殊ルールは無し。*/

public class Blackjack {

  public static void main(String[] args) {

    System.out.println("ゲーム開始");
    // 空の山札作成
    List<Integer> deck = new ArrayList<>(52);

    // 山札シャッフル

    // プレイヤー・ディーラーの手札リストを作成
    List<Integer> player = new ArrayList<>();
    List<Integer> dealer = new ArrayList<>();

    // プレイヤー・ディーラーがカードを2枚引く
    player.add(deck.get(0));
    dealer.add(deck.get(1));
    player.add(deck.get(2));
    dealer.add(deck.get(3));

    // 山札の進行状況を記録する変数deckCountを定義
    int deckCount = 4;

    // プレイヤーの手札枚数を記録する変数playerHandsを定義
    int playerHands = 2;

    // プレイヤー・ディーラーの手札のポイントを表示
    System.out.println("あなたの1枚目のカードは" + toDescription(player.get(0)));
    System.out.println("ディーラーの1枚目のカードは" + toDescription(dealer.get(0)));

    System.out.println("あなたの2枚目のカードは" + toDescription(player.get(1)));
    System.out.println("ディーラーの1枚目のカードは秘密です");

    // プレイヤー・ディーラーのポイントを集計する
    System.out.println("あなたの現在のポイントは" + playerPoint + "です。");

    // プレイヤーがカードを引くフェーズ

    // ディーラーのが手札を17以上にするまでカードを引くフェーズ

    // ポイントを比較する
    System.out.println("あなたのポイントは" + playerPoint);
    System.out.println("ディーラーのポイントは" + dealerPoint);

    System.out.println("引き分け");
    System.out.println("勝ち");
    System.out.println("負け");

  }

  // 山札(deck)に値を入れ、シャッフルするメソッド
  private static void shuffleDeck(List<Integer> deck) {

    // リストに1-52の連番を代入
    for (int i = 1; i <= 52; i++) {
      deck.add(i);
    }

    // 山札をシャッフル
    Collections.shuffle(deck);

    // リストの中身を確認(デバック用のみ)
    /*
     * for (int i = 0; i < deck.size(); i++) { System.out.println(deck.get(i)); }
     */

  }

  // 手札がバーストしているか判定するメソッド
  private static int sumPoint(List<Integer> list) {

  }

  // 山札の通し番号を得点計算用のポイントに変換するメソッド J/Q/Kは10とする
  private static int toPoint(int num) {

  }

  // 山札の数を(スート)の(ランク)の文字列に置き換えるメソッド
  private static String toDescription(int cardNumber) {

  }

  // 山札の数をカードの数に置き換えるメソッド
  private static int toNumber(int cardNumber) {

  }

  // カード番号をランク(AやJ.Q.K)に変換するメソッド
  private static String toRank(int number) {

  }

  // 山札の数をスート(ハートやスペードなどのマーク)に置き換えるメソッド
  private static String toSuit(int cardNumber) {

  }

}
