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
import java.io.*;
public class kadai8 {
// Javaクラスファイル内


    public static void main(String[] args) throws IOException {
        // ファイルオープン
        File fp = new File("/Users/eriko/NetBeansProjects/standardclass/test.txt");

        // 書き込み
        try ( // 書き込み
                FileWriter fw = new FileWriter(fp)) {
            // 書き込み
            fw.write("私の名前はただまえりこです");
            // クローズ
        }
        }
    
}




    


