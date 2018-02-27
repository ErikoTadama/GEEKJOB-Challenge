/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

/**
 *
 * @author eriko
 */
public class kadai1 {
    //変数を宣言し，自分のメールアドレス（架空のものでも構いません）をその値としてください。
    //その後，String クラスのメソッドを利用して，メールアドレスの「@」以降の文字数を画面に表示してください。

    public static void main(String[] args) {
        String ad = "erikotadamaerikotadama@gmail.com";

        
        
        //取得した文字を変数ad2とする
        String ad2 = ad.substring(22);
        //変数ad2の文字数を調べる
        System.out.println(ad2.length());

        
    }

}
