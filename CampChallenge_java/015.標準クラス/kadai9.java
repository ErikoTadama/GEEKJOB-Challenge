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
public class kadai9 {
    // Javaクラスファイル内


public static void main(String[] args) throws FileNotFoundException, IOException {
File fp = new File("/Users/eriko/NetBeansProjects/standardclass/test.txt");

    // FileReader作成
    FileReader fr = new FileReader(fp);
    // BufferedReader作成
    BufferedReader br = new BufferedReader(fr);
    // 1行読み出し
    System.out.print(br.readLine());

    br.close();
  }
    
}
