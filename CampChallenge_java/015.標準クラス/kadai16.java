/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author eriko
 */
public class kadai1 {

    public static void main(String[] args) throws IOException {
        // ファイルオープン
        File fp = new File("test2.txt");

        // FileWriter作成
        FileWriter fw = new FileWriter(fp);
        // 書き込み

        double a = 9;

        fw.write(+a + "の平方根を求めます。\r\n");

        Date d = new Date();
        SimpleDateFormat sdf
                = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        fw.write("処理を始めます。\r\n");
        fw.write(sdf.format(d) + "開始\r\n");

        fw.write("「" + a + "」の平方根は\r\n");
        fw.write("「" + Math.sqrt(a) + "」です。\r\n");

        Date dd = new Date();
        fw.write("処理を終わります。\r\n");
        fw.write(sdf.format(dd) + "終了\r\n");

        FileReader fr = new FileReader(fp);
        // BufferedReader作成
        BufferedReader br = new BufferedReader(fr);
        // 1行読み出し
        System.out.print(br.readLine());

        br.close();
        // クローズ
        fw.close();
    }
}
