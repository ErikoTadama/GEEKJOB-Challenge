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

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class challenge1521 {
//    「2016年1月1日 0時0分0秒」の情報を持つタイムスタンプ（ミリ秒）を生成し，画面に表示してください。
    
    public static void main(String[]args){
        Calendar c = Calendar.getInstance();
        c.set(2015,0,1,0,0,0);
        Date d = c.getTime();
        long l = d.getTime();
        System.out.println(l);
    }
}
    