/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai_class;

import java.util.ArrayList;
import java.util.Random;

class BlackJack {

    public static void main(String[] args) {
        //インスタンス生成
        Dealer d = new Dealer();
        User u = new User();

        // Dealer のインスタンスから２枚のカードを取得する
        // 取得したカードは一時的に変数に格納する
        System.out.println("ディーラーがカードを2枚引きます。");
        ArrayList<Integer> box = d.deal();
        d.setCard(box);

        System.out.println("ディーラーがユーザーにカードを2枚渡します。");
        ArrayList<Integer> box1 = d.deal();
        u.setCard(box1);

        while (true) {

            //Dealerへのカード追加
            if (d.checkSum() == true) {
                System.out.println("ディーラーはカードをもう1枚引きます。");
                ArrayList<Integer> boxA = d.hit();

                d.setCard(boxA);
                //else だけでok
            } else if (d.checkSum() == false) {
                System.out.println("ディーラーは待ちます。");
            }
            //Userへのカード追加
            if (u.checkSum() == true) {
                System.out.println("ディーラーはユーザーにカードをもう1枚渡します。");
                ArrayList<Integer> boxB = d.hit();

                u.setCard(boxB);
            } else if (u.checkSum() == false) {
                System.out.println("ユーザーは待ちます。");
            }

            if (d.checkSum() == false && u.checkSum() == false) {
                break;
            }

        }

        //結果を判定
        System.out.println("結果を判定します。");
        System.out.println("Dealerの手札は" + d.open() + "です。");
        System.out.println("Userの手札は" + u.open() + "です。");

        boolean userBurst = u.open() > 21;
        boolean dealerBurst = d.open() > 21;

        if (userBurst && dealerBurst) {
            System.out.println("両方バーストです。");
        } else if (userBurst && 22 > d.open()) {
            System.out.println("Dealerの勝ちです。");
        } else if (dealerBurst && 22 > u.open()) {
            System.out.println("Userの勝ちです。");
        } else if (u.open() == d.open()) {
            System.out.print("引き分けです。");
        } else if (u.open() < d.open() && d.open() < 22) {
            System.out.println("Dealerの勝ちです。");
        } else if (d.open() < u.open() && u.open() < 22) {
            System.out.println("Userの勝ちです。");
        }

        // 参考        
        // どちらかがバーストしている場合
        if(userBurst || dealerBurst){                   
            if(!userBurst){
                System.out.println("ユーザーの勝ちです");
            }else if(!dealerBurst){
                System.out.println("ディーラーの勝ちです");                
            }else {
                System.out.println("両方バーストのため引き分けです");
            }
        // 2 人ともバースとしていない場合
        } else{
            if (u.open() == d.open()) {
                System.out.print("引き分けです。");
            } else if (u.open() < d.open()) {
                System.out.println("Dealerの勝ちです。");
            } else if (d.open() < u.open()) {
                System.out.println("Userの勝ちです。");
            }
        }


        
}
}

/**
 *
 * @author eriko
 */
abstract class Human {

    //   abstractな公開メソッド　open
    abstract public int open();

    // abstractな公開メソッド　setCard (ArrayListを引数とする)
    abstract public void setCard(ArrayList<Integer> box);

    //    abstractな公開メソッド　checkSum
    abstract public boolean checkSum();

    //  ArrayList の変数　mycardsの宣言
    ArrayList<Integer> mycards = new ArrayList<>();

}


//Humanクラス継承したDealerクラス
class Dealer extends Human {

//    ArrayListの変数、cardsの宣言
    ArrayList<Integer> cards = new ArrayList<Integer>();

//    初期処理でcardsに全てのトランプを持たせる
// ↓ コンストラクタ（と呼ばれる、特別なメソッド）
// そのクラスのインスタンスが生成されるタイミングで呼び出されるので、
// ここに処理を記述しておくと、「初期処理」を実現することができる。
    public Dealer() {

        for (int n = 0; n < 4; n++) {

            for (int i = 0; i < 13; i++) {
                if (i < 10) {
                    cards.add(i);
                } else {
                    cards.add(10);
                }
            }

        }

    }

    //    公開メソッドdeal 
    public ArrayList<Integer> deal() {
        //dealメソッドの中だけで使えるArrayList dealerbox
        ArrayList<Integer> dealbox = new ArrayList<>();

        //cardsからランダムに２つの数字を取得する
        for (int s = 0; s < 2; s++) {
            //Randomクラスのインスタンスを生成
            Random rand = new Random();
            //乱数を取得
            int index = rand.nextInt(cards.size());
            //cardsからindexを取り除く
            Integer number = cards.remove(index);
            //取得した数字をdealboxに入れる
            dealbox.add(number);
        }
        //dealboxを戻り値にする
        return dealbox;

    }

    //  公開メソッドhit
    public ArrayList<Integer> hit() {
        //hitメソッドの中だけで使えるArrayList hitbox
        ArrayList<Integer> hitbox = new ArrayList<>();

        //Randomクラスのインスタンスを生成
        Random rand = new Random();
        //乱数を取得
        int index = rand.nextInt(cards.size());
        //cardsからindexを取り除く

        Integer number = cards.remove(index);
        //取得した数字をdealboxに入れる
        hitbox.add(number);

        //hitboxを戻り値にする
        return hitbox;
    }

    public void setCard(ArrayList<Integer> box) {

        for (int i = 0; i < box.size(); i++) {
            int hako = box.get(i);
            mycards.add(hako);
        }
    }

    public boolean checkSum() {
        //mycardsの中身を合計する
        int result = 0;

        for (int ii = 0; ii < mycards.size(); ii++) {

            result = result + mycards.get(ii);
        }

//合計した中身が17以上ならfalse,16以下ならtrueを天の声に返す
        if (result > 16) {
            return false;
        } else {
            return true;
        }

    }

    public int open() {

//mycardsの中身を合計する
        int resultA = 0;

        for (int ii = 0; ii < mycards.size(); ii++) {

            resultA = resultA + mycards.get(ii);
        }
//resultを呼び出し元に返す。
        return resultA;
    }

}

//Humanクラス継承したUserクラス
class User extends Human {

    public void setCard(ArrayList<Integer> box) {

        for (int i = 0; i < box.size(); i++) {

            Integer hako = box.get(i);
            mycards.add(hako);
        }

    }

    public boolean checkSum() {
        //mycardsの中身を合計する
        int result = 0;

        for (int ii = 0; ii < mycards.size(); ii++) {

            result = result + mycards.get(ii);
        }
        //合計した中身が17以上ならfalse,16以下ならtrueを天の声に返す
        if (result > 16) {
            return false;
        } else {
            return true;

        }

    }

    public int open() {

//mycardsの中身を合計する
        int resultA = 0;

        for (int ii = 0; ii < mycards.size(); ii++) {

            resultA = resultA + mycards.get(ii);
        }
//resultを呼び出し元に返す。
        return resultA;
    }

}

