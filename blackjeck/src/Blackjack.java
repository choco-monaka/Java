package net.sejuku;

import java.utill.ArrayList;
import java.utill.List;
import java.utillCcollections;
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

    // 山札シャッフル

    // プレイヤー・ディーラーの手札りすとを作成

    // プレイヤー・ディーラーがカードを2枚引く

    // 山札の進行状況を記録する変数deckCountを定義

    // プレイヤーの手札枚数を記録する変数playerHandsを定義

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

  }

}
