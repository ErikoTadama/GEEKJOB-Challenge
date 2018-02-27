/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author eriko
 */
public class kadai4 {
//    2015年1月1日 0時0分0秒と2015年12月31日 23時59分59秒の差（ミリ秒）を表示してください。

    public static void main(String[] args) {        
        
        Calendar c1 = Calendar.getInstance();
        
        c1.set(2015, 0, 1, 0, 0, 0);

        // 左側 ... 変数を用意している
        //  Date クラスを変数の型に指定する
        //  d を変数名に指定する
        // 右側 getTime() メソッドを呼び出す
        //  戻り値が Date クラスのインスタンスになる
        Date d1 = c1.getTime();
        long l1 = d1.getTime();
        
        Calendar c2 = Calendar.getInstance();
        c2.set(2015, 11, 31, 23, 59, 59);
        Date d2 = c2.getTime();
        long l2 = d2.getTime();
        
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l2 - l1);
        
    }
}
