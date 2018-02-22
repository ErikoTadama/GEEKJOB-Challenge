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
import java.util.Calendar;

public class kadai1 {

}

class Sample {

    public static void main(String[] args) {

        // カレンダーインスタンスの作成
        Calendar c = Calendar.getInstance();

        c.set(2016, 0, 1, 0, 0, 0);

        System.out.print(c.getTime());

    }
}
