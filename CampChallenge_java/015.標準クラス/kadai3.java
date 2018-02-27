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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class kadai3 {// Javaクラスファイル内
//    「2016年11月4日 10時0分0秒」の情報を持つタイムスタンプ（ミリ秒）を生成し，画面に表示してください。
//その後，さらにこの情報を「2016-11-04 10:00:00」の形式で画面に表示してください。


    public static void main(String[] args) {
        
        Calendar c = Calendar.getInstance();

        // 2016年11月4日 10時0分0秒
        c.set(2016, 10, 4, 10, 0, 0);
        Date d = c.getTime();
        long l = d.getTime();
        System.out.println(l);
        
        
        
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(c.getTime()));
    
    }
}
    

