/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai_class;

/**
 *
 * @author eriko
 */
public class classchallenge1 {
    
    public static void main(String[] args) {
//            Profileのインスタンスを生成
            Profile hito = new Profile();
// 人インスタンスのageフィールドへ年齢設定
            hito.age = 24;
// 人インスタンスのhumanフィールドへの名前設定
            hito.name = "えりこ";
// 人インスタンスのsetHumanメソッドを利用
            hito.setHuman("えりこ", 24);
//人インスタンスのprintHumanメソッドを利用            
            hito.printHuman();

        }
}

// Profileクラスの宣言
    class Profile {
// フィールドの宣言

        public String name = "";
        public int age = 0;
// メソッドの宣言

        public void setHuman(String n, int a) {
            // 引数をフィールドへ設定
            this.name = n;
            this.age = a;
        }

        
// 二つの変数の中身を表示するメソッド
        public void printHuman() {
            System.out.println(name);
            System.out.println(age);

        }

    }






