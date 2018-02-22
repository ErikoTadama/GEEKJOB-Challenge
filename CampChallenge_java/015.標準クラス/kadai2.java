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

 


    // Javaクラスファイル内
import java.util.Date;
import java.text.SimpleDateFormat;

class Sample {
    public static void main(String[] args) {
        // 今日の日付作成
        Date now = new Date();
        // SimpleDateFormat作成
        SimpleDateFormat sdf =
            new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");

        System.out.print(sdf.format(now));
    }
}
   

